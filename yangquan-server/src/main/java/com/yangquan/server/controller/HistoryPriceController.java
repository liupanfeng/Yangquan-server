package com.yangquan.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yangquan.pojo.HistoryPrice;
import com.yangquan.pojo.SheepNews;
import com.yangquan.server.service.HistoryPriceService;
import com.yangquan.utils.ExceptionUtil;
import com.yangquan.utils.ResponseResult;

@Controller
@RequestMapping("/history_price")
public class HistoryPriceController {

	@Autowired
	private HistoryPriceService service;
	
	@RequestMapping("/add")
	@ResponseBody
	public ResponseResult addHistoryPrice(HistoryPrice historyPrice){
		try {
			return service.addHistoryPrice(historyPrice);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	

	@RequestMapping("/delete")
	@ResponseBody
	public ResponseResult deleteHistoryPrice(HistoryPrice serverZan){
		try {
			return service.deleteHistoryPrice(serverZan);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public ResponseResult updateHistoryPrice(HistoryPrice historyPrice){
		try {
			return service.updateHistoryPrice(historyPrice);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	@RequestMapping("/select")
	@ResponseBody
	public ResponseResult selectHistoryPrice(SheepNews sheepNews){
		try {
			return service.getHistoryPrice(sheepNews);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
}