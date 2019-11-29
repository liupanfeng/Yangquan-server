package com.yangquan.mapper;

import com.yangquan.pojo.HistoryPrice;
import com.yangquan.pojo.HistoryPriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HistoryPriceMapper {
    int countByExample(HistoryPriceExample example);

    int deleteByExample(HistoryPriceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HistoryPrice record);

    int insertSelective(HistoryPrice record);

    List<HistoryPrice> selectByExampleWithBLOBs(HistoryPriceExample example);

    List<HistoryPrice> selectByExample(HistoryPriceExample example);

    HistoryPrice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HistoryPrice record, @Param("example") HistoryPriceExample example);

    int updateByExampleWithBLOBs(@Param("record") HistoryPrice record, @Param("example") HistoryPriceExample example);

    int updateByExample(@Param("record") HistoryPrice record, @Param("example") HistoryPriceExample example);

    int updateByPrimaryKeySelective(HistoryPrice record);

    int updateByPrimaryKeyWithBLOBs(HistoryPrice record);

    int updateByPrimaryKey(HistoryPrice record);
}