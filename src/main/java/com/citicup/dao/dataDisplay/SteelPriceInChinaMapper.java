package com.citicup.dao.dataDisplay;

import com.citicup.model.dataDisplay.SteelPriceInChina;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SteelPriceInChinaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国钢材价格
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String month);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国钢材价格
     *
     * @mbggenerated
     */
    int insert(SteelPriceInChina record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国钢材价格
     *
     * @mbggenerated
     */
    int insertSelective(SteelPriceInChina record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国钢材价格
     *
     * @mbggenerated
     */
    SteelPriceInChina selectByPrimaryKey(String month);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国钢材价格
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SteelPriceInChina record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国钢材价格
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SteelPriceInChina record);

    @Select("SELECT * FROM citicup.中国钢材价格")
    List<SteelPriceInChina> getAll();
}