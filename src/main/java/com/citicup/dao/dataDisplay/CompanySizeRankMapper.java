package com.citicup.dao.dataDisplay;

import com.citicup.model.dataDisplay.CompanySizeRank;
import com.citicup.model.dataDisplay.CompanySizeRankKey;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CompanySizeRankMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 公司规模排序
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(CompanySizeRankKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 公司规模排序
     *
     * @mbggenerated
     */
    int insert(CompanySizeRank record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 公司规模排序
     *
     * @mbggenerated
     */
    int insertSelective(CompanySizeRank record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 公司规模排序
     *
     * @mbggenerated
     */
    CompanySizeRank selectByPrimaryKey(CompanySizeRankKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 公司规模排序
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CompanySizeRank record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 公司规模排序
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CompanySizeRank record);

    @Select("SELECT * FROM citicup.公司规模排序")
    List<CompanySizeRank> getAll();

    //根据分类找所有stkcd
    @Select("SELECT stkcd FROM citicup.公司规模排序 WHERE category = #{category}")
    List<String> getAllStkcd(String category);

    //根据stkcd找所有分类
    @Select("SELECT category FROM citicup.公司规模排序 WHERE stkcd = #{stkcd}")
    List<String> getAllCategory(String stkcd);
}