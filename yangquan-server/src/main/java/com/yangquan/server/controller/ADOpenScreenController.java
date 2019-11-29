package com.yangquan.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yangquan.pojo.AdOpenScreen;
import com.yangquan.server.service.ADOpenScreenService;
import com.yangquan.utils.ExceptionUtil;
import com.yangquan.utils.ResponseResult;

@Controller
@RequestMapping("/ad")
public class ADOpenScreenController {

	@Autowired
	private ADOpenScreenService adOpenScreenService;
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	@ResponseBody
	public ResponseResult addADOpenScreen(AdOpenScreen adOpenScreen){
		try {
			return adOpenScreenService.createOpenScreenAD(adOpenScreen);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}
	
	@RequestMapping(value="/modify",method=RequestMethod.POST)
	@ResponseBody
	public ResponseResult modifyADOpenScreen(AdOpenScreen adOpenScreen){
		try {
			return adOpenScreenService.modifyOpenScreenAD(adOpenScreen);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	@ResponseBody
	public ResponseResult deleteADOpenScreen(AdOpenScreen adOpenScreen){
		try {
			return adOpenScreenService.deleteOpenScreenAD(adOpenScreen);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}
	
	@RequestMapping(value="/select",method=RequestMethod.POST)
	@ResponseBody
	public ResponseResult getADOpenScreen(){
		try {
			return adOpenScreenService.selectOpenScreenAD();
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}
	
}
