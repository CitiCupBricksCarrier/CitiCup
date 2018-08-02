package com.citicup.dao;

import com.citicup.model.ChineseMajorAutomobileGroupProduction;

public interface ChineseMajorAutomobileGroupProductionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国主要汽车集团产量
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String f1);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国主要汽车集团产量
     *
     * @mbggenerated
     */
    int insert(ChineseMajorAutomobileGroupProduction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国主要汽车集团产量
     *
     * @mbggenerated
     */
    int insertSelective(ChineseMajorAutomobileGroupProduction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国主要汽车集团产量
     *
     * @mbggenerated
     */
    ChineseMajorAutomobileGroupProduction selectByPrimaryKey(String f1);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国主要汽车集团产量
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ChineseMajorAutomobileGroupProduction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国主要汽车集团产量
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ChineseMajorAutomobileGroupProduction record);
}