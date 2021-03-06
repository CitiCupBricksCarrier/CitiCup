package com.citicup.dao;

import com.citicup.model.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    @Delete({
        "delete from user",
        "where uid = #{uid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    @Insert({
        "insert into user (uid, phoneNum, ",
        "password, isBinded, ",
        "citiNum, name, sex, ",
        "birthday, idNum, ",
        "occupation, organization, ",
        "contactNum, address, ",
        "summary, credit)",
        "values (#{uid,jdbcType=VARCHAR}, #{phonenum,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{isbinded,jdbcType=TINYINT}, ",
        "#{citinum,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, #{sex,jdbcType=CHAR}, ",
        "#{birthday,jdbcType=VARCHAR}, #{idnum,jdbcType=VARCHAR}, ",
        "#{occupation,jdbcType=VARCHAR}, #{organization,jdbcType=VARCHAR}, ",
        "#{contactnum,jdbcType=VARCHAR}, #{address,jdbcType=VARCHAR}, ",
        "#{summary,jdbcType=VARCHAR}, #{credit,jdbcType=INTEGER})"
    })
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    @InsertProvider(type=UserSqlProvider.class, method="insertSelective")
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "uid, phoneNum, password, isBinded, citiNum, name, sex, birthday, idNum, occupation, ",
        "organization, contactNum, address, summary, credit",
        "from user",
        "where uid = #{uid,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="uid", property="uid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="phoneNum", property="phonenum", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="isBinded", property="isbinded", jdbcType=JdbcType.TINYINT),
        @Result(column="citiNum", property="citinum", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.CHAR),
        @Result(column="birthday", property="birthday", jdbcType=JdbcType.VARCHAR),
        @Result(column="idNum", property="idnum", jdbcType=JdbcType.VARCHAR),
        @Result(column="occupation", property="occupation", jdbcType=JdbcType.VARCHAR),
        @Result(column="organization", property="organization", jdbcType=JdbcType.VARCHAR),
        @Result(column="contactNum", property="contactnum", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="summary", property="summary", jdbcType=JdbcType.VARCHAR),
        @Result(column="credit", property="credit", jdbcType=JdbcType.INTEGER)
    })
    User selectByPrimaryKey(String uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    @UpdateProvider(type=UserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    @Update({
        "update user",
        "set phoneNum = #{phonenum,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "isBinded = #{isbinded,jdbcType=TINYINT},",
          "citiNum = #{citinum,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "sex = #{sex,jdbcType=CHAR},",
          "birthday = #{birthday,jdbcType=VARCHAR},",
          "idNum = #{idnum,jdbcType=VARCHAR},",
          "occupation = #{occupation,jdbcType=VARCHAR},",
          "organization = #{organization,jdbcType=VARCHAR},",
          "contactNum = #{contactnum,jdbcType=VARCHAR},",
          "address = #{address,jdbcType=VARCHAR},",
          "summary = #{summary,jdbcType=VARCHAR},",
          "credit = #{credit,jdbcType=INTEGER}",
        "where uid = #{uid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(User record);
}