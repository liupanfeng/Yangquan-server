package com.yangquan.server.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yangquan.mapper.BusinessOpportunityMapper;
import com.yangquan.pojo.BusinessOpportunity;
import com.yangquan.pojo.BusinessOpportunityExample;
import com.yangquan.server.service.BusinessOpportunityService;
import com.yangquan.utils.ResponseResult;

@Service
public class BusinessOpportunityServiceImpl implements BusinessOpportunityService{
	
	@Autowired
	private BusinessOpportunityMapper mapper;
	
	@Override
	public ResponseResult addBusinessOpportunity(BusinessOpportunity businessOpportunity) {
		businessOpportunity.setCreateTime(new Date());
		mapper.insert(businessOpportunity);
		return ResponseResult.build(200, "添加商机成功",businessOpportunity);
	}

	@Override
	public ResponseResult deleteBusinessOpportunity(BusinessOpportunity businessOpportunity) {
		mapper.deleteByPrimaryKey(businessOpportunity.getId());
		return ResponseResult.build(200, "删除商机成功",businessOpportunity);
	}

	@Override
	public ResponseResult updateBusinessOpportunity(BusinessOpportunity businessOpportunity) {
		mapper.updateByPrimaryKey(businessOpportunity);
		return ResponseResult.build(200, "更新商机成功",businessOpportunity);
	}

	@Override
	public ResponseResult getBusinessOpportunity(long userId) {
		BusinessOpportunityExample example=new BusinessOpportunityExample();
		example.createCriteria().andToUserIdEqualTo(userId);
		List<BusinessOpportunity> list=mapper.selectByExample(example);
		if(list==null||list.isEmpty()){
			return ResponseResult.build(404, "未查到任何商机数据");
		}
		return ResponseResult.build(200, "获取商机数据成功！", list);
	}

}
