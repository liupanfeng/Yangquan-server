package com.yangquan.mapper;

import com.yangquan.pojo.YangquanVersion;
import com.yangquan.pojo.YangquanVersionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YangquanVersionMapper {
    int countByExample(YangquanVersionExample example);

    int deleteByExample(YangquanVersionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YangquanVersion record);

    int insertSelective(YangquanVersion record);

    List<YangquanVersion> selectByExample(YangquanVersionExample example);

    YangquanVersion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YangquanVersion record, @Param("example") YangquanVersionExample example);

    int updateByExample(@Param("record") YangquanVersion record, @Param("example") YangquanVersionExample example);

    int updateByPrimaryKeySelective(YangquanVersion record);

    int updateByPrimaryKey(YangquanVersion record);
}