package com.citicup.dao.peValuation;

import com.citicup.model.peValuation.DisposedProfit;
import com.citicup.model.peValuation.DisposedProfitKey;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DisposedProfitMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 处理后利润表
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(DisposedProfitKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 处理后利润表
     *
     * @mbggenerated
     */
    int insert(DisposedProfit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 处理后利润表
     *
     * @mbggenerated
     */
    int insertSelective(DisposedProfit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 处理后利润表
     *
     * @mbggenerated
     */
    DisposedProfit selectByPrimaryKey(DisposedProfitKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 处理后利润表
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(DisposedProfit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 处理后利润表
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DisposedProfit record);

    @Select("SELECT * FROM citicup.处理后利润表")
    List<DisposedProfit> getAll();
}