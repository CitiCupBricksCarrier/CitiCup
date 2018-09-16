package com.citicup.dao.correlationAnalysis;

import com.citicup.model.correlationAnalysis.ProfitGrowthRate;
import com.citicup.model.correlationAnalysis.ProfitGrowthRateKey;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProfitGrowthRateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 成长类毛利润增长率
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(ProfitGrowthRateKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 成长类毛利润增长率
     *
     * @mbggenerated
     */
    int insert(ProfitGrowthRate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 成长类毛利润增长率
     *
     * @mbggenerated
     */
    int insertSelective(ProfitGrowthRate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 成长类毛利润增长率
     *
     * @mbggenerated
     */
    ProfitGrowthRate selectByPrimaryKey(ProfitGrowthRateKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 成长类毛利润增长率
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ProfitGrowthRate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 成长类毛利润增长率
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ProfitGrowthRate record);

    @Select("SELECT * FROM citicup.成长类毛利润增长率 WHERE value is not NULL")
    List<ProfitGrowthRate> getAll();
}