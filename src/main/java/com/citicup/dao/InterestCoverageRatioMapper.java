package com.citicup.dao;

import com.citicup.model.InterestCoverageRatio;
import com.citicup.model.InterestCoverageRatioKey;

public interface InterestCoverageRatioMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 利息保障倍数
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(InterestCoverageRatioKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 利息保障倍数
     *
     * @mbggenerated
     */
    int insert(InterestCoverageRatio record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 利息保障倍数
     *
     * @mbggenerated
     */
    int insertSelective(InterestCoverageRatio record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 利息保障倍数
     *
     * @mbggenerated
     */
    InterestCoverageRatio selectByPrimaryKey(InterestCoverageRatioKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 利息保障倍数
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(InterestCoverageRatio record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 利息保障倍数
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(InterestCoverageRatio record);
}