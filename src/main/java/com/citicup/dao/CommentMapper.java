package com.citicup.dao;

import com.citicup.model.Comment;
import com.citicup.model.CommentKey;
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

public interface CommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated
     */
    @Delete({
        "delete from comment",
        "where author = #{author,jdbcType=VARCHAR}",
          "and graphId = #{graphid,jdbcType=VARCHAR}",
          "and time = #{time,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(CommentKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated
     */
    @Insert({
        "insert into comment (author, graphId, ",
        "time, comment, up, ",
        "down)",
        "values (#{author,jdbcType=VARCHAR}, #{graphid,jdbcType=VARCHAR}, ",
        "#{time,jdbcType=VARCHAR}, #{comment,jdbcType=VARCHAR}, #{up,jdbcType=INTEGER}, ",
        "#{down,jdbcType=INTEGER})"
    })
    int insert(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated
     */
    @InsertProvider(type=CommentSqlProvider.class, method="insertSelective")
    int insertSelective(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "author, graphId, time, comment, up, down",
        "from comment",
        "where author = #{author,jdbcType=VARCHAR}",
          "and graphId = #{graphid,jdbcType=VARCHAR}",
          "and time = #{time,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="author", property="author", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="graphId", property="graphid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="time", property="time", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="comment", property="comment", jdbcType=JdbcType.VARCHAR),
        @Result(column="up", property="up", jdbcType=JdbcType.INTEGER),
        @Result(column="down", property="down", jdbcType=JdbcType.INTEGER)
    })
    Comment selectByPrimaryKey(CommentKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated
     */
    @UpdateProvider(type=CommentSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated
     */
    @Update({
        "update comment",
        "set comment = #{comment,jdbcType=VARCHAR},",
          "up = #{up,jdbcType=INTEGER},",
          "down = #{down,jdbcType=INTEGER}",
        "where author = #{author,jdbcType=VARCHAR}",
          "and graphId = #{graphid,jdbcType=VARCHAR}",
          "and time = #{time,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Comment record);

    @Select({"SELECT * FROM comment WHERE graphid = #{graphId, jdbcType=VARCHAR}"})
    List<Comment> getAllById(String graphId);
}