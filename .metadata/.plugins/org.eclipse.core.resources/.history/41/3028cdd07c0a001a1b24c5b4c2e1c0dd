package com.yangquan.mapper;

import com.yangquan.pojo.ServerZan;
import com.yangquan.pojo.ServerZanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServerZanMapper {
    int countByExample(ServerZanExample example);

    int deleteByExample(ServerZanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ServerZan record);

    int insertSelective(ServerZan record);

    List<ServerZan> selectByExample(ServerZanExample example);

    ServerZan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ServerZan record, @Param("example") ServerZanExample example);

    int updateByExample(@Param("record") ServerZan record, @Param("example") ServerZanExample example);

    int updateByPrimaryKeySelective(ServerZan record);

    int updateByPrimaryKey(ServerZan record);
}