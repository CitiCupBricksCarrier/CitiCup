package com.citicup.dao;

import com.citicup.model.TheGlobalCarOwnershipPerOneThousandPeople;

public interface TheGlobalCarOwnershipPerOneThousandPeopleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 全球每千人汽车保有量
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String f1);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 全球每千人汽车保有量
     *
     * @mbggenerated
     */
    int insert(TheGlobalCarOwnershipPerOneThousandPeople record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 全球每千人汽车保有量
     *
     * @mbggenerated
     */
    int insertSelective(TheGlobalCarOwnershipPerOneThousandPeople record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 全球每千人汽车保有量
     *
     * @mbggenerated
     */
    TheGlobalCarOwnershipPerOneThousandPeople selectByPrimaryKey(String f1);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 全球每千人汽车保有量
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TheGlobalCarOwnershipPerOneThousandPeople record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 全球每千人汽车保有量
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TheGlobalCarOwnershipPerOneThousandPeople record);
}