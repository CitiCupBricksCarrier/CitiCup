package com.citicup.dao.correlationAnalysis;

import com.citicup.model.correlationAnalysis.stockPrice;
import com.citicup.model.correlationAnalysis.stockPriceKey;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface stockPriceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stockprice
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(stockPriceKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stockprice
     *
     * @mbggenerated
     */
    int insert(stockPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stockprice
     *
     * @mbggenerated
     */
    int insertSelective(stockPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stockprice
     *
     * @mbggenerated
     */
    stockPrice selectByPrimaryKey(stockPriceKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stockprice
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(stockPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stockprice
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(stockPrice record);

    @Select("SELECT * FROM citicup.stockprice")
    List<stockPrice> getAll();
}