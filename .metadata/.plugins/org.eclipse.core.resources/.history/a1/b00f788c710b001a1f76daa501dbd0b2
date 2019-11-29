package com.yangquan.mapper;

import com.yangquan.pojo.ServiceMessage;
import com.yangquan.pojo.ServiceMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceMessageMapper {
    int countByExample(ServiceMessageExample example);

    int deleteByExample(ServiceMessageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ServiceMessage record);

    int insertSelective(ServiceMessage record);

    List<ServiceMessage> selectByExample(ServiceMessageExample example);

    ServiceMessage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ServiceMessage record, @Param("example") ServiceMessageExample example);

    int updateByExample(@Param("record") ServiceMessage record, @Param("example") ServiceMessageExample example);

    int updateByPrimaryKeySelective(ServiceMessage record);

    int updateByPrimaryKey(ServiceMessage record);
}