package com.citicup.dao;

import com.citicup.model.ChineseCarDealersEarlyWarningIndex;

public interface ChineseCarDealersEarlyWarningIndexMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车经销商库存预警指数
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String f1);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车经销商库存预警指数
     *
     * @mbggenerated
     */
    int insert(ChineseCarDealersEarlyWarningIndex record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车经销商库存预警指数
     *
     * @mbggenerated
     */
    int insertSelective(ChineseCarDealersEarlyWarningIndex record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车经销商库存预警指数
     *
     * @mbggenerated
     */
    ChineseCarDealersEarlyWarningIndex selectByPrimaryKey(String f1);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车经销商库存预警指数
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ChineseCarDealersEarlyWarningIndex record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车经销商库存预警指数
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ChineseCarDealersEarlyWarningIndex record);
}