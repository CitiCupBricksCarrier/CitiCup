package com.citicup.dao;

import com.citicup.model.AutomobileIndustryBulletinInformation;
import com.citicup.model.AutomobileIndustryBulletinInformationKey;

public interface AutomobileIndustryBulletinInformationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 汽车行业公告信息
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(AutomobileIndustryBulletinInformationKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 汽车行业公告信息
     *
     * @mbggenerated
     */
    int insert(AutomobileIndustryBulletinInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 汽车行业公告信息
     *
     * @mbggenerated
     */
    int insertSelective(AutomobileIndustryBulletinInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 汽车行业公告信息
     *
     * @mbggenerated
     */
    AutomobileIndustryBulletinInformation selectByPrimaryKey(AutomobileIndustryBulletinInformationKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 汽车行业公告信息
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AutomobileIndustryBulletinInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 汽车行业公告信息
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AutomobileIndustryBulletinInformation record);
}