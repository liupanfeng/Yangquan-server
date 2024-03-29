package com.yangquan.server.service;

import com.yangquan.pojo.SystemMessage;
import com.yangquan.pojo.SystemNotification;
import com.yangquan.utils.ResponseResult;

/**
 * 系统通知,这个展示在我的消息里边
 * @author root
 *
 */
public interface SystemNotificationService {
	
	public ResponseResult addSystemNotification(SystemNotification systemMessage);
	
	public ResponseResult deleteSystemNotification(SystemNotification systemMessage);
	
	public ResponseResult selectSystemNotification();
	
	public ResponseResult updateSystemNotification(SystemNotification systemMessage);
	
}
