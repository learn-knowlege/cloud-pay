package com.cloud.pay.admin.controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cloud.pay.admin.controller.base.BaseController;
import com.cloud.pay.admin.entity.Const;
import com.cloud.pay.admin.entity.ResponseModel;
import com.cloud.pay.admin.entity.ResultEnum;
import com.cloud.pay.admin.entity.User;
import com.cloud.pay.admin.util.Jurisdiction;
import com.cloud.pay.admin.util.ParameterMap;
import com.cloud.pay.channel.service.ICloudApiService;
import com.cloud.pay.channel.vo.BatchPayTradeQueryReqVO;
import com.cloud.pay.channel.vo.BatchPayTradeQueryResVO;
import com.cloud.pay.merchant.service.MerchantService;
import com.cloud.pay.trade.dto.BatchTradeDTO;
import com.cloud.pay.trade.entity.BatchTrade;
import com.cloud.pay.trade.service.BatchTradeService;
import com.cloud.pay.trade.service.TradeService;

@Controller
@RequestMapping("/batchTrade")
public class BatchTradeController extends BaseController{
	
	private Logger log = LoggerFactory.getLogger(BatchTradeController.class);
	
	@Autowired
	private BatchTradeService batchTradeService;
	
	@Autowired
	private TradeService tradeService;
	
	@Autowired
	private MerchantService merchantService;
	
	private String menuUrl = "batchTrade/list";
	
	@Autowired
	private ICloudApiService payService;
	
	private static final String SEQ_OFFSET = "00000000";
	private AtomicInteger seq = new AtomicInteger(0);
	
	/**
	 * 手工代付
	 * @return
	 */
	@RequestMapping(value="/handPay",method=RequestMethod.GET)
	public Object handPay(Model model){
		if(!Jurisdiction.buttonJurisdiction("batchTrade/handPay","query", this.getSession())){return ResponseModel.getModel(ResultEnum.NOT_AUTH, null);}
		model.addAttribute("merchants", merchantService.getMerchantDTOs(null));
		model.addAttribute("meid", ((User)this.getSession().getAttribute(Const.SESSION_USER)).getUserId());
		return "page/batchTrade/handPay";
	}
	
