package com.citicup.dao.dataDisplay;

import com.citicup.model.dataDisplay.ChineseAutoIndustryNewCapacity;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ChineseAutoIndustryNewCapacityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业新增产能
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String f1);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业新增产能
     *
     * @mbggenerated
     */
    int insert(ChineseAutoIndustryNewCapacity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业新增产能
     *
     * @mbggenerated
     */
    int insertSelective(ChineseAutoIndustryNewCapacity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业新增产能
     *
     * @mbggenerated
     */
    ChineseAutoIndustryNewCapacity selectByPrimaryKey(String f1);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业新增产能
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ChineseAutoIndustryNewCapacity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业新增产能
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ChineseAutoIndustryNewCapacity record);

    @Select("SELECT * FROM citicup.中国汽车行业新增产能")
    List<ChineseAutoIndustryNewCapacity> getAll();
}