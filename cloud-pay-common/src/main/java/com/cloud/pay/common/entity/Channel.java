package com.cloud.pay.common.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Channel {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_channel.id
     *
     * @mbggenerated Sun Aug 26 21:07:44 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_channel.channel_name
     *
     * @mbggenerated Sun Aug 26 21:07:44 CST 2018
     */
    private String channelName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_channel.channel_merchant_id
     *
     * @mbggenerated Sun Aug 26 21:07:44 CST 2018
     */
    private String channelMerchantId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_channel.channel_type
     *
     * @mbggenerated Sun Aug 26 21:07:44 CST 2018
     */
    private Integer channelType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_channel.fee_type
     *
     * @mbggenerated Sun Aug 26 21:07:44 CST 2018
     */
    private Integer feeType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_channel.fee
     *
     * @mbggenerated Sun Aug 26 21:07:44 CST 2018
     */
    private BigDecimal fee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_channel.creator
     *
     * @mbggenerated Sun Aug 26 21:07:44 CST 2018
     */
    private String creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_channel.create_time
     *
     * @mbggenerated Sun Aug 26 21:07:44 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_channel.modifer
     *
     * @mbggenerated Sun Aug 26 21:07:44 CST 2018
     */
    private String modifer;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_channel.modify_time
     *
     * @mbggenerated Sun Aug 26 21:07:44 CST 2018
     */
    private Date modifyTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_channel.id
     *
     * @return the value of t_channel.id
     *
     * @mbggenerated Sun Aug 26 21:07:44 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_channel.id
     *
     * @param id the value for t_channel.id
     *
     * @mbggenerated Sun Aug 26 21:07:44 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_channel.channel_name
     *
     * @return the value of t_channel.channel_name
     *
     * @mbggenerated Sun Aug 26 21:07:44 CST 2018
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_channel.channel_name
     *
     * @param channelName the value for t_channel.channel_name
     *
     * @mbggenerated Sun Aug 26 21:07:44 CST 2018
     */
    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_channel.channel_merchant_id
     *
     * @return the value of t_channel.channel_merchant_id
     *
     * @mbggenerated Sun Aug 26 21:07:44 CST 2018
     */
    public String getChannelMerchantId() {
        return channelMerchantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_channel.channel_merchant_id
     *
     * @param channelMerchantId the value for t_channel.channel_merchant_id
     *
     * @mbggenerated Sun Aug 26 21:07:44 CST 2018
     */
    public void setChannelMerchantId(String channelMerchantId) {
        this.channelMerchantId = channelMerchantId == null ? null : channelMerchantId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_channel.channel_type
     *
     * @return the value of t_channel.channel_type
     *
     * @mbggenerated Sun Aug 26 21:07:44 CST 2018
     */
    public Integer getChannelType() {
        return channelType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_channel.channel_type
     *
     * @param channelType the value for t_channel.channel_type
     *
     * @mbggenerated Sun Aug 26 21:07:44 CST 2018
     */
    public void setChannelType(Integer channelType) {
        this.channelType = channelType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_channel.fee_type
     *
     * @return the value of t_channel.fee_type
     *
     * @mbggenerated Sun Aug 26 21:07:44 CST 2018
     */
    public Integer getFeeType() {
        return feeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_channel.fee_type
     *
     * @param feeType the value for t_channel.fee_type
     *
     * @mbggenerated Sun Aug 26 21:07:44 CST 2018
     */
    public void setFeeType(Integer feeType) {
        this.feeType = feeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_channel.fee
     *
     * @return the value of t_channel.fee
     *
     * @mbggenerated Sun Aug 26 21:07:44 CST 2018
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_channel.fee
     *
     * @param fee the value for t_channel.fee
     *
     * @mbggenerated Sun Aug 26 21:07:44 CST 2018
     */
    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_channel.creator
     *
     * @return the value of t_channel.creator
     *
     * @mbggenerated Sun Aug 26 21:07:44 CST 2018
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_channel.creator
     *
     * @param creator the value for t_channel.creator
     *
     * @mbggenerated Sun Aug 26 21:07:44 CST 2018
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_channel.create_time
     *
     * @return the value of t_channel.create_time
     *
     * @mbggenerated Sun Aug 26 21:07:44 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_channel.create_time
     *
     * @param createTime the value for t_channel.create_time
     *
     * @mbggenerated Sun Aug 26 21:07:44 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_channel.modifer
     *
     * @return the value of t_channel.modifer
     *
     * @mbggenerated Sun Aug 26 21:07:44 CST 2018
     */
    public String getModifer() {
        return modifer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_channel.modifer
     *
     * @param modifer the value for t_channel.modifer
     *
     * @mbggenerated Sun Aug 26 21:07:44 CST 2018
     */
    public void setModifer(String modifer) {
        this.modifer = modifer == null ? null : modifer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_channel.modify_time
     *
     * @return the value of t_channel.modify_time
     *
     * @mbggenerated Sun Aug 26 21:07:44 CST 2018
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_channel.modify_time
     *
     * @param modifyTime the value for t_channel.modify_time
     *
     * @mbggenerated Sun Aug 26 21:07:44 CST 2018
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}