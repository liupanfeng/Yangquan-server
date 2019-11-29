package com.yangquan.server.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yangquan.mapper.HistoryPriceMapper;
import com.yangquan.pojo.HistoryPrice;
import com.yangquan.pojo.HistoryPriceExample;
import com.yangquan.pojo.HistoryPriceExample.Criteria;
import com.yangquan.pojo.SheepNews;
import com.yangquan.server.service.HistoryPriceService;
import com.yangquan.utils.ResponseResult;

@Service
public class HistoryPriceServiceImpl implements HistoryPriceService {

	@Autowired
	private HistoryPriceMapper mapper;
	
	public ResponseResult addHistoryPrice(HistoryPrice historyPrice) {
		historyPrice.setCreateTime(new Date());
		mapper.insert(historyPrice);
		return ResponseResult.build(200, "添加资讯到历史数据库",historyPrice);
	}

	public ResponseResult deleteHistoryPrice(HistoryPrice historyPrice) {
		mapper.deleteByPrimaryKey(historyPrice.getId());
		return ResponseResult.build(200, "删除资讯到历史数据库",historyPrice);
	}

	public ResponseResult updateHistoryPrice(HistoryPrice historyPrice) {
		mapper.updateByPrimaryKey(historyPrice);
		return ResponseResult.build(200, "更新资讯到历史数据库",historyPrice);
	}

	public ResponseResult getHistoryPrice(SheepNews sheepNews) {
		HistoryPriceExample example=new HistoryPriceExample();
		Criteria criteria=example.createCriteria();
		criteria.andSheepTypeEqualTo(sheepNews.getSheepType());
		List<HistoryPrice> list=mapper.selectByExample(example);
		if(list==null||list.isEmpty()){
			return ResponseResult.build(404, "未查到任何历史数据");
		}
		return ResponseResult.build(200, "获取历史数据成功！", list);
	}

}
