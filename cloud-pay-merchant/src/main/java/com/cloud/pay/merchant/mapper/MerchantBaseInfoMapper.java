package com.cloud.pay.merchant.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cloud.pay.merchant.dto.MerchantDTO;
import com.cloud.pay.merchant.entity.MerchantBaseInfo;

public interface MerchantBaseInfoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table t_merchant_base_info
	 *
	 * @mbggenerated Fri Aug 31 22:03:46 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table t_merchant_base_info
	 *
	 * @mbggenerated Fri Aug 31 22:03:46 CST 2018
	 */
	int insert(MerchantBaseInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table t_merchant_base_info
	 *
	 * @mbggenerated Fri Aug 31 22:03:46 CST 2018
	 */
	int insertSelective(MerchantBaseInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table t_merchant_base_info
	 *
	 * @mbggenerated Fri Aug 31 22:03:46 CST 2018
	 */
	MerchantBaseInfo selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table t_merchant_base_info
	 *
	 * @mbggenerated Fri Aug 31 22:03:46 CST 2018
	 */
	int updateByPrimaryKeySelective(MerchantBaseInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table t_merchant_base_info
	 *
	 * @mbggenerated Fri Aug 31 22:03:46 CST 2018
	 */
	int updateByPrimaryKey(MerchantBaseInfo record);

	List<MerchantDTO> getMerchantDTOs(@Param("type") String type);

	List<MerchantDTO> getMerchantList(@Param("orgId") Integer orgId, @Param("code") String code,
			@Param("name") String name, @Param("startTime") Date startTime, @Param("endTime") Date endTime);
}