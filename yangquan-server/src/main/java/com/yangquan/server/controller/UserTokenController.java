package com.yangquan.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yangquan.pojo.UserBack;
import com.yangquan.pojo.UserToken;
import com.yangquan.server.service.UserBackService;
import com.yangquan.server.service.UserTokenService;
import com.yangquan.utils.ExceptionUtil;
import com.yangquan.utils.ResponseResult;

@Controller
@RequestMapping("/token")
public class UserTokenController {

	@Autowired
	private UserTokenService service;
	
	
	@RequestMapping("/add")
	@ResponseBody
	public ResponseResult addUserToken(UserToken userToken){
		try {
			return service.addUserToken(userToken);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	
	@RequestMapping("/delete")
	@ResponseBody
	public ResponseResult deleteUserToken(long userId){
		try {
			return service.deleteUserToken(userId);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	
	@RequestMapping("/update")
	@ResponseBody
	public ResponseResult updateUserToken(UserToken userToken){
		try {
			return service.updateUserToken(userToken);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	
	@RequestMapping("/select")
	@ResponseBody
	public ResponseResult getUserToken(long userId){
		try {
			return service.getUserToken(userId);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
}
