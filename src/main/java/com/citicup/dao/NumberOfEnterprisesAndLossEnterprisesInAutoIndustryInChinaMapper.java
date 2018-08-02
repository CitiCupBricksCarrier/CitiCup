package com.citicup.dao;

import com.citicup.model.NumberOfEnterprisesAndLossEnterprisesInAutoIndustryInChina;

public interface NumberOfEnterprisesAndLossEnterprisesInAutoIndustryInChinaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业企业和亏损企业数量
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String year);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业企业和亏损企业数量
     *
     * @mbggenerated
     */
    int insert(NumberOfEnterprisesAndLossEnterprisesInAutoIndustryInChina record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业企业和亏损企业数量
     *
     * @mbggenerated
     */
    int insertSelective(NumberOfEnterprisesAndLossEnterprisesInAutoIndustryInChina record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业企业和亏损企业数量
     *
     * @mbggenerated
     */
    NumberOfEnterprisesAndLossEnterprisesInAutoIndustryInChina selectByPrimaryKey(String year);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业企业和亏损企业数量
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(NumberOfEnterprisesAndLossEnterprisesInAutoIndustryInChina record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业企业和亏损企业数量
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(NumberOfEnterprisesAndLossEnterprisesInAutoIndustryInChina record);
}