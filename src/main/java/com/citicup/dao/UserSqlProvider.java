package com.citicup.dao;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.citicup.model.User;

public class UserSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    public String insertSelective(User record) {
        BEGIN();
        INSERT_INTO("user");
        
        if (record.getUid() != null) {
            VALUES("uid", "#{uid,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getPhonenum() != null) {
            VALUES("phoneNum", "#{phonenum,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            VALUES("password", "#{password,jdbcType=VARCHAR}");
        }
        
        if (record.getIsvip() != null) {
            VALUES("isVip", "#{isvip,jdbcType=TINYINT}");
        }
        
        if (record.getSummary() != null) {
            VALUES("summary", "#{summary,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(User record) {
        BEGIN();
        UPDATE("user");
        
        if (record.getName() != null) {
            SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getPhonenum() != null) {
            SET("phoneNum = #{phonenum,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            SET("password = #{password,jdbcType=VARCHAR}");
        }
        
        if (record.getIsvip() != null) {
            SET("isVip = #{isvip,jdbcType=TINYINT}");
        }
        
        if (record.getSummary() != null) {
            SET("summary = #{summary,jdbcType=VARCHAR}");
        }
        
        WHERE("uid = #{uid,jdbcType=VARCHAR}");
        
        return SQL();
    }
}