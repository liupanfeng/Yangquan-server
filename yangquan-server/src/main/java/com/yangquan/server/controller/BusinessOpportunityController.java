package com.yangquan.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yangquan.pojo.BusinessOpportunity;
import com.yangquan.server.service.BusinessOpportunityService;
import com.yangquan.utils.ExceptionUtil;
import com.yangquan.utils.ResponseResult;

//我的商机
@Controller
@RequestMapping("/business_opportunity")
public class BusinessOpportunityController {
	
	@Autowired
	private BusinessOpportunityService service;
	
	@RequestMapping("/add")
	@ResponseBody
	public ResponseResult addBusinessOpportunity(BusinessOpportunity businessOpportunity){
		try {
			return service.addBusinessOpportunity(businessOpportunity);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	

	@RequestMapping("/delete")
	@ResponseBody
	public ResponseResult deleteBusinessOpportunity(BusinessOpportunity businessOpportunity){
		try {
			return service.deleteBusinessOpportunity(businessOpportunity);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public ResponseResult updateBusinessOpportunity(BusinessOpportunity businessOpportunity){
		try {
			return service.updateBusinessOpportunity(businessOpportunity);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	@RequestMapping("/select")
	@ResponseBody
	public ResponseResult selectBusinessOpportunity(long userId){
		try {
			return service.getBusinessOpportunity(userId);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
}
