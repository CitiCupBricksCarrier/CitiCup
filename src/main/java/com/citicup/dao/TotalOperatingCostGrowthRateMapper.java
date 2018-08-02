package com.citicup.dao;

import com.citicup.model.TotalOperatingCostGrowthRate;
import com.citicup.model.TotalOperatingCostGrowthRateKey;

public interface TotalOperatingCostGrowthRateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 营业总成本增长率
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(TotalOperatingCostGrowthRateKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 营业总成本增长率
     *
     * @mbggenerated
     */
    int insert(TotalOperatingCostGrowthRate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 营业总成本增长率
     *
     * @mbggenerated
     */
    int insertSelective(TotalOperatingCostGrowthRate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 营业总成本增长率
     *
     * @mbggenerated
     */
    TotalOperatingCostGrowthRate selectByPrimaryKey(TotalOperatingCostGrowthRateKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 营业总成本增长率
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TotalOperatingCostGrowthRate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 营业总成本增长率
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TotalOperatingCostGrowthRate record);
}