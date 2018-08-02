package com.citicup.dao;

import com.citicup.model.TotalAssetsGrowthRate;
import com.citicup.model.TotalAssetsGrowthRateKey;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TotalAssetsGrowthRateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 总资产增长率
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(TotalAssetsGrowthRateKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 总资产增长率
     *
     * @mbggenerated
     */
    int insert(TotalAssetsGrowthRate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 总资产增长率
     *
     * @mbggenerated
     */
    int insertSelective(TotalAssetsGrowthRate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 总资产增长率
     *
     * @mbggenerated
     */
    TotalAssetsGrowthRate selectByPrimaryKey(TotalAssetsGrowthRateKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 总资产增长率
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TotalAssetsGrowthRate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 总资产增长率
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TotalAssetsGrowthRate record);

    @Select("SELECT * FROM citicup.总资产增长率")
    List<TotalAssetsGrowthRate> getAll();
}