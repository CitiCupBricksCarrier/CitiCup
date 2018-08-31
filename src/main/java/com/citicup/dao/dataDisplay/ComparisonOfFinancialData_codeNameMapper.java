package com.citicup.dao.dataDisplay;

import com.citicup.model.dataDisplay.ComparisonOfFinancialData_codeName;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ComparisonOfFinancialData_codeNameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 财务数据比较-代码简称
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String securcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 财务数据比较-代码简称
     *
     * @mbggenerated
     */
    int insert(ComparisonOfFinancialData_codeName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 财务数据比较-代码简称
     *
     * @mbggenerated
     */
    int insertSelective(ComparisonOfFinancialData_codeName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 财务数据比较-代码简称
     *
     * @mbggenerated
     */
    ComparisonOfFinancialData_codeName selectByPrimaryKey(String securcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 财务数据比较-代码简称
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ComparisonOfFinancialData_codeName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 财务数据比较-代码简称
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ComparisonOfFinancialData_codeName record);

    @Select("SELECT * FROM citicup.财务数据比较-代码简称")
    List<ComparisonOfFinancialData_codeName> getAll();
}