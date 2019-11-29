package com.yangquan.server.service;

import com.yangquan.pojo.ServerCustomer;
import com.yangquan.pojo.SystemNotification;
import com.yangquan.utils.ResponseResult;

/**
 * 服务列表
 * @author 86188
 *
 */
public interface ServerCustomerService {

	public ResponseResult addServerCustomer(ServerCustomer systemMessage);
	
	public ResponseResult deleteServerCustomer(ServerCustomer systemMessage);
	
	public ResponseResult getServerCustomer(int userType);
	
	public ResponseResult updateServerCustomer(ServerCustomer systemMessage);
	
}
