package com.citicup.dao.dataDisplay;

import com.citicup.model.dataDisplay.ConsumptionExpenditureOfChineseResidents;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ConsumptionExpenditureOfChineseResidentsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国居民消费支出
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String year);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国居民消费支出
     *
     * @mbggenerated
     */
    int insert(ConsumptionExpenditureOfChineseResidents record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国居民消费支出
     *
     * @mbggenerated
     */
    int insertSelective(ConsumptionExpenditureOfChineseResidents record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国居民消费支出
     *
     * @mbggenerated
     */
    ConsumptionExpenditureOfChineseResidents selectByPrimaryKey(String year);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国居民消费支出
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ConsumptionExpenditureOfChineseResidents record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国居民消费支出
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ConsumptionExpenditureOfChineseResidents record);

    @Select("SELECT * FROM citicup.中国居民消费支出")
    List<ConsumptionExpenditureOfChineseResidents> getAll();
}