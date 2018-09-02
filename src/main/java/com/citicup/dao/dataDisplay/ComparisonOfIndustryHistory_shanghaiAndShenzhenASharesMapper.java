package com.citicup.dao.dataDisplay;

import com.citicup.model.dataDisplay.ComparisonOfIndustryHistory_shanghaiAndShenzhenAShares;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ComparisonOfIndustryHistory_shanghaiAndShenzhenASharesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 行业历史比较沪深a股
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String time);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 行业历史比较沪深a股
     *
     * @mbggenerated
     */
    int insert(ComparisonOfIndustryHistory_shanghaiAndShenzhenAShares record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 行业历史比较沪深a股
     *
     * @mbggenerated
     */
    int insertSelective(ComparisonOfIndustryHistory_shanghaiAndShenzhenAShares record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 行业历史比较沪深a股
     *
     * @mbggenerated
     */
    ComparisonOfIndustryHistory_shanghaiAndShenzhenAShares selectByPrimaryKey(String time);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 行业历史比较沪深a股
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ComparisonOfIndustryHistory_shanghaiAndShenzhenAShares record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 行业历史比较沪深a股
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ComparisonOfIndustryHistory_shanghaiAndShenzhenAShares record);

    @Select("SELECT * FROM citicup.行业历史比较沪深a股")
    List<ComparisonOfIndustryHistory_shanghaiAndShenzhenAShares> getAll();
}