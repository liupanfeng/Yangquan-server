package com.yangquan.server.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yangquan.mapper.AdOpenScreenMapper;
import com.yangquan.pojo.AdOpenScreen;
import com.yangquan.pojo.AdOpenScreenExample;
import com.yangquan.pojo.AdOpenScreenExample.Criteria;
import com.yangquan.server.service.ADOpenScreenService;
import com.yangquan.utils.ResponseResult;

@Service
public class ADOpenScreenServiceImpl implements ADOpenScreenService{

	@Autowired
	private AdOpenScreenMapper adOpenScreenMapper;
	
	public ResponseResult createOpenScreenAD(AdOpenScreen adOpenScreen) {
		AdOpenScreenExample example=new AdOpenScreenExample();
		example.createCriteria().andIdIsNotNull();
		List<AdOpenScreen> list=adOpenScreenMapper.selectByExample(example);
		if(list==null||list.isEmpty()){
			adOpenScreen.setTime(new Date());
			adOpenScreenMapper.insert(adOpenScreen);
			return ResponseResult.build(200, "添加开屏广告成功", adOpenScreen);
		}
		return modifyOpenScreenAD(adOpenScreen);
	}

	public ResponseResult modifyOpenScreenAD(AdOpenScreen adOpenScreen) {
		adOpenScreenMapper.updateByPrimaryKey(adOpenScreen);
		return ResponseResult.build(200, "修改开屏广告成功", adOpenScreen);
	}

	public ResponseResult deleteOpenScreenAD(AdOpenScreen adOpenScreen) {
		adOpenScreenMapper.deleteByPrimaryKey(adOpenScreen.getId());
		return ResponseResult.build(200, "删除开屏广告成功");
	}

	public ResponseResult selectOpenScreenAD() {
		AdOpenScreenExample example=new AdOpenScreenExample();
		Criteria criteria=example.createCriteria();
		criteria.andIdIsNotNull();
		List<AdOpenScreen> list=adOpenScreenMapper.selectByExample(example);
		if(list==null||list.isEmpty()){
			return ResponseResult.build(404, "未查询到开屏广告");
		}
		AdOpenScreen adOpenScreen=list.get(0);
		return ResponseResult.build(200, "获取开屏广告成功", adOpenScreen);
	}

}
