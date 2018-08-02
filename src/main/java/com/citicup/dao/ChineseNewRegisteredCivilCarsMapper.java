package com.citicup.dao;

import com.citicup.model.ChineseNewRegisteredCivilCars;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ChineseNewRegisteredCivilCarsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国新注册民用汽车数量
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String f1);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国新注册民用汽车数量
     *
     * @mbggenerated
     */
    int insert(ChineseNewRegisteredCivilCars record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国新注册民用汽车数量
     *
     * @mbggenerated
     */
    int insertSelective(ChineseNewRegisteredCivilCars record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国新注册民用汽车数量
     *
     * @mbggenerated
     */
    ChineseNewRegisteredCivilCars selectByPrimaryKey(String f1);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国新注册民用汽车数量
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ChineseNewRegisteredCivilCars record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国新注册民用汽车数量
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ChineseNewRegisteredCivilCars record);

    @Select("SELECT * FROM citicup.中国新注册民用汽车数量")
    List<ChineseNewRegisteredCivilCars> getAll();
}