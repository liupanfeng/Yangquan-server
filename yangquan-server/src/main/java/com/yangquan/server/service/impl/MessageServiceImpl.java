package com.yangquan.server.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yangquan.mapper.MessageMapper;
import com.yangquan.pojo.Message;
import com.yangquan.pojo.MessageExample;
import com.yangquan.pojo.MessageExample.Criteria;
import com.yangquan.pojo.MessageExample.Criterion;
import com.yangquan.pojo.User;
import com.yangquan.server.service.MessageService;
import com.yangquan.utils.ResponseResult;

@Service
public class MessageServiceImpl implements MessageService {
	
	@Autowired
	private MessageMapper mapper;
	
	@Override
	public ResponseResult addMessage(Message message) {
		message.setCreateTime(new Date());
		mapper.insert(message);
		return ResponseResult.build(200, "添加信息成功",message);
	}

	@Override
	public ResponseResult deleteMessage(Message message) {
		mapper.deleteByPrimaryKey(message.getId());
		return ResponseResult.build(200, "删除信息成功",message);
	}

	@Override
	public ResponseResult updateMessage(Message message) {
		mapper.updateByPrimaryKey(message);
		return ResponseResult.build(200, "更新信息成功",message);
	}

	@Override
	public ResponseResult getMessage(int userType) {
		MessageExample example=new MessageExample();
		Criteria criteria=example.createCriteria();
		criteria.andUserTypeEqualTo(userType);
		List<Message> list=mapper.selectByExample(example);
		if(list==null||list.isEmpty()){
			return ResponseResult.build(404, "未查到任何信息");
		}
		return ResponseResult.build(200, "获取信息成功！", list);
	}

}
