package com.citicup.dao;

import com.citicup.model.News;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface NewsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated
     */
    @Insert({
        "insert into news (stkcd, compName, ",
        "info)",
        "values (#{stkcd,jdbcType=VARCHAR}, #{compname,jdbcType=VARCHAR}, ",
        "#{info,jdbcType=LONGVARCHAR})"
    })
    int insert(News record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated
     */
    @InsertProvider(type=NewsSqlProvider.class, method="insertSelective")
    int insertSelective(News record);

    @Select({
            "select",
            "stkcd, compname, info",
            "from news",
            "where stkcd = #{stkcd,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="stkcd", property="stkcd", jdbcType=JdbcType.VARCHAR),
            @Result(column="compname", property="compname", jdbcType=JdbcType.VARCHAR),
            @Result(column="info", property="info", jdbcType=JdbcType.LONGVARCHAR)
    })
    News getNews(String stkcd);
}