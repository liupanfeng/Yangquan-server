package com.yangquan.server.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yangquan.mapper.ServerZanMapper;
import com.yangquan.pojo.ServerCustomer;
import com.yangquan.pojo.ServerCustomerExample;
import com.yangquan.pojo.ServerZan;
import com.yangquan.pojo.ServerZanExample;
import com.yangquan.pojo.User;
import com.yangquan.server.service.ServerZanService;
import com.yangquan.utils.ResponseResult;

@Service
public class ServerZanServiceImpl implements ServerZanService {

	@Autowired
	private ServerZanMapper mapper;
	
	public ResponseResult addServerZan(ServerZan serverZan) {
		serverZan.setCreateTime(new Date());
		mapper.insert(serverZan);
		return ResponseResult.build(200, "点赞成功",serverZan);
	}

	public ResponseResult deleteServerZan(ServerZan serverZan) {
		mapper.deleteByPrimaryKey(serverZan.getId());
		return ResponseResult.build(200, "删除点赞",serverZan);
	}


	public ResponseResult updateServerZan(ServerZan serverZan) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseResult getServerZan(User user) {
		long userId=user.getId();
		ServerZanExample example=new ServerZanExample();
		example.createCriteria().andUserIdEqualTo(userId);
		List<ServerZan> list=mapper.selectByExample(example);
		if(list==null||list.isEmpty()){
			return ResponseResult.build(404, "未查到赞");
		}
		return ResponseResult.build(200, "获取赞成功！", list);
	}


}
