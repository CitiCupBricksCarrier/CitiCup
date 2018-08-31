package com.citicup.dao.dataDisplay;

import com.citicup.model.dataDisplay.MonthlyAverageMarketPriceOfNaturalRubberInChina;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MonthlyAverageMarketPriceOfNaturalRubberInChinaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国天然橡胶月均市场价
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String month);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国天然橡胶月均市场价
     *
     * @mbggenerated
     */
    int insert(MonthlyAverageMarketPriceOfNaturalRubberInChina record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国天然橡胶月均市场价
     *
     * @mbggenerated
     */
    int insertSelective(MonthlyAverageMarketPriceOfNaturalRubberInChina record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国天然橡胶月均市场价
     *
     * @mbggenerated
     */
    MonthlyAverageMarketPriceOfNaturalRubberInChina selectByPrimaryKey(String month);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国天然橡胶月均市场价
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MonthlyAverageMarketPriceOfNaturalRubberInChina record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国天然橡胶月均市场价
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MonthlyAverageMarketPriceOfNaturalRubberInChina record);

    @Select("SELECT * FROM citicup.中国天然橡胶月均市场价")
    List<MonthlyAverageMarketPriceOfNaturalRubberInChina> getAll();
}