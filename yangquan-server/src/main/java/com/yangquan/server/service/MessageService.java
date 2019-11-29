package com.yangquan.server.service;

import com.yangquan.pojo.Message;
import com.yangquan.pojo.User;
import com.yangquan.utils.ResponseResult;

/**
 * 信息发布，用于客户端中间tab页面
 */
public interface MessageService {
	
	public ResponseResult addMessage(Message message);
	
	public ResponseResult deleteMessage(Message message);
	
	public ResponseResult updateMessage(Message message);
	
	public ResponseResult getMessage(int userType);
	
}