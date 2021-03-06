package com.citicup.dao.dataDisplay;

import com.citicup.model.dataDisplay.ComparisonOfValuationPerformance_codeName;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ComparisonOfValuationPerformance_codeNameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 估值表现分析代码简称
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String securcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 估值表现分析代码简称
     *
     * @mbggenerated
     */
    int insert(ComparisonOfValuationPerformance_codeName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 估值表现分析代码简称
     *
     * @mbggenerated
     */
    int insertSelective(ComparisonOfValuationPerformance_codeName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 估值表现分析代码简称
     *
     * @mbggenerated
     */
    ComparisonOfValuationPerformance_codeName selectByPrimaryKey(String securcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 估值表现分析代码简称
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ComparisonOfValuationPerformance_codeName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 估值表现分析代码简称
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ComparisonOfValuationPerformance_codeName record);

    @Select("SELECT * FROM citicup.估值表现分析代码简称")
    List<ComparisonOfValuationPerformance_codeName> getAll();
}