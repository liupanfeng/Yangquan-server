package com.yangquan.server.service;

import com.yangquan.pojo.SystemNotification;
import com.yangquan.pojo.UserBack;
import com.yangquan.utils.ResponseResult;

/**
 *后台用户 
 */
public interface UserBackService {

	public ResponseResult addUserBack(UserBack systemMessage);
	
	public ResponseResult deleteUserBack(UserBack systemMessage);
	
	public ResponseResult updateUserBack(UserBack systemMessage);
	
	public ResponseResult getUserBack();
	
}
