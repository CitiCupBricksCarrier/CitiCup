package com.citicup.dao.dataDisplay;

import com.citicup.model.dataDisplay.ComparisonOfMarketPerformance_sheet2;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ComparisonOfMarketPerformance_sheet2Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 市场表现比较sheet2
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String securcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 市场表现比较sheet2
     *
     * @mbggenerated
     */
    int insert(ComparisonOfMarketPerformance_sheet2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 市场表现比较sheet2
     *
     * @mbggenerated
     */
    int insertSelective(ComparisonOfMarketPerformance_sheet2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 市场表现比较sheet2
     *
     * @mbggenerated
     */
    ComparisonOfMarketPerformance_sheet2 selectByPrimaryKey(String securcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 市场表现比较sheet2
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ComparisonOfMarketPerformance_sheet2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 市场表现比较sheet2
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ComparisonOfMarketPerformance_sheet2 record);

    @Select("SELECT * FROM citicup.市场表现比较sheet2")
    List<ComparisonOfMarketPerformance_sheet2> getAll();
}