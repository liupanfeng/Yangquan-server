package com.yangquan.server.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yangquan.mapper.SystemNotificationMapper;
import com.yangquan.pojo.SystemNotification;
import com.yangquan.pojo.SystemNotificationExample;
import com.yangquan.server.service.SystemNotificationService;
import com.yangquan.utils.ResponseResult;

/**
 * 系统通知
 * @author 86188
 *
 */
@Service
public class SystemNotificationServiceImpl implements SystemNotificationService{

	@Autowired
	private SystemNotificationMapper mapper;
	
	@Override
	public ResponseResult addSystemNotification(SystemNotification systemMessage) {
		systemMessage.setCreateTime(new Date());
		mapper.insert(systemMessage);
		return ResponseResult.build(200, "添加系统通知成功！", systemMessage);
	}

	@Override
	public ResponseResult deleteSystemNotification(SystemNotification systemMessage) {
		mapper.deleteByPrimaryKey(systemMessage.getId());
		return ResponseResult.build(200, "删除系统通知成功！");
	}

	@Override
	public ResponseResult selectSystemNotification() {
		SystemNotificationExample example=new SystemNotificationExample();
		example.createCriteria().andIdIsNotNull();
		List<SystemNotification> list=mapper.selectByExample(example);
		if(list==null||list.isEmpty()){
			return ResponseResult.build(404, "未查到任何系统通知消息");
		}
		return ResponseResult.build(200, "查找系统通知成功！", list);
	}

	@Override
	public ResponseResult updateSystemNotification(SystemNotification systemMessage) {
		mapper.updateByPrimaryKey(systemMessage);
		return ResponseResult.build(200, "更改系统通知成功！", systemMessage);
	}

}