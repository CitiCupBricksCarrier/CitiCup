package com.citicup.dao;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.citicup.model.Comment;

public class CommentSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated
     */
    public String insertSelective(Comment record) {
        BEGIN();
        INSERT_INTO("comment");
        
        if (record.getAuthor() != null) {
            VALUES("author", "#{author,jdbcType=VARCHAR}");
        }
        
        if (record.getArticleid() != null) {
            VALUES("articleId", "#{articleid,jdbcType=VARCHAR}");
        }
        
        if (record.getTime() != null) {
            VALUES("time", "#{time,jdbcType=VARCHAR}");
        }
        
        if (record.getComment() != null) {
            VALUES("comment", "#{comment,jdbcType=VARCHAR}");
        }
        
        if (record.getUp() != null) {
            VALUES("up", "#{up,jdbcType=INTEGER}");
        }
        
        if (record.getDown() != null) {
            VALUES("down", "#{down,jdbcType=INTEGER}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(Comment record) {
        BEGIN();
        UPDATE("comment");
        
        if (record.getComment() != null) {
            SET("comment = #{comment,jdbcType=VARCHAR}");
        }
        
        if (record.getUp() != null) {
            SET("up = #{up,jdbcType=INTEGER}");
        }
        
        if (record.getDown() != null) {
            SET("down = #{down,jdbcType=INTEGER}");
        }
        
        WHERE("author = #{author,jdbcType=VARCHAR}");
        WHERE("articleId = #{articleid,jdbcType=VARCHAR}");
        WHERE("time = #{time,jdbcType=VARCHAR}");
        
        return SQL();
    }
}