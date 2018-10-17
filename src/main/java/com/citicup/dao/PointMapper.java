package com.citicup.dao;

import com.citicup.model.Point;
import com.citicup.model.PointKey;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface PointMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point
     *
     * @mbggenerated
     */
    @Delete({
        "delete from point",
        "where stkcd = #{stkcd,jdbcType=VARCHAR}",
          "and graphId = #{graphid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(PointKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point
     *
     * @mbggenerated
     */
    @Insert({
        "insert into point (stkcd, graphId, ",
        "status, defectProb, ",
        "infectProb, infectProbTemp, ",
        "infectTime, timeLeft, ",
        "color, role, posx, ",
        "posy, name, id)",
        "values (#{stkcd,jdbcType=VARCHAR}, #{graphid,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=TINYINT}, #{defectprob,jdbcType=DOUBLE}, ",
        "#{infectprob,jdbcType=DOUBLE}, #{infectprobtemp,jdbcType=DOUBLE}, ",
        "#{infecttime,jdbcType=INTEGER}, #{timeleft,jdbcType=INTEGER}, ",
        "#{color,jdbcType=VARCHAR}, #{role,jdbcType=VARCHAR}, #{posx,jdbcType=VARCHAR}, ",
        "#{posy,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, #{id,jdbcType=VARCHAR})"
    })
    int insert(Point record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point
     *
     * @mbggenerated
     */
    @InsertProvider(type=PointSqlProvider.class, method="insertSelective")
    int insertSelective(Point record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "stkcd, graphId, status, defectProb, infectProb, infectProbTemp, infectTime, ",
        "timeLeft, color, role, posx, posy, name, id",
        "from point",
        "where stkcd = #{stkcd,jdbcType=VARCHAR}",
          "and graphId = #{graphid,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="stkcd", property="stkcd", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="graphId", property="graphid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="defectProb", property="defectprob", jdbcType=JdbcType.DOUBLE),
        @Result(column="infectProb", property="infectprob", jdbcType=JdbcType.DOUBLE),
        @Result(column="infectProbTemp", property="infectprobtemp", jdbcType=JdbcType.DOUBLE),
        @Result(column="infectTime", property="infecttime", jdbcType=JdbcType.INTEGER),
        @Result(column="timeLeft", property="timeleft", jdbcType=JdbcType.INTEGER),
        @Result(column="color", property="color", jdbcType=JdbcType.VARCHAR),
        @Result(column="role", property="role", jdbcType=JdbcType.VARCHAR),
        @Result(column="posx", property="posx", jdbcType=JdbcType.VARCHAR),
        @Result(column="posy", property="posy", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR)
    })
    Point selectByPrimaryKey(PointKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point
     *
     * @mbggenerated
     */
    @UpdateProvider(type=PointSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Point record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point
     *
     * @mbggenerated
     */
    @Update({
        "update point",
        "set status = #{status,jdbcType=TINYINT},",
          "defectProb = #{defectprob,jdbcType=DOUBLE},",
          "infectProb = #{infectprob,jdbcType=DOUBLE},",
          "infectProbTemp = #{infectprobtemp,jdbcType=DOUBLE},",
          "infectTime = #{infecttime,jdbcType=INTEGER},",
          "timeLeft = #{timeleft,jdbcType=INTEGER},",
          "color = #{color,jdbcType=VARCHAR},",
          "role = #{role,jdbcType=VARCHAR},",
          "posx = #{posx,jdbcType=VARCHAR},",
          "posy = #{posy,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "id = #{id,jdbcType=VARCHAR}",
        "where stkcd = #{stkcd,jdbcType=VARCHAR}",
          "and graphId = #{graphid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Point record);

    @Select({"SELECT * FROM point WHERE graphid = #{graphId, jdbcType=VARCHAR}"})
    List<Point> getAllById(String graphId);

    @Insert({"<script> INSERT INTO point(stkcd,graphid,status,defectprob,infectprob,infectprobtemp,infecttime,timeleft,color,role,posx,posy,name,id) " +
            "VALUES " +
            "<foreach collection=\"list\" item=\"item\" index=\"index\"  separator=\",\"> "+
            "(#{item.stkcd},#{item.graphid},#{item.status},#{item.defectprob},#{item.infectprob},#{item.infectprobtemp},#{item.infecttime},#{item.timeleft},#{item.color},#{item.role},#{item.posx},#{item.posy},#{item.name},#{item.id})"+
            "</foreach> </script>"})
    int savePointList(@Param("list") List<Point> list);

    @Delete({"DELETE FROM edge where graphid = #{item, jdbcType=VARCHAR}"})
    int deleteByGraphId(String graphId);
}