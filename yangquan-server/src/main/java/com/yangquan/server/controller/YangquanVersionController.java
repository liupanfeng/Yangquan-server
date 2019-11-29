package com.yangquan.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yangquan.pojo.YangquanVersion;
import com.yangquan.server.service.YangquanVersionService;
import com.yangquan.utils.ExceptionUtil;
import com.yangquan.utils.ResponseResult;

@Controller
@RequestMapping("/version")
public class YangquanVersionController {
	
	@Autowired
	private YangquanVersionService service;
	
	
	@RequestMapping("/add")
	@ResponseBody
	public ResponseResult addYangquanVersion(YangquanVersion yangquanVersion){
		try {
			return service.addYangquanVersion(yangquanVersion);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	
	@RequestMapping("/delete")
	@ResponseBody
	public ResponseResult deleteYangquanVersion(YangquanVersion yangquanVersion){
		try {
			return service.deleteYangquanVersion(yangquanVersion);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	
	@RequestMapping("/update")
	@ResponseBody
	public ResponseResult updateYangquanVersion(YangquanVersion yangquanVersion){
		try {
			return service.updateYangquanVersion(yangquanVersion);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	
	@RequestMapping("/select")
	@ResponseBody
	public ResponseResult getYangquanVersion(){
		try {
			return service.getYangquanVersion();
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
}
