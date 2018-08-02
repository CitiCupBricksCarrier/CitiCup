package com.citicup.dao;

import com.citicup.model.CoachProductionInChina;

public interface CoachProductionInChinaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国客车销量
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String month);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国客车销量
     *
     * @mbggenerated
     */
    int insert(CoachProductionInChina record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国客车销量
     *
     * @mbggenerated
     */
    int insertSelective(CoachProductionInChina record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国客车销量
     *
     * @mbggenerated
     */
    CoachProductionInChina selectByPrimaryKey(String month);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国客车销量
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CoachProductionInChina record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国客车销量
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CoachProductionInChina record);
}