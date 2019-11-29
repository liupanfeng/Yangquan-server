package com.yangquan.server.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yangquan.mapper.ServerCustomerMapper;
import com.yangquan.pojo.ServerCustomer;
import com.yangquan.pojo.ServerCustomerExample;
import com.yangquan.server.service.ServerCustomerService;
import com.yangquan.utils.ResponseResult;

/**
 * 系统通知
 * @author 86188
 *
 */
@Service
public class ServerCustomerServiceImpl implements ServerCustomerService{

	@Autowired
	private ServerCustomerMapper mapper;
	

	@Override
	public ResponseResult addServerCustomer(ServerCustomer serverCustomer) {
		serverCustomer.setCreateTime(new Date());
		mapper.insert(serverCustomer);
		return ResponseResult.build(200, "添加服务成功！", serverCustomer);
	}

	@Override
	public ResponseResult deleteServerCustomer(ServerCustomer serverCustomer) {
		mapper.deleteByPrimaryKey(serverCustomer.getId());
		return ResponseResult.build(200, "删除服务成功！");
	}

	@Override
	public ResponseResult getServerCustomer(int userType) {
		ServerCustomerExample example=new ServerCustomerExample();
		example.createCriteria().andUserTypeEqualTo(userType);
		List<ServerCustomer> list=mapper.selectByExample(example);
		if(list==null||list.isEmpty()){
			return ResponseResult.build(404, "未查到任何服务");
		}
		return ResponseResult.build(200, "获取服务成功！", list);
	}

	@Override
	public ResponseResult updateServerCustomer(ServerCustomer serverCustomer) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKey(serverCustomer);
		return ResponseResult.build(200, "更新服务成功！");
	}

}
