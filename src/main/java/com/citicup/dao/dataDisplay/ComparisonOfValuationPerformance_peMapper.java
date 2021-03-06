package com.citicup.dao.dataDisplay;

import com.citicup.model.dataDisplay.ComparisonOfValuationPerformance_pe;
import com.citicup.model.dataDisplay.ComparisonOfValuationPerformance_peKey;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ComparisonOfValuationPerformance_peMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 估值表现分析市盈率拆分表
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(ComparisonOfValuationPerformance_peKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 估值表现分析市盈率拆分表
     *
     * @mbggenerated
     */
    int insert(ComparisonOfValuationPerformance_pe record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 估值表现分析市盈率拆分表
     *
     * @mbggenerated
     */
    int insertSelective(ComparisonOfValuationPerformance_pe record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 估值表现分析市盈率拆分表
     *
     * @mbggenerated
     */
    ComparisonOfValuationPerformance_pe selectByPrimaryKey(ComparisonOfValuationPerformance_peKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 估值表现分析市盈率拆分表
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ComparisonOfValuationPerformance_pe record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 估值表现分析市盈率拆分表
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ComparisonOfValuationPerformance_pe record);

    @Select("SELECT * FROM citicup.估值表现分析市盈率拆分表")
    List<ComparisonOfValuationPerformance_pe> getAll();
}