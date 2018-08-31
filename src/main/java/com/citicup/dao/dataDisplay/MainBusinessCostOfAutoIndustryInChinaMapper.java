package com.citicup.dao.dataDisplay;

import com.citicup.model.dataDisplay.MainBusinessCostOfAutoIndustryInChina;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MainBusinessCostOfAutoIndustryInChinaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业主营业务成本
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String year);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业主营业务成本
     *
     * @mbggenerated
     */
    int insert(MainBusinessCostOfAutoIndustryInChina record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业主营业务成本
     *
     * @mbggenerated
     */
    int insertSelective(MainBusinessCostOfAutoIndustryInChina record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业主营业务成本
     *
     * @mbggenerated
     */
    MainBusinessCostOfAutoIndustryInChina selectByPrimaryKey(String year);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业主营业务成本
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MainBusinessCostOfAutoIndustryInChina record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业主营业务成本
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MainBusinessCostOfAutoIndustryInChina record);

    @Select("SELECT * FROM citicup.中国汽车行业主营业务成本")
    List<MainBusinessCostOfAutoIndustryInChina> getAll();
}