package com.yangquan.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yangquan.pojo.ServerZan;
import com.yangquan.pojo.SystemNotification;
import com.yangquan.pojo.User;
import com.yangquan.server.service.ServerZanService;
import com.yangquan.server.service.SystemNotificationService;
import com.yangquan.utils.ExceptionUtil;
import com.yangquan.utils.ResponseResult;

@Controller
@RequestMapping("/zan")
public class ServerZanController {
	
	@Autowired
	private ServerZanService service;
	
	
	@RequestMapping("/add")
	@ResponseBody
	public ResponseResult addServerZan(ServerZan serverZan){
		try {
			return service.addServerZan(serverZan);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	

	@RequestMapping("/delete")
	@ResponseBody
	public ResponseResult deleteServerZan(ServerZan serverZan){
		try {
			return service.deleteServerZan(serverZan);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	@RequestMapping("/select")
	@ResponseBody
	public ResponseResult selectServerZan(User user){
		try {
			return service.getServerZan(user);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
}
