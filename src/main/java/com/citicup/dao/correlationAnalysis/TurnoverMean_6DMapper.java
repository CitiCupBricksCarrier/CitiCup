package com.citicup.dao.correlationAnalysis;

import com.citicup.model.correlationAnalysis.TurnoverMean_6D;
import com.citicup.model.correlationAnalysis.TurnoverMean_6DKey;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TurnoverMean_6DMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 价量6日成交额均值千元
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(TurnoverMean_6DKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 价量6日成交额均值千元
     *
     * @mbggenerated
     */
    int insert(TurnoverMean_6D record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 价量6日成交额均值千元
     *
     * @mbggenerated
     */
    int insertSelective(TurnoverMean_6D record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 价量6日成交额均值千元
     *
     * @mbggenerated
     */
    TurnoverMean_6D selectByPrimaryKey(TurnoverMean_6DKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 价量6日成交额均值千元
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TurnoverMean_6D record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 价量6日成交额均值千元
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TurnoverMean_6D record);

    @Select("SELECT * FROM citicup.价量6日成交额均值千元 WHERE value is not NULL")
    List<TurnoverMean_6D> getAll();
}