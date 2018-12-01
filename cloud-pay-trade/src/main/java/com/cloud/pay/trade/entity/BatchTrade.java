package com.cloud.pay.trade.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BatchTrade {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column t_batch_trade.id
	 *
	 * @mbggenerated Mon Sep 10 20:34:33 CST 2018
	 */
	private Integer id;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column t_batch_trade.batch_no
	 *
	 * @mbggenerated Mon Sep 10 20:34:33 CST 2018
	 */
	private String batchNo;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column t_batch_trade.trade_time
	 *
	 * @mbggenerated Mon Sep 10 20:34:33 CST 2018
	 */
	private Date tradeTime;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column t_batch_trade.total_amount
	 *
	 * @mbggenerated Mon Sep 10 20:34:33 CST 2018
	 */
	private BigDecimal totalAmount;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column t_batch_trade.total_count
	 *
	 * @mbggenerated Mon Sep 10 20:34:33 CST 2018
	 */
	private Integer totalCount;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column t_batch_trade.payer_merchant_id
	 *
	 * @mbggenerated Mon Sep 10 20:34:33 CST 2018
	 */
	private Integer payerMerchantId;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column t_batch_trade.status
	 *
	 * @mbggenerated Mon Sep 10 20:34:33 CST 2018
	 */
	private Integer status;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column t_batch_trade.creator
	 *
	 * @mbggenerated Mon Sep 10 20:34:33 CST 2018
	 */
	private String creator;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column t_batch_trade.create_time
	 *
	 * @mbggenerated Mon Sep 10 20:34:33 CST 2018
	 */
	private Date createTime;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column t_batch_trade.auditor
	 *
	 * @mbggenerated Mon Sep 10 20:34:33 CST 2018
	 */
	private String auditor;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column t_batch_trade.audit_time
	 *
	 * @mbggenerated Mon Sep 10 20:34:33 CST 2018
	 */
	private Date auditTime;
	
	
	private String platBatchNo;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column t_batch_trade.id
	 *
	 * @return the value of t_batch_trade.id
	 *
	 * @mbggenerated Mon Sep 10 20:34:33 CST 2018
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column t_batch_trade.id
	 *
	 * @param id
	 *            the value for t_batch_trade.id
	 *
	 * @mbggenerated Mon Sep 10 20:34:33 CST 2018
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column t_batch_trade.batch_no
	 *
	 * @return the value of t_batch_trade.batch_no
	 *
	 * @mbggenerated Mon Sep 10 20:34:33 CST 2018
	 */
	public String getBatchNo() {
		return batchNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column t_batch_trade.batch_no
	 *
	 * @param batchNo
	 *            the value for t_batch_trade.batch_no
	 *
	 * @mbggenerated Mon Sep 10 20:34:33 CST 2018
	 */
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo == null ? null : batchNo.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column t_batch_trade.trade_time
	 *
	 * @return the value of t_batch_trade.trade_time
	 *
	 * @mbggenerated Mon Sep 10 20:34:33 CST 2018
	 */
	public Date getTradeTime() {
		return tradeTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column t_batch_trade.trade_time
	 *
	 * @param tradeTime
	 *            the value for t_batch_trade.trade_time
	 *
	 * @mbggenerated Mon Sep 10 20:34:33 CST 2018
	 */
	public void setTradeTime(Date tradeTime) {
		this.tradeTime = tradeTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column t_batch_trade.total_amount
	 *
	 * @return the value of t_batch_trade.total_amount
	 *
	 * @mbggenerated Mon Sep 10 20:34:33 CST 2018
	 */
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column t_batch_trade.total_amount
	 *
	 * @param totalAmount
	 *            the value for t_batch_trade.total_amount
	 *
	 * @mbggenerated Mon Sep 10 20:34:33 CST 2018
	 */
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column t_batch_trade.total_count
	 *
	 * @return the value of t_batch_trade.total_count
	 *
	 * @mbggenerated Mon Sep 10 20:34:33 CST 2018
	 */
	public Integer getTotalCount() {
		return totalCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column t_batch_trade.total_count
	 *
	 * @param totalCount
	 *            the value for t_batch_trade.total_count
	 *
	 * @mbggenerated Mon Sep 10 20:34:33 CST 2018
	 */
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column t_batch_trade.payer_merchant_id
	 *
	 * @return the value of t_batch_trade.payer_merchant_id
	 *
	 * @mbggenerated Mon Sep 10 20:34:33 CST 2018
	 */
	public Integer getPayerMerchantId() {
		return payerMerchantId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column t_batch_trade.payer_merchant_id
	 *
	 * @param payerMerchantId
	 *            the value for t_batch_trade.payer_merchant_id
	 *
	 * @mbggenerated Mon Sep 10 20:34:33 CST 2018
	 */
	public void setPayerMerchantId(Integer payerMerchantId) {
		this.payerMerchantId = payerMerchantId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column t_batch_trade.status
	 *
	 * @return the value of t_batch_trade.status
	 *
	 * @mbggenerated Mon Sep 10 20:34:33 CST 2018
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column t_batch_trade.status
	 *
	 * @param status
	 *            the value for t_batch_trade.status
	 *
	 * @mbggenerated Mon Sep 10 20:34:33 CST 2018
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column t_batch_trade.creator
	 *
	 * @return the value of t_batch_trade.creator
	 *
	 * @mbggenerated Mon Sep 10 20:34:33 CST 2018
	 */
	public String getCreator() {
		return creator;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column t_batch_trade.creator
	 *
	 * @param creator
	 *            the value for t_batch_trade.creator
	 *
	 * @mbggenerated Mon Sep 10 20:34:33 CST 2018
	 */
	public void setCreator(String creator) {
		this.creator = creator == null ? null : creator.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column t_batch_trade.create_time
	 *
	 * @return the value of t_batch_trade.create_time
	 *
	 * @mbggenerated Mon Sep 10 20:34:33 CST 2018
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column t_batch_trade.create_time
	 *
	 * @param createTime
	 *            the value for t_batch_trade.create_time
	 *
	 * @mbggenerated Mon Sep 10 20:34:33 CST 2018
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column t_batch_trade.auditor
	 *
	 * @return the value of t_batch_trade.auditor
	 *
	 * @mbggenerated Mon Sep 10 20:34:33 CST 2018
	 */
	public String getAuditor() {
		return auditor;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column t_batch_trade.auditor
	 *
	 * @param auditor
	 *            the value for t_batch_trade.auditor
	 *
	 * @mbggenerated Mon Sep 10 20:34:33 CST 2018
	 */
	public void setAuditor(String auditor) {
		this.auditor = auditor == null ? null : auditor.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column t_batch_trade.audit_time
	 *
	 * @return the value of t_batch_trade.audit_time
	 *
	 * @mbggenerated Mon Sep 10 20:34:33 CST 2018
	 */
	public Date getAuditTime() {
		return auditTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column t_batch_trade.audit_time
	 *
	 * @param auditTime
	 *            the value for t_batch_trade.audit_time
	 *
	 * @mbggenerated Mon Sep 10 20:34:33 CST 2018
	 */
	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}

	private String auditOptinion;

	public String getAuditOptinion() {
		return auditOptinion;
	}

	public void setAuditOptinion(String auditOptinion) {
		this.auditOptinion = auditOptinion;
	}

	
	public String getPlatBatchNo() {
		return platBatchNo;
	}

	public void setPlatBatchNo(String platBatchNo) {
		this.platBatchNo = platBatchNo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BatchTrade [id=");
		builder.append(id);
		builder.append(", batchNo=");
		builder.append(batchNo);
		builder.append(", tradeTime=");
		builder.append(tradeTime);
		builder.append(", totalAmount=");
		builder.append(totalAmount);
		builder.append(", totalCount=");
		builder.append(totalCount);
		builder.append(", payerMerchantId=");
		builder.append(payerMerchantId);
		builder.append(", status=");
		builder.append(status);
		builder.append(", creator=");
		builder.append(creator);
		builder.append(", createTime=");
		builder.append(createTime);
		builder.append(", auditor=");
		builder.append(auditor);
		builder.append(", auditTime=");
		builder.append(auditTime);
		builder.append(", auditOptinion=");
		builder.append(auditOptinion);
		builder.append("]");
		return builder.toString();
	}
	
}