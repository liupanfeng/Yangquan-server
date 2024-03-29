package com.yangquan.server.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yangquan.mapper.UserTokenMapper;
import com.yangquan.pojo.UserToken;
import com.yangquan.pojo.UserTokenExample;
import com.yangquan.server.service.UserTokenService;
import com.yangquan.utils.ResponseResult;

@Service
public class UserTokenServiceImpl implements UserTokenService{

	@Autowired
	private UserTokenMapper mapper;
	
	@Override
	public ResponseResult addUserToken(UserToken userToken) {
		userToken.setCreateTime(new Date());
		mapper.insert(userToken);
		return ResponseResult.build(200, "添加Token成功！", userToken);
	}

	@Override
	public ResponseResult deleteUserToken(long userId) {
		UserTokenExample example=new UserTokenExample();
		example.createCriteria().andUserIdEqualTo(userId);
		mapper.deleteByExample(example);
		return ResponseResult.build(200, "删除Token成功！");
	}

	@Override
	public ResponseResult updateUserToken(UserToken userToken) {
		mapper.updateByPrimaryKey(userToken);
		return ResponseResult.build(200, "更新Token成功！", userToken);
	}

	@Override
	public ResponseResult getUserToken(long usreId) {
		UserTokenExample example=new UserTokenExample();
		example.createCriteria().andIdIsNotNull();
		List<UserToken> list=mapper.selectByExample(example);
		if(list==null||list.isEmpty()){
			return ResponseResult.build(404, "未查到任何Token消息");
		}
		return ResponseResult.build(200, "查找Token消息成功！", list);
	}

}
