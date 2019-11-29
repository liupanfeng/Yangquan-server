package com.yangquan.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yangquan.pojo.HistoryPrice;
import com.yangquan.pojo.Message;
import com.yangquan.pojo.SheepNews;
import com.yangquan.server.service.MessageService;
import com.yangquan.utils.ExceptionUtil;
import com.yangquan.utils.ResponseResult;

@Controller
@RequestMapping("/message")
public class MessageController {
	
	@Autowired
	private MessageService service;
	
	@RequestMapping("/add")
	@ResponseBody
	public ResponseResult addMessage(Message message){
		try {
			return service.addMessage(message);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	

	@RequestMapping("/delete")
	@ResponseBody
	public ResponseResult deleteMessage(Message message){
		try {
			return service.deleteMessage(message);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public ResponseResult updateMessage(Message message){
		try {
			return service.updateMessage(message);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	@RequestMapping("/select")
	@ResponseBody
	public ResponseResult selectMessage(int userType){
		try {
			return service.getMessage(userType);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	
	
}
