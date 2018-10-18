package com.citicup.dao.correlationAnalysis;

import com.citicup.model.correlationAnalysis.DisposedProfit;
import com.citicup.model.correlationAnalysis.DisposedProfitKey;

public interface DisposedProfitMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 处理后利润表
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(DisposedProfitKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 处理后利润表
     *
     * @mbggenerated
     */
    int insert(DisposedProfit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 处理后利润表
     *
     * @mbggenerated
     */
    int insertSelective(DisposedProfit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 处理后利润表
     *
     * @mbggenerated
     */
    DisposedProfit selectByPrimaryKey(DisposedProfitKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 处理后利润表
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(DisposedProfit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 处理后利润表
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DisposedProfit record);
}