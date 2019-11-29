package com.yangquan.server.service;

import com.yangquan.pojo.ServerZan;
import com.yangquan.pojo.SheepNews;
import com.yangquan.pojo.User;
import com.yangquan.utils.ResponseResult;

/**
 * 咨询新闻，获取最新的一条，，这里一个类别只有一条
 *
 */
public interface SheepNewsService {


	public ResponseResult addSheepNews(SheepNews sheepNews);
	
	public ResponseResult deleteSheepNews(SheepNews sheepNews);
	
	public ResponseResult updateSheepNews(SheepNews sheepNews);
	
	public ResponseResult getSheepNews();
	
	
}