	@RequestMapping(value = "/download", method = RequestMethod.GET)
    public void download(HttpServletRequest req, HttpServletResponse res) {
      res.setHeader("content-type", "application/octet-stream");
      res.setContentType("application/octet-stream");
      HSSFWorkbook workbook = new HSSFWorkbook();
      HSSFSheet sheet = workbook.createSheet("手工代付");
      String fileName = "手工代付.xls";
      String[] headers = { "收款人账户名","收款人账户类型(选填)","收款人账户","收款人账户联行号","收款银行名称(选填)","交易金额","附言"};
      HSSFRow row = sheet.createRow(0);
      for(int i=0;i<headers.length;i++){
          HSSFCell cell = row.createCell(i);
          HSSFRichTextString text = new HSSFRichTextString(headers[i]);
          cell.setCellValue(text);
      }
      try {
      	res.setHeader("Content-disposition", "attachment;filename=" + URLEncoder.encode(fileName, "utf-8"));
			res.flushBuffer();
			workbook.write(res.getOutputStream());
		} catch (IOException e) {
			log.error("导出手工代付异常，{}", e);
		} finally {
			if(workbook != null) {
				try {
					workbook.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
    }
	
	/**
	 * 上传
	 * @return
	 */
	@RequestMapping(value="/upload",method=RequestMethod.POST)
	@ResponseBody
	public Object upload(){
		if(!Jurisdiction.buttonJurisdiction("batchTrade/handPay","add", this.getSession())){return ResponseModel.getModel(ResultEnum.NOT_AUTH, null);}
		try {
			BatchTrade batchTrade = new BatchTrade();
			ParameterMap map = this.getParameterMap();
			log.info("手工代付上传交易入参：{}", map);
			Integer loaning = Integer.parseInt(map.getString("loaning"));
			Integer payerMerchantId = Integer.parseInt(map.getString("payerMerchantId"));
			batchTrade.setPayerMerchantId(payerMerchantId);
			batchTrade.setBatchNo(getBatchNo());
			batchTrade.setStatus(1);
			batchTrade.setTradeTime(new Date());
			String payFilePath = map.getString("payFilePath");
			String userId = ((User) this.getSession().getAttribute(Const.SESSION_USER)).getUsername();
			batchTrade.setCreator(userId);
			batchTrade.setCreateTime(new Date());
			String returnInfo = batchTradeService.upload(batchTrade, payFilePath.replace("data:application/vnd.ms-excel;base64,", ""), loaning);
			if(StringUtils.isNotBlank(returnInfo)) {
				return ResponseModel.getModel("提交失败:" + returnInfo, "failed", null);
			}
		} catch (Exception e) {
			e.printStackTrace();
			log.error("error:{}", e);
			return ResponseModel.getModel("提交失败:"+e.getMessage(), "failed", null);
		}
		return ResponseModel.getModel("ok", "success", null);
	}
	
	private String getBatchNo() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmssSSS");
		final String date = sdf.format(new Date());
		final int value = seq.incrementAndGet();
		String temp = (SEQ_OFFSET + String.valueOf(value));
		temp = temp.substring(temp.length() - SEQ_OFFSET.length());
		return date + temp;
	}
	
	/**
	 * 批量交易列表
	 * @return
	 */
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public Object list(Model model, Integer status, String createDateBegin,
			String createDateEnd){
		if(!Jurisdiction.buttonJurisdiction(menuUrl,"query", this.getSession())){return ResponseModel.getModel(ResultEnum.NOT_AUTH, null);}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date startTime = null;
		Date endTime = null;
		try {
			if(StringUtils.isNotBlank(createDateBegin)) {
				startTime = sdf.parse(createDateBegin);
			}
			if(StringUtils.isNotBlank(createDateEnd)) {
				endTime = sdf.parse(createDateEnd);
			}
		} catch(Exception e) {
		}
		User user = ((User) this.getSession().getAttribute(Const.SESSION_USER));
		model.addAttribute("batchTrades", batchTradeService.getBatchTradeList(status, startTime, endTime, 
				user.getMerchantId(), user.getMerchantType()));
		model.addAttribute("meid", ((User)this.getSession().getAttribute(Const.SESSION_USER)).getUserId());
		return "page/batchTrade/list";
	}
	
	/**
	 * 审核列表
	 * @return
	 */
	@RequestMapping(value="/toAudit",method=RequestMethod.GET)
	public Object toAudit(Model model, Integer tradeId, String batchNo, Integer merchantId){
		if(!Jurisdiction.buttonJurisdiction(menuUrl,"query", this.getSession())){return ResponseModel.getModel(ResultEnum.NOT_AUTH, null);}
		model.addAttribute("trades", tradeService.selectByBatchNo(batchNo));
		model.addAttribute("tradeId", tradeId);
		model.addAttribute("batchNo", batchNo);
		model.addAttribute("merchantId", merchantId);
		model.addAttribute("meid", ((User)this.getSession().getAttribute(Const.SESSION_USER)).getUserId());
		return "page/batchTrade/audit";
	}
	
	
	/**
	 * 审核批量交易
	 * @return
	 */
	@RequestMapping(value="/audit",method=RequestMethod.POST)
	@ResponseBody
	public Object audit(){
		if(!Jurisdiction.buttonJurisdiction(menuUrl,"edit", this.getSession())){return ResponseModel.getModel(ResultEnum.NOT_AUTH, null);}
		try {
			BatchTrade batchTrade = new BatchTrade();
			ParameterMap map = this.getParameterMap();
			log.info("批量交易审核入参：{}", map);
			batchTrade.setStatus(Integer.parseInt(map.getString("status")));
			batchTrade.setBatchNo(map.getString("batchNo"));
			batchTrade.setId(Integer.parseInt(map.getString("id")));
			String smsCode = map.getString("smsCode");
			//TODO 验证短信验证码
			log.info("验证短信验证码:{}", smsCode);
			String userId = ((User) this.getSession().getAttribute(Const.SESSION_USER)).getUsername();
			batchTrade.setAuditor(userId);
			batchTrade.setAuditTime(new Date());
			batchTrade.setId(Integer.parseInt(map.getString("id")));
			batchTradeService.audit(batchTrade, smsCode);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("error:{}", e);
			return ResponseModel.getModel("提交失败:"+e.getMessage(), "failed", null);
		}
		return ResponseModel.getModel("ok", "success", null);
	}
	
	/**
	 * 获取短信验证码
	 * @return
	 */
	@RequestMapping(value="/getSmsCode",method=RequestMethod.POST)
	@ResponseBody
	public Object getSmsCode(){
		if(!Jurisdiction.buttonJurisdiction(menuUrl,"edit", this.getSession())){return ResponseModel.getModel(ResultEnum.NOT_AUTH, null);}
		try {
			ParameterMap map = this.getParameterMap();
			String batchNo = map.getString("batchNo");
			Integer payerMerchantId = Integer.parseInt(map.getString("merchantId"));
			batchTradeService.getSmsCode(batchNo, payerMerchantId);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("error:{}", e);
			return ResponseModel.getModel("提交失败:"+e.getMessage(), "failed", null);
		}
		return ResponseModel.getModel("ok", "success", null);
	}
	
	/**
	 * 查询批量代付结果
	 * @return
	 */
	@RequestMapping(value="/queryResult",method=RequestMethod.POST)
	@ResponseBody
	public Object queryBatchTradeResult(){
		if(!Jurisdiction.buttonJurisdiction(menuUrl,"edit", this.getSession())){return ResponseModel.getModel(ResultEnum.NOT_AUTH, null);}
		String res = null;
		try {
			ParameterMap map = this.getParameterMap();
			log.info("批量交易代付结果查询入参：{}", map);
			String batchNo = map.getString("batchNo");
			Integer payerMerchantId = Integer.parseInt(map.getString("merchantId"));
			BatchTradeDTO dto = batchTradeService.getBatchByBatchNo(batchNo, payerMerchantId);
			BatchPayTradeQueryReqVO reqVO = new BatchPayTradeQueryReqVO();
			reqVO.setBatchOrderNo(dto.getPlatBatchNo());
			reqVO.setMerchantId(payerMerchantId);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
			reqVO.setTradeDate(sdf.format(new Date()));
			reqVO.setFileName(dto.getFileName());
			reqVO.setOrderNo(dto.getPlatBatchNo());
			log.info("批量查询入参：{}", reqVO);
			BatchPayTradeQueryResVO resVO = payService.batchPayQuery(reqVO);
			log.info("批量查询结果：{}", resVO);
			if(resVO == null || resVO.getStatus() == null && 99 == resVO.getStatus()) {
				//交易结果未知，返回处理中
				if(resVO.getRespMsg() != null) {
					return ResponseModel.getModel("ok", "success", "批量代付处理中，" + resVO.getRespMsg());
				}
				return ResponseModel.getModel("ok", "success", "批量代付处理中");
			}
			res = batchTradeService.dealBatchTrade(batchNo, payerMerchantId, resVO);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("error:{}", e);
			return ResponseModel.getModel("查询失败:"+e.getMessage(), "failed", null);
		}
		return ResponseModel.getModel("ok", "success", res);
	}
}
