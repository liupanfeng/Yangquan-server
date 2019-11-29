package com.yangquan.mapper;

import com.yangquan.pojo.BusinessOpportunity;
import com.yangquan.pojo.BusinessOpportunityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessOpportunityMapper {
    int countByExample(BusinessOpportunityExample example);

    int deleteByExample(BusinessOpportunityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusinessOpportunity record);

    int insertSelective(BusinessOpportunity record);

    List<BusinessOpportunity> selectByExampleWithBLOBs(BusinessOpportunityExample example);

    List<BusinessOpportunity> selectByExample(BusinessOpportunityExample example);

    BusinessOpportunity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusinessOpportunity record, @Param("example") BusinessOpportunityExample example);

    int updateByExampleWithBLOBs(@Param("record") BusinessOpportunity record, @Param("example") BusinessOpportunityExample example);

    int updateByExample(@Param("record") BusinessOpportunity record, @Param("example") BusinessOpportunityExample example);

    int updateByPrimaryKeySelective(BusinessOpportunity record);

    int updateByPrimaryKeyWithBLOBs(BusinessOpportunity record);

    int updateByPrimaryKey(BusinessOpportunity record);
}