package com.yangquan.server.service;

import com.yangquan.pojo.SystemMessage;
import com.yangquan.utils.ResponseResult;

/**
 * 系统消息，进入我的消息里边
 */
public interface SystemMessageService {

	public ResponseResult addSystemMessage(SystemMessage systemMessage);

	public ResponseResult deleteSystemMessage(SystemMessage systemMessage);

	public ResponseResult updateSystemMessage(SystemMessage systemMessage);

	public ResponseResult getSystemMessage();

}
