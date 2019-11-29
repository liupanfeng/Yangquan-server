package com.yangquan.mapper;

import com.yangquan.pojo.ServerCustomer;
import com.yangquan.pojo.ServerCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServerCustomerMapper {
    int countByExample(ServerCustomerExample example);

    int deleteByExample(ServerCustomerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ServerCustomer record);

    int insertSelective(ServerCustomer record);

    List<ServerCustomer> selectByExampleWithBLOBs(ServerCustomerExample example);

    List<ServerCustomer> selectByExample(ServerCustomerExample example);

    ServerCustomer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ServerCustomer record, @Param("example") ServerCustomerExample example);

    int updateByExampleWithBLOBs(@Param("record") ServerCustomer record, @Param("example") ServerCustomerExample example);

    int updateByExample(@Param("record") ServerCustomer record, @Param("example") ServerCustomerExample example);

    int updateByPrimaryKeySelective(ServerCustomer record);

    int updateByPrimaryKeyWithBLOBs(ServerCustomer record);

    int updateByPrimaryKey(ServerCustomer record);
}