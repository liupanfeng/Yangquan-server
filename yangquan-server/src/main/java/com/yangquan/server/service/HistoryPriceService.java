package com.yangquan.server.service;

import com.yangquan.pojo.HistoryPrice;
import com.yangquan.pojo.SheepNews;
import com.yangquan.utils.ResponseResult;

/**
 * 这个用于展示资讯历史折线图
 */
public interface HistoryPriceService {
	
	public ResponseResult addHistoryPrice(HistoryPrice historyPrice);
	
	public ResponseResult deleteHistoryPrice(HistoryPrice historyPrice);
	
	public ResponseResult updateHistoryPrice(HistoryPrice historyPrice);
	
	/**
	 * 
	 * @param sheepNews  通过资讯新闻类型，获取历史数据
	 * @return
	 */
	public ResponseResult getHistoryPrice(SheepNews sheepNews);
	
}
