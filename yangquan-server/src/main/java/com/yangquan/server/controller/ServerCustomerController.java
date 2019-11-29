package com.yangquan.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yangquan.pojo.ServerCustomer;
import com.yangquan.server.service.ServerCustomerService;
import com.yangquan.utils.ExceptionUtil;
import com.yangquan.utils.ResponseResult;

@Controller
@RequestMapping("/server_customer")
public class ServerCustomerController {


	@Autowired
	private ServerCustomerService service;
	
	
	@RequestMapping("/add")
	@ResponseBody
	public ResponseResult addServerCustomer(ServerCustomer serverCustomer){
		try {
			return service.addServerCustomer(serverCustomer);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	
	@RequestMapping("/delete")
	@ResponseBody
	public ResponseResult deleteServerCustomer(ServerCustomer serverCustomer){
		try {
			return service.deleteServerCustomer(serverCustomer);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	
	@RequestMapping("/update")
	@ResponseBody
	public ResponseResult updateServerCustomer(ServerCustomer serverCustomer){
		try {
			return service.updateServerCustomer(serverCustomer);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	
	@RequestMapping("/select")
	@ResponseBody
	public ResponseResult getServerCustomer(int userType){
		try {
			return service.getServerCustomer(userType);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
}
