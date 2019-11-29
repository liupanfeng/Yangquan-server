package com.yangquan.server.service;

import com.yangquan.pojo.ServiceMessage;

import com.yangquan.utils.ResponseResult;

/**
 * 服务首页的头部的消息展示
 *
 */
public interface ServiceMessageService {

	public ResponseResult addServiceMessage(ServiceMessage serviceMessage);
	
	public ResponseResult deleteServiceMessage(ServiceMessage serviceMessage);
	
	public ResponseResult updateServiceMessage(ServiceMessage serviceMessage);
	
	public ResponseResult getServiceMessage();
	
}
