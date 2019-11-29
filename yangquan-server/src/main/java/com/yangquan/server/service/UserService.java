package com.yangquan.server.service;

import com.yangquan.pojo.User;
import com.yangquan.utils.ResponseResult;

public interface UserService {
	
	/**
	 * 用户注册
	 * @param user
	 * @return
	 */
	public ResponseResult createUser(User user);
	
	/**
	 * 用户登录
	 * @param phoneNum 手机号
	 * @return
	 */
	public ResponseResult userLogin(String phoneNum);
	
	/**
	 * 更新用户信息   这个接口用于补充用于信息
	 * @param user
	 * @return
	 */
	public ResponseResult updateUser(User user);
	
	/**
	 * 用户删除
	 * @param user
	 * @return
	 */
	public ResponseResult deleteUser(User user);
	
	
	
	
}
