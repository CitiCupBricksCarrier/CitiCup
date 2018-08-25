package com.citicup.dao;

import com.citicup.model.TotalAssets;
import com.citicup.model.TotalAssetsKey;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TotalAssetsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 总资产
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(TotalAssetsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 总资产
     *
     * @mbggenerated
     */
    int insert(TotalAssets record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 总资产
     *
     * @mbggenerated
     */
    int insertSelective(TotalAssets record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 总资产
     *
     * @mbggenerated
     */
    TotalAssets selectByPrimaryKey(TotalAssetsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 总资产
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TotalAssets record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 总资产
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TotalAssets record);

    @Select("SELECT * FROM citicup.总资产")
    List<TotalAssets> getAll();
}