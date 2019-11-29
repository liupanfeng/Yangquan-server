package com.yangquan.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yangquan.pojo.ServerZan;
import com.yangquan.pojo.SheepNews;
import com.yangquan.pojo.SystemNotification;
import com.yangquan.pojo.User;
import com.yangquan.server.service.ServerZanService;
import com.yangquan.server.service.SheepNewsService;
import com.yangquan.utils.ExceptionUtil;
import com.yangquan.utils.ResponseResult;

@Controller
@RequestMapping("/sheep_news")
public class SheepNewsController {

	@Autowired
	private SheepNewsService service;
	
	@RequestMapping("/add")
	@ResponseBody
	public ResponseResult addSheepNews(SheepNews sheepNews){
		try {
			String sheepType=sheepNews.getSheepType();
			ResponseResult result=selectSheepNews();
			if(result!=null&&result.getData()!=null){
				List<SheepNews> list=(List<SheepNews>) result.getData();
				for(SheepNews news:list){
					if (news.getSheepType().equals(sheepType)) {
						news.setCreateTime(sheepNews.getCreateTime());
						news.setRemarks(sheepNews.getRemarks());
						news.setSheepName(sheepNews.getSheepName());
						news.setSheepPrice(sheepNews.getSheepPrice());
						return updateSheepNews(news);
					}
				}
			}
			return service.addSheepNews(sheepNews);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}
	

	@RequestMapping("/delete")
	@ResponseBody
	public ResponseResult deleteSheepNews(SheepNews sheepNews){
		try {
			return service.deleteSheepNews(sheepNews);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public ResponseResult updateSheepNews(SheepNews sheepNews){
		try {
			return service.updateSheepNews(sheepNews);
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	
	@RequestMapping("/select")
	@ResponseBody
	public ResponseResult selectSheepNews(){
		try {
			return service.getSheepNews();
		} catch (Exception e) {
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
}
