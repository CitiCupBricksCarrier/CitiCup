package com.citicup.dao.correlationAnalysis;

import com.citicup.model.correlationAnalysis.stockEPS;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface stockEPSMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stockeps
     *
     * @mbggenerated
     */
    int insert(stockEPS record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stockeps
     *
     * @mbggenerated
     */
    int insertSelective(stockEPS record);

    @Select("SELECT * FROM citicup.stockeps")
    List<stockEPS> getAll();
}