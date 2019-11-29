package com.yangquan.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yangquan.pojo.SystemMessage;
import com.yangquan.pojo.SystemNotification;
import com.yangquan.server.service.SystemMessageService;
import com.yangquan.utils.ExceptionUtil;
import com.yangquan.utils.ResponseResult;

@Controller
@RequestMapping("/system_message")
public class SystemMessageController {

	@Autowired
	private SystemMessageService service;
	
	
	@RequestMapping("/add")
	@ResponseBody
	public ResponseResult addSystemMessage(SystemMessage systemMessage){
		try {
			return service.addSystemMessage(systemMessage);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	
	@RequestMapping("/delete")
	@ResponseBody
	public ResponseResult deleteSystemMessage(SystemMessage systemMessage){
		try {
			return service.deleteSystemMessage(systemMessage);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	
	@RequestMapping("/update")
	@ResponseBody
	public ResponseResult updateSystemMessage(SystemMessage systemMessage){
		try {
			return service.updateSystemMessage(systemMessage);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	
	@RequestMapping("/select")
	@ResponseBody
	public ResponseResult selectSystemMessage(){
		try {
			return service.getSystemMessage();
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
}
