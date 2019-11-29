package com.yangquan.mapper;

import com.yangquan.pojo.SystemMessage;
import com.yangquan.pojo.SystemMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemMessageMapper {
    int countByExample(SystemMessageExample example);

    int deleteByExample(SystemMessageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SystemMessage record);

    int insertSelective(SystemMessage record);

    List<SystemMessage> selectByExampleWithBLOBs(SystemMessageExample example);

    List<SystemMessage> selectByExample(SystemMessageExample example);

    SystemMessage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SystemMessage record, @Param("example") SystemMessageExample example);

    int updateByExampleWithBLOBs(@Param("record") SystemMessage record, @Param("example") SystemMessageExample example);

    int updateByExample(@Param("record") SystemMessage record, @Param("example") SystemMessageExample example);

    int updateByPrimaryKeySelective(SystemMessage record);

    int updateByPrimaryKeyWithBLOBs(SystemMessage record);

    int updateByPrimaryKey(SystemMessage record);
}