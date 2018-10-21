package com.citicup.dao.correlationAnalysis;

import com.citicup.model.correlationAnalysis.stockPE;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface stockPEMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stockpe
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String stkcd);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stockpe
     *
     * @mbggenerated
     */
    int insert(stockPE record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stockpe
     *
     * @mbggenerated
     */
    int insertSelective(stockPE record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stockpe
     *
     * @mbggenerated
     */
    stockPE selectByPrimaryKey(String stkcd);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stockpe
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(stockPE record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stockpe
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(stockPE record);

    @Select("SELECT * FROM citicup.stockpe")
    List<stockPE> getAll();
}