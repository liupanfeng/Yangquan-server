package com.yangquan.server.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yangquan.mapper.SystemMessageMapper;
import com.yangquan.pojo.SystemMessage;
import com.yangquan.pojo.SystemMessageExample;
import com.yangquan.server.service.SystemMessageService;
import com.yangquan.utils.ResponseResult;

@Service
public class SystemMessageServiceImpl implements SystemMessageService{
	
	@Autowired
	private SystemMessageMapper mapper;

	@Override
	public ResponseResult addSystemMessage(SystemMessage systemMessage) {
		systemMessage.setCreateTime(new Date());
		mapper.insert(systemMessage);
		return ResponseResult.build(200, "添加系统消息成功",systemMessage);
	}

	@Override
	public ResponseResult deleteSystemMessage(SystemMessage systemMessage) {
		mapper.deleteByPrimaryKey(systemMessage.getId());
		return ResponseResult.build(200, "删除系统消息成功",systemMessage);
	}

	@Override
	public ResponseResult updateSystemMessage(SystemMessage systemMessage) {
		mapper.updateByPrimaryKey(systemMessage);
		return ResponseResult.build(200, "更新系统消息成功",systemMessage);
	}

	@Override
	public ResponseResult getSystemMessage() {
		SystemMessageExample example=new SystemMessageExample();
		example.createCriteria().andIdIsNotNull();
		List<SystemMessage> list=mapper.selectByExample(example);
		if(list==null||list.isEmpty()){
			return ResponseResult.build(404, "未查到任何系统消息");
		}
		return ResponseResult.build(200, "查找系统消息成功！", list);
	}

}
