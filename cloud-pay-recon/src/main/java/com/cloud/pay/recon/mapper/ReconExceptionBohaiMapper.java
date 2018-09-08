package com.cloud.pay.recon.mapper;

import com.cloud.pay.recon.dto.ReconExceptionBohaiDTO;
import com.cloud.pay.recon.entity.ReconExceptionBohai;
import com.cloud.pay.recon.entity.ReconExceptionBohaiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReconExceptionBohaiMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_recon_exception_trade
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    int countByExample(ReconExceptionBohaiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_recon_exception_trade
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    int deleteByExample(ReconExceptionBohaiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_recon_exception_trade
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_recon_exception_trade
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    int insert(ReconExceptionBohai record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_recon_exception_trade
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    int insertSelective(ReconExceptionBohai record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_recon_exception_trade
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    List<ReconExceptionBohai> selectByExample(ReconExceptionBohaiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_recon_exception_trade
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    ReconExceptionBohai selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_recon_exception_trade
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    int updateByExampleSelective(@Param("record") ReconExceptionBohai record, @Param("example") ReconExceptionBohaiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_recon_exception_trade
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    int updateByExample(@Param("record") ReconExceptionBohai record, @Param("example") ReconExceptionBohaiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_recon_exception_trade
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    int updateByPrimaryKeySelective(ReconExceptionBohai record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_recon_exception_trade
     *
     * @mbggenerated Thu Sep 06 23:00:02 CST 2018
     */
    int updateByPrimaryKey(ReconExceptionBohai record);
    
    /**
      * 生成短款异常数据
     * @param reconDate
     */
    int insertShortPlat(@Param("reconDate") String reconDate,@Param("channelId")  Integer channelId, @Param("reocnId")  Integer reocnId,
    		@Param("exceptionType")Integer exceptionType);
    
    /**
      * 根据渠道编号获取异常数据数量
     * @param channelId
     * @return
     */
    Long selectCountByChannelId(@Param("channelId")Integer channelId,@Param("reconId")Integer reconId);
    
    /**
      * 查询异常数据明细
     * @param channdId
     * @param reconId
     * @return
     */
    List<ReconExceptionBohaiDTO> selectListByParam(@Param("channelId")Integer channelId,@Param("reconId")Integer reconId,
    		@Param("orderNo") String orderNo,@Param("exceptionType")Integer exceptionType);
    
    /**
     * 根据对账Id删除异常明细
     * @param reconId
     * @return
     */
    int deleteByReconId(Integer reconId);
}