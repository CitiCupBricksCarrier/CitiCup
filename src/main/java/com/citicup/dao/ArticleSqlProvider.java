package com.citicup.dao;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.citicup.model.Article;

public class ArticleSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated
     */
    public String insertSelective(Article record) {
        BEGIN();
        INSERT_INTO("article");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getGraphid() != null) {
            VALUES("graphId", "#{graphid,jdbcType=VARCHAR}");
        }
        
        if (record.getAuthor() != null) {
            VALUES("author", "#{author,jdbcType=VARCHAR}");
        }
        
        if (record.getTime() != null) {
            VALUES("time", "#{time,jdbcType=VARCHAR}");
        }
        
        if (record.getTitle() != null) {
            VALUES("title", "#{title,jdbcType=VARCHAR}");
        }
        
        if (record.getWatchnum() != null) {
            VALUES("watchNum", "#{watchnum,jdbcType=VARCHAR}");
        }
        
        if (record.getText() != null) {
            VALUES("text", "#{text,jdbcType=LONGVARCHAR}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(Article record) {
        BEGIN();
        UPDATE("article");
        
        if (record.getTime() != null) {
            SET("time = #{time,jdbcType=VARCHAR}");
        }
        
        if (record.getTitle() != null) {
            SET("title = #{title,jdbcType=VARCHAR}");
        }
        
        if (record.getWatchnum() != null) {
            SET("watchNum = #{watchnum,jdbcType=VARCHAR}");
        }
        
        if (record.getText() != null) {
            SET("text = #{text,jdbcType=LONGVARCHAR}");
        }
        
        WHERE("id = #{id,jdbcType=VARCHAR}");
        WHERE("graphId = #{graphid,jdbcType=VARCHAR}");
        WHERE("author = #{author,jdbcType=VARCHAR}");
        
        return SQL();
    }
}