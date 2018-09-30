package com.cloud.pay.merchant.entity;

import java.math.BigDecimal;
import java.util.Date;

public class MerchantPrepayInfo {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column t_merchant_prepay_info.id
	 *
	 * @mbggenerated Sun Sep 30 11:33:59 CST 2018
	 */
	private Integer id;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column t_merchant_prepay_info.merchant_id
	 *
	 * @mbggenerated Sun Sep 30 11:33:59 CST 2018
	 */
	private Integer merchantId;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column t_merchant_prepay_info.balance
	 *
	 * @mbggenerated Sun Sep 30 11:33:59 CST 2018
	 */
	private BigDecimal balance;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column t_merchant_prepay_info.freeze_amount
	 *
	 * @mbggenerated Sun Sep 30 11:33:59 CST 2018
	 */
	private BigDecimal freezeAmount;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column t_merchant_prepay_info.overdraw
	 *
	 * @mbggenerated Sun Sep 30 11:33:59 CST 2018
	 */
	private Integer overdraw;

	private String digest;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column t_merchant_prepay_info.create_time
	 *
	 * @mbggenerated Sun Sep 30 11:33:59 CST 2018
	 */
	private Date createTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column t_merchant_prepay_info.id
	 *
	 * @return the value of t_merchant_prepay_info.id
	 *
	 * @mbggenerated Sun Sep 30 11:33:59 CST 2018
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column t_merchant_prepay_info.id
	 *
	 * @param id
	 *            the value for t_merchant_prepay_info.id
	 *
	 * @mbggenerated Sun Sep 30 11:33:59 CST 2018
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column t_merchant_prepay_info.merchant_id
	 *
	 * @return the value of t_merchant_prepay_info.merchant_id
	 *
	 * @mbggenerated Sun Sep 30 11:33:59 CST 2018
	 */
	public Integer getMerchantId() {
		return merchantId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column t_merchant_prepay_info.merchant_id
	 *
	 * @param merchantId
	 *            the value for t_merchant_prepay_info.merchant_id
	 *
	 * @mbggenerated Sun Sep 30 11:33:59 CST 2018
	 */
	public void setMerchantId(Integer merchantId) {
		this.merchantId = merchantId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column t_merchant_prepay_info.balance
	 *
	 * @return the value of t_merchant_prepay_info.balance
	 *
	 * @mbggenerated Sun Sep 30 11:33:59 CST 2018
	 */
	public BigDecimal getBalance() {
		return balance;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column t_merchant_prepay_info.balance
	 *
	 * @param balance
	 *            the value for t_merchant_prepay_info.balance
	 *
	 * @mbggenerated Sun Sep 30 11:33:59 CST 2018
	 */
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column t_merchant_prepay_info.freeze_amount
	 *
	 * @return the value of t_merchant_prepay_info.freeze_amount
	 *
	 * @mbggenerated Sun Sep 30 11:33:59 CST 2018
	 */
	public BigDecimal getFreezeAmount() {
		return freezeAmount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column t_merchant_prepay_info.freeze_amount
	 *
	 * @param freezeAmount
	 *            the value for t_merchant_prepay_info.freeze_amount
	 *
	 * @mbggenerated Sun Sep 30 11:33:59 CST 2018
	 */
	public void setFreezeAmount(BigDecimal freezeAmount) {
		this.freezeAmount = freezeAmount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column t_merchant_prepay_info.overdraw
	 *
	 * @return the value of t_merchant_prepay_info.overdraw
	 *
	 * @mbggenerated Sun Sep 30 11:33:59 CST 2018
	 */
	public Integer getOverdraw() {
		return overdraw;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column t_merchant_prepay_info.overdraw
	 *
	 * @param overdraw
	 *            the value for t_merchant_prepay_info.overdraw
	 *
	 * @mbggenerated Sun Sep 30 11:33:59 CST 2018
	 */
	public void setOverdraw(Integer overdraw) {
		this.overdraw = overdraw;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column t_merchant_prepay_info.create_time
	 *
	 * @return the value of t_merchant_prepay_info.create_time
	 *
	 * @mbggenerated Sun Sep 30 11:33:59 CST 2018
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column t_merchant_prepay_info.create_time
	 *
	 * @param createTime
	 *            the value for t_merchant_prepay_info.create_time
	 *
	 * @mbggenerated Sun Sep 30 11:33:59 CST 2018
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDigest() {
		return digest;
	}

	public void setDigest(String digest) {
		this.digest = digest;
	}

}