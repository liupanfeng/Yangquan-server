package com.yangquan.mapper;

import com.yangquan.pojo.UserToken;
import com.yangquan.pojo.UserTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTokenMapper {
    int countByExample(UserTokenExample example);

    int deleteByExample(UserTokenExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserToken record);

    int insertSelective(UserToken record);

    List<UserToken> selectByExample(UserTokenExample example);

    UserToken selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserToken record, @Param("example") UserTokenExample example);

    int updateByExample(@Param("record") UserToken record, @Param("example") UserTokenExample example);

    int updateByPrimaryKeySelective(UserToken record);

    int updateByPrimaryKey(UserToken record);
}