package com.citicup.dao.dataDisplay;

import com.citicup.model.dataDisplay.AutomobileIndustryNews;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AutomobileIndustryNewsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 汽车行业新闻
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String f1);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 汽车行业新闻
     *
     * @mbggenerated
     */
    int insert(AutomobileIndustryNews record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 汽车行业新闻
     *
     * @mbggenerated
     */
    int insertSelective(AutomobileIndustryNews record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 汽车行业新闻
     *
     * @mbggenerated
     */
    AutomobileIndustryNews selectByPrimaryKey(String f1);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 汽车行业新闻
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AutomobileIndustryNews record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 汽车行业新闻
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AutomobileIndustryNews record);

    @Select("SELECT * FROM citicup.汽车行业新闻")
    List<AutomobileIndustryNews> getAll();
}