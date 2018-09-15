package com.citicup.dao.correlationAnalysis;

import com.citicup.model.correlationAnalysis.ConsistenceExpectation;
import com.citicup.model.correlationAnalysis.ConsistenceExpectationKey;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ConsistenceExpectationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 分析师类一致预期pb
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(ConsistenceExpectationKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 分析师类一致预期pb
     *
     * @mbggenerated
     */
    int insert(ConsistenceExpectation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 分析师类一致预期pb
     *
     * @mbggenerated
     */
    int insertSelective(ConsistenceExpectation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 分析师类一致预期pb
     *
     * @mbggenerated
     */
    ConsistenceExpectation selectByPrimaryKey(ConsistenceExpectationKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 分析师类一致预期pb
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ConsistenceExpectation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 分析师类一致预期pb
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ConsistenceExpectation record);

    @Select("SELECT * FROM citicup.分析师类一致预期pb")
    List<ConsistenceExpectation> getAll();
}