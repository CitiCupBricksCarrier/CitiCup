package com.citicup.dao;

import com.citicup.model.NetProfitAndTotalProfitRatio;
import com.citicup.model.NetProfitAndTotalProfitRatioKey;

public interface NetProfitAndTotalProfitRatioMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 净利润与利润总额比
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(NetProfitAndTotalProfitRatioKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 净利润与利润总额比
     *
     * @mbggenerated
     */
    int insert(NetProfitAndTotalProfitRatio record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 净利润与利润总额比
     *
     * @mbggenerated
     */
    int insertSelective(NetProfitAndTotalProfitRatio record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 净利润与利润总额比
     *
     * @mbggenerated
     */
    NetProfitAndTotalProfitRatio selectByPrimaryKey(NetProfitAndTotalProfitRatioKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 净利润与利润总额比
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(NetProfitAndTotalProfitRatio record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 净利润与利润总额比
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(NetProfitAndTotalProfitRatio record);
}