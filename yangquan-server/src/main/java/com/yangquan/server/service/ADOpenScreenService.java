package com.yangquan.server.service;

import com.yangquan.pojo.AdOpenScreen;
import com.yangquan.utils.ResponseResult;

/**
 * 开屏广告配置
 * @author root
 *
 */
public interface ADOpenScreenService {
	
	/**
	 * 创建开屏广告
	 * @param adOpenScreen
	 * @return
	 */
	public ResponseResult createOpenScreenAD(AdOpenScreen adOpenScreen);
	
	
	/**
	 * 修改开屏广告内容
	 * @param adOpenScreen
	 * @return
	 */
	public ResponseResult modifyOpenScreenAD(AdOpenScreen adOpenScreen);
	
	/**
	 * 删除开屏广告内容
	 * @param adOpenScreen
	 * @return
	 */
	public ResponseResult deleteOpenScreenAD(AdOpenScreen adOpenScreen);
	
	/**
	 * 查找开屏广告内容
	 * @return
	 */
	public ResponseResult selectOpenScreenAD();
}
