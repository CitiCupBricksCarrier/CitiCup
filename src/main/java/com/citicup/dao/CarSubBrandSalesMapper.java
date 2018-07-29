package com.citicup.dao;

import com.citicup.entity.CarSubBrandSales;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CarSubBrandSalesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国乘用车分品牌销量
     *
     * @mbggenerated
     */
    int insert(CarSubBrandSales record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国乘用车分品牌销量
     *
     * @mbggenerated
     */
    int insertSelective(CarSubBrandSales record);

    @Select("select * from 中国乘用车分品牌销量")
    List<CarSubBrandSales> getAll();
}