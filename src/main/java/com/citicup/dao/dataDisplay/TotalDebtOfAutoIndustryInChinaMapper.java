package com.citicup.dao.dataDisplay;

import com.citicup.model.dataDisplay.TotalDebtOfAutoIndustryInChina;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TotalDebtOfAutoIndustryInChinaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业负债总计
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String year);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业负债总计
     *
     * @mbggenerated
     */
    int insert(TotalDebtOfAutoIndustryInChina record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业负债总计
     *
     * @mbggenerated
     */
    int insertSelective(TotalDebtOfAutoIndustryInChina record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业负债总计
     *
     * @mbggenerated
     */
    TotalDebtOfAutoIndustryInChina selectByPrimaryKey(String year);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业负债总计
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TotalDebtOfAutoIndustryInChina record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业负债总计
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TotalDebtOfAutoIndustryInChina record);

    @Select("SELECT * FROM citicup.中国汽车行业负债总计")
    List<TotalDebtOfAutoIndustryInChina> getAll();
}