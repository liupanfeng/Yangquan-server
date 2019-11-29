package com.yangquan.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yangquan.pojo.SystemNotification;
import com.yangquan.server.service.SystemNotificationService;
import com.yangquan.utils.ExceptionUtil;
import com.yangquan.utils.ResponseResult;

/**
 * 系统通知
 * @author 86188
 *
 */
@Controller
@RequestMapping("/notification")
public class SystemNotificationController {
	@Autowired
	private SystemNotificationService service;
	
	@RequestMapping("/add")
	@ResponseBody
	public ResponseResult addSystemNotification(SystemNotification systemNotification){
		try {
			return service.addSystemNotification(systemNotification);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	
	@RequestMapping("/delete")
	@ResponseBody
	public ResponseResult deleteSystemNotification(SystemNotification systemNotification){
		try {
			return service.deleteSystemNotification(systemNotification);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	
	@RequestMapping("/update")
	@ResponseBody
	public ResponseResult updateSystemNotification(SystemNotification systemNotification){
		try {
			return service.updateSystemNotification(systemNotification);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	
	@RequestMapping("/select")
	@ResponseBody
	public ResponseResult selectSystemNotification(){
		try {
			return service.selectSystemNotification();
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
}