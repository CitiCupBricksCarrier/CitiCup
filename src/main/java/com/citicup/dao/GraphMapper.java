package com.citicup.dao;

import com.citicup.model.Graph;

public interface GraphMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graph
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String graphid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graph
     *
     * @mbggenerated
     */
    int insert(Graph record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graph
     *
     * @mbggenerated
     */
    int insertSelective(Graph record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graph
     *
     * @mbggenerated
     */
    Graph selectByPrimaryKey(String graphid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graph
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Graph record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graph
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Graph record);
}