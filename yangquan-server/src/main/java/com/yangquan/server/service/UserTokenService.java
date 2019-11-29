package com.yangquan.server.service;

import com.yangquan.pojo.UserToken;
import com.yangquan.utils.ResponseResult;

public interface UserTokenService {
	
	public ResponseResult addUserToken(UserToken userToken);
	
	public ResponseResult deleteUserToken(long userId);
	
	public ResponseResult updateUserToken(UserToken userToken);
	
	public ResponseResult getUserToken(long userId);
	

}