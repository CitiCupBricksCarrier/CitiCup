package com.citicup.dao;

import com.citicup.model.ChineseDomesticManufacturingPassengerCarSales;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ChineseDomesticManufacturingPassengerCarSalesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国国内制造乘用车销量
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String f1);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国国内制造乘用车销量
     *
     * @mbggenerated
     */
    int insert(ChineseDomesticManufacturingPassengerCarSales record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国国内制造乘用车销量
     *
     * @mbggenerated
     */
    int insertSelective(ChineseDomesticManufacturingPassengerCarSales record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国国内制造乘用车销量
     *
     * @mbggenerated
     */
    ChineseDomesticManufacturingPassengerCarSales selectByPrimaryKey(String f1);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国国内制造乘用车销量
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ChineseDomesticManufacturingPassengerCarSales record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国国内制造乘用车销量
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ChineseDomesticManufacturingPassengerCarSales record);

    @Select("SELECT * FROM citicup.中国国内制造乘用车销量")
    List<ChineseDomesticManufacturingPassengerCarSales> getAll();
}