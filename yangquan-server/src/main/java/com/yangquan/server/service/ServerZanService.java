package com.yangquan.server.service;

import com.yangquan.pojo.ServerCustomer;
import com.yangquan.pojo.ServerZan;
import com.yangquan.pojo.User;
import com.yangquan.utils.ResponseResult;
/**
 * 给服务点赞
 * 
 */
public interface ServerZanService {

	public ResponseResult addServerZan(ServerZan serverZan);
	
	public ResponseResult deleteServerZan(ServerZan serverZan);
	
	public ResponseResult updateServerZan(ServerZan serverZan);
	
	public ResponseResult getServerZan(User user);
}