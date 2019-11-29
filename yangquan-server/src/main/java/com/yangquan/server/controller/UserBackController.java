package com.yangquan.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yangquan.pojo.SystemMessage;
import com.yangquan.pojo.UserBack;
import com.yangquan.server.service.SystemMessageService;
import com.yangquan.server.service.UserBackService;
import com.yangquan.utils.ExceptionUtil;
import com.yangquan.utils.ResponseResult;

@Controller
@RequestMapping("/user_back")
public class UserBackController {
	
	@Autowired
	private UserBackService service;
	
	
	@RequestMapping("/add")
	@ResponseBody
	public ResponseResult addUserBack(UserBack userBack){
		try {
			return service.addUserBack(userBack);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	
	@RequestMapping("/delete")
	@ResponseBody
	public ResponseResult deleteUserBack(UserBack userBack){
		try {
			return service.deleteUserBack(userBack);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	
	@RequestMapping("/update")
	@ResponseBody
	public ResponseResult updateUserBack(UserBack userBack){
		try {
			return service.updateUserBack(userBack);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	
	@RequestMapping("/select")
	@ResponseBody
	public ResponseResult getUserBack(){
		try {
			return service.getUserBack();
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
}
