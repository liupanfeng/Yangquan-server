package com.yangquan.mapper;

import com.yangquan.pojo.SheepNews;
import com.yangquan.pojo.SheepNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SheepNewsMapper {
    int countByExample(SheepNewsExample example);

    int deleteByExample(SheepNewsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SheepNews record);

    int insertSelective(SheepNews record);

    List<SheepNews> selectByExampleWithBLOBs(SheepNewsExample example);

    List<SheepNews> selectByExample(SheepNewsExample example);

    SheepNews selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SheepNews record, @Param("example") SheepNewsExample example);

    int updateByExampleWithBLOBs(@Param("record") SheepNews record, @Param("example") SheepNewsExample example);

    int updateByExample(@Param("record") SheepNews record, @Param("example") SheepNewsExample example);

    int updateByPrimaryKeySelective(SheepNews record);

    int updateByPrimaryKeyWithBLOBs(SheepNews record);

    int updateByPrimaryKey(SheepNews record);
}