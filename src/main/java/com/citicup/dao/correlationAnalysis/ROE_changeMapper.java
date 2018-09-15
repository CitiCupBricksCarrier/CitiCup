package com.citicup.dao.correlationAnalysis;

import com.citicup.model.correlationAnalysis.ROE_change;
import com.citicup.model.correlationAnalysis.ROE_changeKey;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ROE_changeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 成长roe变动
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(ROE_changeKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 成长roe变动
     *
     * @mbggenerated
     */
    int insert(ROE_change record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 成长roe变动
     *
     * @mbggenerated
     */
    int insertSelective(ROE_change record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 成长roe变动
     *
     * @mbggenerated
     */
    ROE_change selectByPrimaryKey(ROE_changeKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 成长roe变动
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ROE_change record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 成长roe变动
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ROE_change record);

    @Select("SELECT * FROM citicup.成长roe变动")
    List<ROE_change> getAll();
}