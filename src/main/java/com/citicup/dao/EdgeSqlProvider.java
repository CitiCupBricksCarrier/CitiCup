package com.citicup.dao;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.citicup.model.Edge;

public class EdgeSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edge
     *
     * @mbggenerated
     */
    public String insertSelective(Edge record) {
        BEGIN();
        INSERT_INTO("edge");
        
        if (record.getStkcda() != null) {
            VALUES("stkcdA", "#{stkcda,jdbcType=VARCHAR}");
        }
        
        if (record.getStkcdb() != null) {
            VALUES("stkcdB", "#{stkcdb,jdbcType=VARCHAR}");
        }
        
        if (record.getGraphid() != null) {
            VALUES("graphId", "#{graphid,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            VALUES("status", "#{status,jdbcType=TINYINT}");
        }
        
        if (record.getPropagateproba() != null) {
            VALUES("propagateProbA", "#{propagateproba,jdbcType=DOUBLE}");
        }
        
        if (record.getPropagateprobb() != null) {
            VALUES("propagateProbB", "#{propagateprobb,jdbcType=DOUBLE}");
        }
        
        if (record.getFund() != null) {
            VALUES("fund", "#{fund,jdbcType=DOUBLE}");
        }
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getBegin() != null) {
            VALUES("begin", "#{begin,jdbcType=VARCHAR}");
        }
        
        if (record.getEnd() != null) {
            VALUES("end", "#{end,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edge
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(Edge record) {
        BEGIN();
        UPDATE("edge");
        
        if (record.getStatus() != null) {
            SET("status = #{status,jdbcType=TINYINT}");
        }
        
        if (record.getPropagateproba() != null) {
            SET("propagateProbA = #{propagateproba,jdbcType=DOUBLE}");
        }
        
        if (record.getPropagateprobb() != null) {
            SET("propagateProbB = #{propagateprobb,jdbcType=DOUBLE}");
        }
        
        if (record.getFund() != null) {
            SET("fund = #{fund,jdbcType=DOUBLE}");
        }
        
        if (record.getId() != null) {
            SET("id = #{id,jdbcType=VARCHAR}");
        }
        
        if (record.getBegin() != null) {
            SET("begin = #{begin,jdbcType=VARCHAR}");
        }
        
        if (record.getEnd() != null) {
            SET("end = #{end,jdbcType=VARCHAR}");
        }
        
        WHERE("stkcdA = #{stkcda,jdbcType=VARCHAR}");
        WHERE("stkcdB = #{stkcdb,jdbcType=VARCHAR}");
        WHERE("graphId = #{graphid,jdbcType=VARCHAR}");
        
        return SQL();
    }
}