package com.citicup.dao.dataDisplay;

import com.citicup.model.dataDisplay.ComparisonOfMarketPerformance_risefal;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ComparisonOfMarketPerformance_risefalMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 市场表现比较-risefal
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String securcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 市场表现比较-risefal
     *
     * @mbggenerated
     */
    int insert(ComparisonOfMarketPerformance_risefal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 市场表现比较-risefal
     *
     * @mbggenerated
     */
    int insertSelective(ComparisonOfMarketPerformance_risefal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 市场表现比较-risefal
     *
     * @mbggenerated
     */
    ComparisonOfMarketPerformance_risefal selectByPrimaryKey(String securcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 市场表现比较-risefal
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ComparisonOfMarketPerformance_risefal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 市场表现比较-risefal
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ComparisonOfMarketPerformance_risefal record);

    @Select("SELECT * FROM citicup.市场表现比较-risefal")
    List<ComparisonOfMarketPerformance_risefal> getAll();
}