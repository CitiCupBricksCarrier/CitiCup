package com.citicup.dao;

import com.citicup.model.ChineseDomesticManufacturingCommercialVehicleSalesByType;

public interface ChineseDomesticManufacturingCommercialVehicleSalesByTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国国内制造商用车分车型销量
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String f1);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国国内制造商用车分车型销量
     *
     * @mbggenerated
     */
    int insert(ChineseDomesticManufacturingCommercialVehicleSalesByType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国国内制造商用车分车型销量
     *
     * @mbggenerated
     */
    int insertSelective(ChineseDomesticManufacturingCommercialVehicleSalesByType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国国内制造商用车分车型销量
     *
     * @mbggenerated
     */
    ChineseDomesticManufacturingCommercialVehicleSalesByType selectByPrimaryKey(String f1);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国国内制造商用车分车型销量
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ChineseDomesticManufacturingCommercialVehicleSalesByType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国国内制造商用车分车型销量
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ChineseDomesticManufacturingCommercialVehicleSalesByType record);
}