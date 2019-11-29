package com.yangquan.server.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yangquan.mapper.UserBackMapper;
import com.yangquan.pojo.User;
import com.yangquan.pojo.UserBack;
import com.yangquan.pojo.UserBackExample;
import com.yangquan.pojo.UserExample;
import com.yangquan.server.service.UserBackService;
import com.yangquan.utils.IDUtils;
import com.yangquan.utils.ResponseResult;

@Service
public class UserBackServiceImpl implements UserBackService{
	
	@Autowired
	private UserBackMapper mapper;
	
	@Override
	public ResponseResult addUserBack(UserBack userBack) {
		
		UserBackExample example=new UserBackExample();
		example.createCriteria().andUsernameEqualTo(userBack.getUsername());
		List<UserBack> list = mapper.selectByExample(example);
		if (list == null || list.isEmpty()) {
			userBack.setCreateTime(new Date());
			mapper.insert(userBack);
			return ResponseResult.build(200, "注册成功！",userBack);
		}
		return ResponseResult.build(401, "该账号已经注册，请登录！",userBack);
		
	}

	@Override
	public ResponseResult deleteUserBack(UserBack userBack) {
		mapper.deleteByPrimaryKey(userBack.getId());
		return ResponseResult.build(200, "删除后台用户成功！", userBack);
	}

	@Override
	public ResponseResult updateUserBack(UserBack userBack) {
		mapper.updateByPrimaryKey(userBack);
		return ResponseResult.build(200, "更新后台用户成功！", userBack);
	}

	@Override
	public ResponseResult getUserBack() {
		UserBackExample example=new UserBackExample();
		example.createCriteria().andIdIsNotNull();
		List<UserBack> list=mapper.selectByExample(example);
		if(list==null||list.isEmpty()){
			return ResponseResult.build(404, "未查到任何后台用户消息");
		}
		return ResponseResult.build(200, "查找后台用户消息成功！", list);
	}

}