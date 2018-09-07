package com.cloud.pay.recon.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ReconExceptionBohai {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recon_exception_trade.ID
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    private Integer id;
    
    
    private Integer channelId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recon_exception_trade.ORDER_NO
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    private String orderNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recon_exception_trade.PAYER_ACCOUNT
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    private String payerAccount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recon_exception_trade.PAYER_NAME
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    private String payerName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recon_exception_trade.PAYEE_ACCOUNT
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    private String payeeAccount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recon_exception_trade.PAYEE_NAME
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    private String payeeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recon_exception_trade.BANK_CODE
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    private String bankCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recon_exception_trade.TRADE_AMOUNT
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    private BigDecimal tradeAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recon_exception_trade.TRADE_STATUS
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    private String tradeStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recon_exception_trade.TRADE_STATUS_DESC
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    private String tradeStatusDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recon_exception_trade.EXCEPTION_REASON
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    private String exceptionReason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recon_exception_trade.CREATE_TIME
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recon_exception_trade.ID
     *
     * @return the value of t_recon_exception_trade.ID
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recon_exception_trade.ID
     *
     * @param id the value for t_recon_exception_trade.ID
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recon_exception_trade.ORDER_NO
     *
     * @return the value of t_recon_exception_trade.ORDER_NO
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recon_exception_trade.ORDER_NO
     *
     * @param orderNo the value for t_recon_exception_trade.ORDER_NO
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recon_exception_trade.PAYER_ACCOUNT
     *
     * @return the value of t_recon_exception_trade.PAYER_ACCOUNT
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    public String getPayerAccount() {
        return payerAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recon_exception_trade.PAYER_ACCOUNT
     *
     * @param payerAccount the value for t_recon_exception_trade.PAYER_ACCOUNT
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    public void setPayerAccount(String payerAccount) {
        this.payerAccount = payerAccount == null ? null : payerAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recon_exception_trade.PAYER_NAME
     *
     * @return the value of t_recon_exception_trade.PAYER_NAME
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    public String getPayerName() {
        return payerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recon_exception_trade.PAYER_NAME
     *
     * @param payerName the value for t_recon_exception_trade.PAYER_NAME
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    public void setPayerName(String payerName) {
        this.payerName = payerName == null ? null : payerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recon_exception_trade.PAYEE_ACCOUNT
     *
     * @return the value of t_recon_exception_trade.PAYEE_ACCOUNT
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    public String getPayeeAccount() {
        return payeeAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recon_exception_trade.PAYEE_ACCOUNT
     *
     * @param payeeAccount the value for t_recon_exception_trade.PAYEE_ACCOUNT
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    public void setPayeeAccount(String payeeAccount) {
        this.payeeAccount = payeeAccount == null ? null : payeeAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recon_exception_trade.PAYEE_NAME
     *
     * @return the value of t_recon_exception_trade.PAYEE_NAME
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    public String getPayeeName() {
        return payeeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recon_exception_trade.PAYEE_NAME
     *
     * @param payeeName the value for t_recon_exception_trade.PAYEE_NAME
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName == null ? null : payeeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recon_exception_trade.BANK_CODE
     *
     * @return the value of t_recon_exception_trade.BANK_CODE
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recon_exception_trade.BANK_CODE
     *
     * @param bankCode the value for t_recon_exception_trade.BANK_CODE
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recon_exception_trade.TRADE_AMOUNT
     *
     * @return the value of t_recon_exception_trade.TRADE_AMOUNT
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    public BigDecimal getTradeAmount() {
        return tradeAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recon_exception_trade.TRADE_AMOUNT
     *
     * @param tradeAmount the value for t_recon_exception_trade.TRADE_AMOUNT
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    public void setTradeAmount(BigDecimal tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recon_exception_trade.TRADE_STATUS
     *
     * @return the value of t_recon_exception_trade.TRADE_STATUS
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    public String getTradeStatus() {
        return tradeStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recon_exception_trade.TRADE_STATUS
     *
     * @param tradeStatus the value for t_recon_exception_trade.TRADE_STATUS
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus == null ? null : tradeStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recon_exception_trade.TRADE_STATUS_DESC
     *
     * @return the value of t_recon_exception_trade.TRADE_STATUS_DESC
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    public String getTradeStatusDesc() {
        return tradeStatusDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recon_exception_trade.TRADE_STATUS_DESC
     *
     * @param tradeStatusDesc the value for t_recon_exception_trade.TRADE_STATUS_DESC
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    public void setTradeStatusDesc(String tradeStatusDesc) {
        this.tradeStatusDesc = tradeStatusDesc == null ? null : tradeStatusDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recon_exception_trade.EXCEPTION_REASON
     *
     * @return the value of t_recon_exception_trade.EXCEPTION_REASON
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    public String getExceptionReason() {
        return exceptionReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recon_exception_trade.EXCEPTION_REASON
     *
     * @param exceptionReason the value for t_recon_exception_trade.EXCEPTION_REASON
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    public void setExceptionReason(String exceptionReason) {
        this.exceptionReason = exceptionReason == null ? null : exceptionReason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recon_exception_trade.CREATE_TIME
     *
     * @return the value of t_recon_exception_trade.CREATE_TIME
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recon_exception_trade.CREATE_TIME
     *
     * @param createTime the value for t_recon_exception_trade.CREATE_TIME
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	public Integer getChannelId() {
		return channelId;
	}

	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}
    
    
}