package com.citicup.dao;

import com.citicup.model.AssetLiabilityRatio;
import com.citicup.model.AssetLiabilityRatioKey;

public interface AssetLiabilityRatioMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 资产负债率
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(AssetLiabilityRatioKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 资产负债率
     *
     * @mbggenerated
     */
    int insert(AssetLiabilityRatio record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 资产负债率
     *
     * @mbggenerated
     */
    int insertSelective(AssetLiabilityRatio record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 资产负债率
     *
     * @mbggenerated
     */
    AssetLiabilityRatio selectByPrimaryKey(AssetLiabilityRatioKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 资产负债率
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AssetLiabilityRatio record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 资产负债率
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AssetLiabilityRatio record);
}