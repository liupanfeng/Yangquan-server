package com.yangquan.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yangquan.pojo.ServiceMessage;
import com.yangquan.server.service.ServiceMessageService;
import com.yangquan.utils.ExceptionUtil;
import com.yangquan.utils.ResponseResult;

@Controller
@RequestMapping("/service_message")
public class ServiceMessageController {
	
	@Autowired
	private ServiceMessageService service;
	
	
	@RequestMapping("/add")
	@ResponseBody
	public ResponseResult addServiceMessage(ServiceMessage serviceMessage){
		try {
			return service.addServiceMessage(serviceMessage);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	
	@RequestMapping("/delete")
	@ResponseBody
	public ResponseResult deleteServiceMessage(ServiceMessage serviceMessage){
		try {
			return service.deleteServiceMessage(serviceMessage);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	
	@RequestMapping("/update")
	@ResponseBody
	public ResponseResult updateServiceMessage(ServiceMessage serviceMessage){
		try {
			return service.updateServiceMessage(serviceMessage);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	
	@RequestMapping("/select")
	@ResponseBody
	public ResponseResult getServiceMessage(){
		try {
			return service.getServiceMessage();
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
}
