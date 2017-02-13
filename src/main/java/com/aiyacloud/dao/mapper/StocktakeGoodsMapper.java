package com.aiyacloud.dao.mapper;

import com.aiyacloud.dao.domain.entity.StocktakeGoods;
import com.aiyacloud.dao.domain.entity.StocktakeGoodsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StocktakeGoodsMapper {
    int countByExample(StocktakeGoodsExample example);

    int deleteByExample(StocktakeGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StocktakeGoods record);

    int insertSelective(StocktakeGoods record);

    List<StocktakeGoods> selectByExample(StocktakeGoodsExample example);

    StocktakeGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StocktakeGoods record, @Param("example") StocktakeGoodsExample example);

    int updateByExample(@Param("record") StocktakeGoods record, @Param("example") StocktakeGoodsExample example);

    int updateByPrimaryKeySelective(StocktakeGoods record);

    int updateByPrimaryKey(StocktakeGoods record);
}