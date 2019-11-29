package com.yangquan.mapper;

import com.yangquan.pojo.UserBack;
import com.yangquan.pojo.UserBackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBackMapper {
    int countByExample(UserBackExample example);

    int deleteByExample(UserBackExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserBack record);

    int insertSelective(UserBack record);

    List<UserBack> selectByExample(UserBackExample example);

    UserBack selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserBack record, @Param("example") UserBackExample example);

    int updateByExample(@Param("record") UserBack record, @Param("example") UserBackExample example);

    int updateByPrimaryKeySelective(UserBack record);

    int updateByPrimaryKey(UserBack record);
}