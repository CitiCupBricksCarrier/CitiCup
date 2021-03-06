package com.citicup.dao.dataDisplay;

import com.citicup.model.dataDisplay.FixedAssetsInvestmentOfAutoIndustryInChina;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FixedAssetsInvestmentOfAutoIndustryInChinaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业固定资产投资额
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String year);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业固定资产投资额
     *
     * @mbggenerated
     */
    int insert(FixedAssetsInvestmentOfAutoIndustryInChina record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业固定资产投资额
     *
     * @mbggenerated
     */
    int insertSelective(FixedAssetsInvestmentOfAutoIndustryInChina record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业固定资产投资额
     *
     * @mbggenerated
     */
    FixedAssetsInvestmentOfAutoIndustryInChina selectByPrimaryKey(String year);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业固定资产投资额
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(FixedAssetsInvestmentOfAutoIndustryInChina record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业固定资产投资额
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(FixedAssetsInvestmentOfAutoIndustryInChina record);

    @Select("SELECT * FROM citicup.中国汽车行业固定资产投资额")
    List<FixedAssetsInvestmentOfAutoIndustryInChina> getAll();
}