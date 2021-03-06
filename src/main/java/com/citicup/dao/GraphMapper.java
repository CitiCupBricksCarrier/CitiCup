package com.citicup.dao;

import com.citicup.model.Graph;
import com.citicup.model.dataDisplay.AmericanCarSales;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface GraphMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graph
     *
     * @mbggenerated
     */
    @Delete({
        "delete from graph",
        "where graphId = #{graphid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String graphid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graph
     *
     * @mbggenerated
     */
    @Insert({
        "insert into graph (graphId, author, ",
        "up, down)",
        "values (#{graphid,jdbcType=VARCHAR}, #{author,jdbcType=VARCHAR}, ",
        "#{up,jdbcType=INTEGER}, #{down,jdbcType=INTEGER})"
    })
    int insert(Graph record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graph
     *
     * @mbggenerated
     */
    @InsertProvider(type=GraphSqlProvider.class, method="insertSelective")
    int insertSelective(Graph record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graph
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "graphId, author, up, down",
        "from graph",
        "where graphId = #{graphid,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="graphId", property="graphid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="author", property="author", jdbcType=JdbcType.VARCHAR),
        @Result(column="up", property="up", jdbcType=JdbcType.INTEGER),
        @Result(column="down", property="down", jdbcType=JdbcType.INTEGER)
    })
    Graph selectByPrimaryKey(String graphid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graph
     *
     * @mbggenerated
     */
    @UpdateProvider(type=GraphSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Graph record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graph
     *
     * @mbggenerated
     */
    @Update({
        "update graph",
        "set author = #{author,jdbcType=VARCHAR},",
          "up = #{up,jdbcType=INTEGER},",
          "down = #{down,jdbcType=INTEGER}",
        "where graphId = #{graphid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Graph record);

    @Select({"select * from graph where author = #{author,jdbcType=VARCHAR}"})
    List<Graph> selectByAuthor(String author);

    @Select({"select * from graph"})
    List<Graph> selectAll();
}