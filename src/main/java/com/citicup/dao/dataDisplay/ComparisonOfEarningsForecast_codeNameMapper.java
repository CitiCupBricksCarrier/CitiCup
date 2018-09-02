package com.citicup.dao.dataDisplay;

import com.citicup.model.dataDisplay.ComparisonOfEarningsForecast_codeName;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ComparisonOfEarningsForecast_codeNameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 盈利预测比较代码简称
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String securcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 盈利预测比较代码简称
     *
     * @mbggenerated
     */
    int insert(ComparisonOfEarningsForecast_codeName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 盈利预测比较代码简称
     *
     * @mbggenerated
     */
    int insertSelective(ComparisonOfEarningsForecast_codeName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 盈利预测比较代码简称
     *
     * @mbggenerated
     */
    ComparisonOfEarningsForecast_codeName selectByPrimaryKey(String securcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 盈利预测比较代码简称
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ComparisonOfEarningsForecast_codeName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 盈利预测比较代码简称
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ComparisonOfEarningsForecast_codeName record);

    @Select("SELECT * FROM citicup.盈利预测比较代码简称")
    List<ComparisonOfEarningsForecast_codeName> getAll();
}