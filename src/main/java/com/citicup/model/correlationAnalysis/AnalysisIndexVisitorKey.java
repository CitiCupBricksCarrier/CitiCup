package com.citicup.model.correlationAnalysis;

import java.io.Serializable;
import java.util.Date;

public class AnalysisIndexVisitorKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 分析指标每日选择人数.AnalysisIndex
     *
     * @mbggenerated
     */
    private String analysisindex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 分析指标每日选择人数.date
     *
     * @mbggenerated
     */
    private Date date;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 分析指标每日选择人数
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 分析指标每日选择人数.AnalysisIndex
     *
     * @return the value of 分析指标每日选择人数.AnalysisIndex
     *
     * @mbggenerated
     */
    public String getAnalysisindex() {
        return analysisindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 分析指标每日选择人数.AnalysisIndex
     *
     * @param analysisindex the value for 分析指标每日选择人数.AnalysisIndex
     *
     * @mbggenerated
     */
    public void setAnalysisindex(String analysisindex) {
        this.analysisindex = analysisindex == null ? null : analysisindex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 分析指标每日选择人数.date
     *
     * @return the value of 分析指标每日选择人数.date
     *
     * @mbggenerated
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 分析指标每日选择人数.date
     *
     * @param date the value for 分析指标每日选择人数.date
     *
     * @mbggenerated
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 分析指标每日选择人数
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AnalysisIndexVisitorKey other = (AnalysisIndexVisitorKey) that;
        return (this.getAnalysisindex() == null ? other.getAnalysisindex() == null : this.getAnalysisindex().equals(other.getAnalysisindex()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 分析指标每日选择人数
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAnalysisindex() == null) ? 0 : getAnalysisindex().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 分析指标每日选择人数
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", analysisindex=").append(analysisindex);
        sb.append(", date=").append(date);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}