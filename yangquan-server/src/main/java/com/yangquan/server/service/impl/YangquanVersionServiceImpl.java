package com.yangquan.server.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yangquan.mapper.YangquanVersionMapper;
import com.yangquan.pojo.YangquanVersion;
import com.yangquan.pojo.YangquanVersionExample;
import com.yangquan.server.service.YangquanVersionService;
import com.yangquan.utils.ResponseResult;

@Service
public class YangquanVersionServiceImpl implements YangquanVersionService {
	
	@Autowired
	private YangquanVersionMapper mapper;
	
	
	@Override
	public ResponseResult addYangquanVersion(YangquanVersion yangquanVersion) {
		mapper.insert(yangquanVersion);
		return ResponseResult.build(200, "添加新版本成功", yangquanVersion);
	}

	@Override
	public ResponseResult deleteYangquanVersion(YangquanVersion yangquanVersion) {
		mapper.deleteByPrimaryKey(yangquanVersion.getId());
		return ResponseResult.build(200, "删除版本成功", yangquanVersion);
	}

	@Override
	public ResponseResult updateYangquanVersion(YangquanVersion yangquanVersion) {
		mapper.updateByPrimaryKey(yangquanVersion);
		return ResponseResult.build(200, "更新版本成功", yangquanVersion);
	}

	@Override
	public ResponseResult getYangquanVersion() {
		YangquanVersionExample example=new YangquanVersionExample();
		example.createCriteria().andIdIsNotNull();
		List<YangquanVersion> list=mapper.selectByExample(example);
		if(list==null||list.isEmpty()){
			return ResponseResult.build(404, "未查到任何版本数据");
		}
		return ResponseResult.build(200, "获取新版本成功", list.get(0));
	}


}
