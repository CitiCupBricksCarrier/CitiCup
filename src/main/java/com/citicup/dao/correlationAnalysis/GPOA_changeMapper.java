package com.citicup.dao.correlationAnalysis;

import com.citicup.model.correlationAnalysis.GPOA_change;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GPOA_changeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 成长类-gpoa变动
     *
     * @mbggenerated
     */
    int insert(GPOA_change record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 成长类-gpoa变动
     *
     * @mbggenerated
     */
    int insertSelective(GPOA_change record);

    @Select("SELECT * FROM citicup.成长类-gpoa变动")
    List<GPOA_change> getAll();
}