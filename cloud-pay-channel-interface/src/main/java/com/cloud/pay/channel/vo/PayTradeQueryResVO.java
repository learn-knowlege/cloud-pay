package com.cloud.pay.channel.vo;

import java.math.BigDecimal;

/**
 * 代付结果查询响应参数
 * @author wangy
 */
public class PayTradeQueryResVO extends BaseTradeResVO {
  
	private String accountDate;
	
	private String payerAccount;
	
	private String payerName;
	
	private String payeeAccount;
	
	private String payeeName;
	
	private String payeeBankCode;
	
	private BigDecimal amt;
	
	private String postscript;
	
	private Integer status;
	
	private static final long serialVersionUID = -4615181137957415914L;
	
	public PayTradeQueryResVO(String errorCode,String errorMessage) {
		super(errorCode, errorMessage);
	}

	public PayTradeQueryResVO(String respCode,String errorCode,String errorMessage) {
		super(errorCode,errorMessage);
		this.respCode = respCode;
	}
	
	public PayTradeQueryResVO(Integer merchantId, String orderNo, String respMsg) {
		super(merchantId, orderNo, respMsg);
	}

	public PayTradeQueryResVO(Integer merchantId,String orderNo,String respCode,String errorCode,String errorMessage) {
		super(merchantId, orderNo, respCode, errorCode, errorMessage);
	}

	public String getAccountDate() {
		return accountDate;
	}

	public void setAccountDate(String accountDate) {
		this.accountDate = accountDate;
	}

	public String getPayerAccount() {
		return payerAccount;
	}

	public void setPayerAccount(String payerAccount) {
		this.payerAccount = payerAccount;
	}

	public String getPayerName() {
		return payerName;
	}

	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}

	public String getPayeeAccount() {
		return payeeAccount;
	}

	public void setPayeeAccount(String payeeAccount) {
		this.payeeAccount = payeeAccount;
	}

	public String getPayeeName() {
		return payeeName;
	}

	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public String getPayeeBankCode() {
		return payeeBankCode;
	}

	public void setPayeeBankCode(String payeeBankCode) {
		this.payeeBankCode = payeeBankCode;
	}

	public BigDecimal getAmt() {
		return amt;
	}

	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	public String getPostscript() {
		return postscript;
	}

	public void setPostscript(String postscript) {
		this.postscript = postscript;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
}
