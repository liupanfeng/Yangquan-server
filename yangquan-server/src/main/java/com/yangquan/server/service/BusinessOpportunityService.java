package com.yangquan.server.service;

import com.yangquan.pojo.BusinessOpportunity;
import com.yangquan.pojo.Comment;
import com.yangquan.utils.ResponseResult;

public interface BusinessOpportunityService {
	
	public ResponseResult addBusinessOpportunity(BusinessOpportunity businessOpportunity);
	
	public ResponseResult deleteBusinessOpportunity(BusinessOpportunity businessOpportunity);
	
	public ResponseResult updateBusinessOpportunity(BusinessOpportunity businessOpportunity);
	
	public ResponseResult getBusinessOpportunity(long userId);
	
}
