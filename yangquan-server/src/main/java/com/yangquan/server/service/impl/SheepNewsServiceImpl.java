package com.yangquan.server.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yangquan.mapper.SheepNewsMapper;
import com.yangquan.pojo.SheepNews;
import com.yangquan.pojo.SheepNewsExample;
import com.yangquan.pojo.SystemNotification;
import com.yangquan.pojo.SystemNotificationExample;
import com.yangquan.server.service.SheepNewsService;
import com.yangquan.utils.ResponseResult;

@Service
public class SheepNewsServiceImpl implements SheepNewsService{
	
	@Autowired 
	private SheepNewsMapper mapper;

	public ResponseResult addSheepNews(SheepNews sheepNews) {
		sheepNews.setCreateTime(new Date());
		mapper.insert(sheepNews);
		return ResponseResult.build(200, "添加资讯成功",sheepNews);
	}

	public ResponseResult deleteSheepNews(SheepNews sheepNews) {
		mapper.deleteByPrimaryKey(sheepNews.getId());
		return ResponseResult.build(200, "删除资讯成功",sheepNews);
	}

	public ResponseResult updateSheepNews(SheepNews sheepNews) {
		mapper.updateByPrimaryKey(sheepNews);
		return ResponseResult.build(200, "更新资讯成功",sheepNews);
	}

	public ResponseResult getSheepNews() {
		SheepNewsExample example=new SheepNewsExample();
		example.createCriteria().andIdIsNotNull();
		List<SheepNews> list=mapper.selectByExample(example);
		if(list==null||list.isEmpty()){
			return ResponseResult.build(404, "未查到任何资讯消息");
		}
		return ResponseResult.build(200, "查找资讯消息成功！", list);
	}
	
}