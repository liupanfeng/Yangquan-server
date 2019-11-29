package com.yangquan.server.service;

import com.yangquan.pojo.YangquanVersion;
import com.yangquan.utils.ResponseResult;

public interface YangquanVersionService {
	
	public ResponseResult addYangquanVersion(YangquanVersion yangquanVersion);
	
	public ResponseResult deleteYangquanVersion(YangquanVersion yangquanVersion);
	
	public ResponseResult updateYangquanVersion(YangquanVersion yangquanVersion);
	
	public ResponseResult getYangquanVersion();
	
}
