package com.citicup.dao;

import com.citicup.model.ComparisonOfFinancialRatio_all;
import com.citicup.model.ComparisonOfFinancialRatio_allKey;

public interface ComparisonOfFinancialRatio_allMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 财务比率比较-全部
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(ComparisonOfFinancialRatio_allKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 财务比率比较-全部
     *
     * @mbggenerated
     */
    int insert(ComparisonOfFinancialRatio_all record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 财务比率比较-全部
     *
     * @mbggenerated
     */
    int insertSelective(ComparisonOfFinancialRatio_all record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 财务比率比较-全部
     *
     * @mbggenerated
     */
    ComparisonOfFinancialRatio_all selectByPrimaryKey(ComparisonOfFinancialRatio_allKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 财务比率比较-全部
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ComparisonOfFinancialRatio_all record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 财务比率比较-全部
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ComparisonOfFinancialRatio_all record);
}