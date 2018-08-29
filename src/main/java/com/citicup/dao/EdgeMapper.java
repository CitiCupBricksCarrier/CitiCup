package com.citicup.dao;

import com.citicup.model.Edge;
import com.citicup.model.EdgeKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface EdgeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edge
     *
     * @mbggenerated
     */
    @Delete({
        "delete from edge",
        "where stkcdA = #{stkcda,jdbcType=VARCHAR}",
          "and stkcdB = #{stkcdb,jdbcType=VARCHAR}",
          "and graphId = #{graphid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(EdgeKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edge
     *
     * @mbggenerated
     */
    @Insert({
        "insert into edge (stkcdA, stkcdB, ",
        "graphId, status, ",
        "propagateProbA, propagateProbB, ",
        "fund)",
        "values (#{stkcda,jdbcType=VARCHAR}, #{stkcdb,jdbcType=VARCHAR}, ",
        "#{graphid,jdbcType=VARCHAR}, #{status,jdbcType=TINYINT}, ",
        "#{propagateproba,jdbcType=DOUBLE}, #{propagateprobb,jdbcType=DOUBLE}, ",
        "#{fund,jdbcType=DOUBLE})"
    })
    int insert(Edge record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edge
     *
     * @mbggenerated
     */
    @InsertProvider(type=EdgeSqlProvider.class, method="insertSelective")
    int insertSelective(Edge record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edge
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "stkcdA, stkcdB, graphId, status, propagateProbA, propagateProbB, fund",
        "from edge",
        "where stkcdA = #{stkcda,jdbcType=VARCHAR}",
          "and stkcdB = #{stkcdb,jdbcType=VARCHAR}",
          "and graphId = #{graphid,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="stkcdA", property="stkcda", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="stkcdB", property="stkcdb", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="graphId", property="graphid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="propagateProbA", property="propagateproba", jdbcType=JdbcType.DOUBLE),
        @Result(column="propagateProbB", property="propagateprobb", jdbcType=JdbcType.DOUBLE),
        @Result(column="fund", property="fund", jdbcType=JdbcType.DOUBLE)
    })
    Edge selectByPrimaryKey(EdgeKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edge
     *
     * @mbggenerated
     */
    @UpdateProvider(type=EdgeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Edge record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edge
     *
     * @mbggenerated
     */
    @Update({
        "update edge",
        "set status = #{status,jdbcType=TINYINT},",
          "propagateProbA = #{propagateproba,jdbcType=DOUBLE},",
          "propagateProbB = #{propagateprobb,jdbcType=DOUBLE},",
          "fund = #{fund,jdbcType=DOUBLE}",
        "where stkcdA = #{stkcda,jdbcType=VARCHAR}",
          "and stkcdB = #{stkcdb,jdbcType=VARCHAR}",
          "and graphId = #{graphid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Edge record);
}