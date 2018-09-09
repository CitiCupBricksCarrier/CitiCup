package com.citicup.dao.correlationAnalysis;

import com.citicup.model.correlationAnalysis.DealersNumChange_1M;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DealersNumChange_1MMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 分析师类-最近一个月券商覆盖数量（券商家数）变化
     *
     * @mbggenerated
     */
    int insert(DealersNumChange_1M record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 分析师类-最近一个月券商覆盖数量（券商家数）变化
     *
     * @mbggenerated
     */
    int insertSelective(DealersNumChange_1M record);

    @Select("SELECT * FROM citicup.分析师类-最近一个月券商覆盖数量（券商家数）变化")
    List<DealersNumChange_1M> getAll();
}