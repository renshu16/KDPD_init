package com.aiyacloud.dao.mapper;

import com.aiyacloud.dao.domain.entity.StocktakeMain;
import com.aiyacloud.dao.domain.entity.StocktakeMainExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StocktakeMainMapper {
    int countByExample(StocktakeMainExample example);

    int deleteByExample(StocktakeMainExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StocktakeMain record);

    int insertSelective(StocktakeMain record);

    List<StocktakeMain> selectByExample(StocktakeMainExample example);

    StocktakeMain selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StocktakeMain record, @Param("example") StocktakeMainExample example);

    int updateByExample(@Param("record") StocktakeMain record, @Param("example") StocktakeMainExample example);

    int updateByPrimaryKeySelective(StocktakeMain record);

    int updateByPrimaryKey(StocktakeMain record);
}