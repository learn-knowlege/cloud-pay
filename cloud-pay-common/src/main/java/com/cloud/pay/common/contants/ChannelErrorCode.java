package com.cloud.pay.common.contants;

public interface ChannelErrorCode {
     
    public final static String ERROR_0001 = "0001"; //请求参数校验不通过
    
    public final static String ERROR_0002 = "0002"; //请求渠道参数错误
    
    public final static String ERROR_0003 = "0003"; //商户未配置渠道
    
    public final static String ERROR_1000 = "1000"; //余额不足
    
    public final static String ERROR_1001 = "1001"; //交易不存在
    
    public final static String ERROR_1002 = "1002"; //上传批量文件失败
    
    public final static String ERROR_1003 = "1003"; //生成批量文件失败
    
    public final static String ERROR_2001 = "2001"; //对账文件不存在
    
    public final static String ERROR_9000 = "9000";//系统异常（如果是代付请求，返回该错误，需要通过获取订单状态）
    
    public final static String ERROR_9001 = "9001";//其他异常
    
}
