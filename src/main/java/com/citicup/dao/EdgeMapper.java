package com.citicup.dao;

import com.citicup.model.Edge;
import com.citicup.model.EdgeKey;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

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
        "fund, id, begin, ",
        "end)",
        "values (#{stkcda,jdbcType=VARCHAR}, #{stkcdb,jdbcType=VARCHAR}, ",
        "#{graphid,jdbcType=VARCHAR}, #{status,jdbcType=TINYINT}, ",
        "#{propagateproba,jdbcType=DOUBLE}, #{propagateprobb,jdbcType=DOUBLE}, ",
        "#{fund,jdbcType=DOUBLE}, #{id,jdbcType=VARCHAR}, #{begin,jdbcType=VARCHAR}, ",
        "#{end,jdbcType=VARCHAR})"
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
        "stkcdA, stkcdB, graphId, status, propagateProbA, propagateProbB, fund, id, begin, ",
        "end",
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
        @Result(column="fund", property="fund", jdbcType=JdbcType.DOUBLE),
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR),
        @Result(column="begin", property="begin", jdbcType=JdbcType.VARCHAR),
        @Result(column="end", property="end", jdbcType=JdbcType.VARCHAR)
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
          "fund = #{fund,jdbcType=DOUBLE},",
          "id = #{id,jdbcType=VARCHAR},",
          "begin = #{begin,jdbcType=VARCHAR},",
          "end = #{end,jdbcType=VARCHAR}",
        "where stkcdA = #{stkcda,jdbcType=VARCHAR}",
          "and stkcdB = #{stkcdb,jdbcType=VARCHAR}",
          "and graphId = #{graphid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Edge record);

    @Select({"SELECT * FROM edge WHERE graphid = #{graphId, jdbcType=VARCHAR}"})
    List<Edge> getAllById(String graphId);

    @Insert({"<script> INSERT INTO edge(stkcdA, stkcdB, graphId, status, propagateProbA, propagateProbB, fund, id, begin, end) " +
            "VALUES " +
            "<foreach collection=\"list\" item=\"item\" index=\"index\"  separator=\",\"> "+
            "(#{item.stkcdA},#{item.stkcdB},#{item.graphId},#{item.status},#{item.propagateProbA},#{item.propagateProbB},#{item.fund},#{item.id},#{item.begin},#{item.end})"+
            "</foreach> </script>"})
    int saveEdgeList(@Param("list") List<Edge> list);

    @Delete({"DELETE FROM edge where graphid = #{item, jdbcType=VARCHAR}"})
    int deleteByGraphId(String graphId);
}