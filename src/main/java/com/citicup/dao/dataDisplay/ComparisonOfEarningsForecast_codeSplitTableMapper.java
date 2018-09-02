package com.citicup.dao.dataDisplay;

import com.citicup.model.dataDisplay.ComparisonOfEarningsForecast_codeSplitTable;
import com.citicup.model.dataDisplay.ComparisonOfEarningsForecast_codeSplitTableKey;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ComparisonOfEarningsForecast_codeSplitTableMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 盈利预测比较代码分表
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(ComparisonOfEarningsForecast_codeSplitTableKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 盈利预测比较代码分表
     *
     * @mbggenerated
     */
    int insert(ComparisonOfEarningsForecast_codeSplitTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 盈利预测比较代码分表
     *
     * @mbggenerated
     */
    int insertSelective(ComparisonOfEarningsForecast_codeSplitTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 盈利预测比较代码分表
     *
     * @mbggenerated
     */
    ComparisonOfEarningsForecast_codeSplitTable selectByPrimaryKey(ComparisonOfEarningsForecast_codeSplitTableKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 盈利预测比较代码分表
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ComparisonOfEarningsForecast_codeSplitTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 盈利预测比较代码分表
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ComparisonOfEarningsForecast_codeSplitTable record);

    @Select("SELECT * FROM citicup.盈利预测比较代码分表")
    List<ComparisonOfEarningsForecast_codeSplitTable> getAll();
}