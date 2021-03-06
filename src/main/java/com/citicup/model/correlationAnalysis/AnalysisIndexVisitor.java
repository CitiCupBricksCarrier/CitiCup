package com.citicup.model.correlationAnalysis;

import java.io.Serializable;

public class AnalysisIndexVisitor extends AnalysisIndexVisitorKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 分析指标每日选择人数.vistorNumber
     *
     * @mbggenerated
     */
    private Integer vistornumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 分析指标每日选择人数
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 分析指标每日选择人数.vistorNumber
     *
     * @return the value of 分析指标每日选择人数.vistorNumber
     *
     * @mbggenerated
     */
    public Integer getVistornumber() {
        return vistornumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 分析指标每日选择人数.vistorNumber
     *
     * @param vistornumber the value for 分析指标每日选择人数.vistorNumber
     *
     * @mbggenerated
     */
    public void setVistornumber(Integer vistornumber) {
        this.vistornumber = vistornumber;
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
        AnalysisIndexVisitor other = (AnalysisIndexVisitor) that;
        return (this.getAnalysisindex() == null ? other.getAnalysisindex() == null : this.getAnalysisindex().equals(other.getAnalysisindex()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getVistornumber() == null ? other.getVistornumber() == null : this.getVistornumber().equals(other.getVistornumber()));
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
        result = prime * result + ((getVistornumber() == null) ? 0 : getVistornumber().hashCode());
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
        sb.append(", vistornumber=").append(vistornumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}