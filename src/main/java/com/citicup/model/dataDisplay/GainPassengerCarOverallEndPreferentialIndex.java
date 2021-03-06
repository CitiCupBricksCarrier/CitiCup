package com.citicup.model.dataDisplay;

import java.io.Serializable;

public class GainPassengerCarOverallEndPreferentialIndex implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gain乘用车整体终端优惠指数.f1
     *
     * @mbggenerated
     */
    private String f1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gain乘用车整体终端优惠指数.overallTerminalPreferenceIndex
     *
     * @mbggenerated
     */
    private String overallterminalpreferenceindex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table gain乘用车整体终端优惠指数
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gain乘用车整体终端优惠指数.f1
     *
     * @return the value of gain乘用车整体终端优惠指数.f1
     *
     * @mbggenerated
     */
    public String getF1() {
        return f1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gain乘用车整体终端优惠指数.f1
     *
     * @param f1 the value for gain乘用车整体终端优惠指数.f1
     *
     * @mbggenerated
     */
    public void setF1(String f1) {
        this.f1 = f1 == null ? null : f1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gain乘用车整体终端优惠指数.overallTerminalPreferenceIndex
     *
     * @return the value of gain乘用车整体终端优惠指数.overallTerminalPreferenceIndex
     *
     * @mbggenerated
     */
    public String getOverallterminalpreferenceindex() {
        return overallterminalpreferenceindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gain乘用车整体终端优惠指数.overallTerminalPreferenceIndex
     *
     * @param overallterminalpreferenceindex the value for gain乘用车整体终端优惠指数.overallTerminalPreferenceIndex
     *
     * @mbggenerated
     */
    public void setOverallterminalpreferenceindex(String overallterminalpreferenceindex) {
        this.overallterminalpreferenceindex = overallterminalpreferenceindex == null ? null : overallterminalpreferenceindex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gain乘用车整体终端优惠指数
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
        GainPassengerCarOverallEndPreferentialIndex other = (GainPassengerCarOverallEndPreferentialIndex) that;
        return (this.getF1() == null ? other.getF1() == null : this.getF1().equals(other.getF1()))
            && (this.getOverallterminalpreferenceindex() == null ? other.getOverallterminalpreferenceindex() == null : this.getOverallterminalpreferenceindex().equals(other.getOverallterminalpreferenceindex()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gain乘用车整体终端优惠指数
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getF1() == null) ? 0 : getF1().hashCode());
        result = prime * result + ((getOverallterminalpreferenceindex() == null) ? 0 : getOverallterminalpreferenceindex().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gain乘用车整体终端优惠指数
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", f1=").append(f1);
        sb.append(", overallterminalpreferenceindex=").append(overallterminalpreferenceindex);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}