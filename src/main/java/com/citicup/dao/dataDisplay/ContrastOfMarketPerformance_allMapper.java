package com.citicup.dao.dataDisplay;

import com.citicup.model.dataDisplay.ContrastOfMarketPerformance_all;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ContrastOfMarketPerformance_allMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 市场表现对比-全部
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String indstnam);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 市场表现对比-全部
     *
     * @mbggenerated
     */
    int insert(ContrastOfMarketPerformance_all record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 市场表现对比-全部
     *
     * @mbggenerated
     */
    int insertSelective(ContrastOfMarketPerformance_all record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 市场表现对比-全部
     *
     * @mbggenerated
     */
    ContrastOfMarketPerformance_all selectByPrimaryKey(String indstnam);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 市场表现对比-全部
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ContrastOfMarketPerformance_all record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 市场表现对比-全部
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ContrastOfMarketPerformance_all record);

    @Select("SELECT * FROM citicup.市场表现对比-全部")
    List<ContrastOfMarketPerformance_all> getAll();
}