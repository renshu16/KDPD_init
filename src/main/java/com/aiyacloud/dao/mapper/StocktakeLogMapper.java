package com.aiyacloud.dao.mapper;

import com.aiyacloud.dao.domain.entity.StocktakeLog;
import com.aiyacloud.dao.domain.entity.StocktakeLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StocktakeLogMapper {
    int countByExample(StocktakeLogExample example);

    int deleteByExample(StocktakeLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StocktakeLog record);

    int insertSelective(StocktakeLog record);

    List<StocktakeLog> selectByExample(StocktakeLogExample example);

    StocktakeLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StocktakeLog record, @Param("example") StocktakeLogExample example);

    int updateByExample(@Param("record") StocktakeLog record, @Param("example") StocktakeLogExample example);

    int updateByPrimaryKeySelective(StocktakeLog record);

    int updateByPrimaryKey(StocktakeLog record);
}