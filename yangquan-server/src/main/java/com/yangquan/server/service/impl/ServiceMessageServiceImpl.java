package com.yangquan.server.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yangquan.mapper.ServiceMessageMapper;
import com.yangquan.pojo.ServiceMessage;
import com.yangquan.pojo.ServiceMessageExample;
import com.yangquan.pojo.UserBack;
import com.yangquan.pojo.UserBackExample;
import com.yangquan.server.service.ServiceMessageService;
import com.yangquan.utils.ResponseResult;

@Service
public class ServiceMessageServiceImpl implements ServiceMessageService{
	
	@Autowired
	private ServiceMessageMapper mapper;
	
	public ResponseResult addServiceMessage(ServiceMessage serviceMessage) {
		serviceMessage.setCreateTime(new Date());
		mapper.insert(serviceMessage);
		return ResponseResult.build(200, "添加服务消息成功",serviceMessage);
	}

	public ResponseResult deleteServiceMessage(ServiceMessage serviceMessage) {
		mapper.deleteByPrimaryKey(serviceMessage.getId());
		return ResponseResult.build(200, "删除服务消息",serviceMessage);
	}

	public ResponseResult updateServiceMessage(ServiceMessage serviceMessage) {
		mapper.updateByPrimaryKey(serviceMessage);
		return ResponseResult.build(200, "更新服务消息",serviceMessage);
	}

	public ResponseResult getServiceMessage() {
		ServiceMessageExample example=new ServiceMessageExample();
		example.createCriteria().andIdIsNotNull();
		List<ServiceMessage> list=mapper.selectByExample(example);
		if(list==null||list.isEmpty()){
			return ResponseResult.build(404, "未查到任何服务消息");
		}
		return ResponseResult.build(200, "查找服务消息成功！", list);
	}

}
