package com.yangquan.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yangquan.pojo.Comment;
import com.yangquan.server.service.CommentService;
import com.yangquan.utils.ExceptionUtil;
import com.yangquan.utils.ResponseResult;

@Controller
@RequestMapping("/comment")
public class CommentController {

	@Autowired
	private CommentService service;
	
	@RequestMapping("/add")
	@ResponseBody
	public ResponseResult addComment(Comment comment){
		try {
			return service.addComment(comment);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	

	@RequestMapping("/delete")
	@ResponseBody
	public ResponseResult deleteComment(Comment comment){
		try {
			return service.deleteComment(comment);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public ResponseResult updateComment(Comment comment){
		try {
			return service.updateComment(comment);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	@RequestMapping("/select")
	@ResponseBody
	public ResponseResult selectComment(long messageId){
		try {
			return service.getComment(messageId);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
}
