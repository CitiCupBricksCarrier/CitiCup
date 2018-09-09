package com.citicup.model.correlationAnalysis;

import java.io.Serializable;

public class ConsistenceExpectation implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 分析师类-一致预期pb.stkcd
     *
     * @mbggenerated
     */
    private String stkcd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 分析师类-一致预期pb.date
     *
     * @mbggenerated
     */
    private String date;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 分析师类-一致预期pb.value
     *
     * @mbggenerated
     */
    private String value;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 分析师类-一致预期pb
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 分析师类-一致预期pb.stkcd
     *
     * @return the value of 分析师类-一致预期pb.stkcd
     *
     * @mbggenerated
     */
    public String getStkcd() {
        return stkcd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 分析师类-一致预期pb.stkcd
     *
     * @param stkcd the value for 分析师类-一致预期pb.stkcd
     *
     * @mbggenerated
     */
    public void setStkcd(String stkcd) {
        this.stkcd = stkcd == null ? null : stkcd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 分析师类-一致预期pb.date
     *
     * @return the value of 分析师类-一致预期pb.date
     *
     * @mbggenerated
     */
    public String getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 分析师类-一致预期pb.date
     *
     * @param date the value for 分析师类-一致预期pb.date
     *
     * @mbggenerated
     */
    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 分析师类-一致预期pb.value
     *
     * @return the value of 分析师类-一致预期pb.value
     *
     * @mbggenerated
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 分析师类-一致预期pb.value
     *
     * @param value the value for 分析师类-一致预期pb.value
     *
     * @mbggenerated
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 分析师类-一致预期pb
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
        ConsistenceExpectation other = (ConsistenceExpectation) that;
        return (this.getStkcd() == null ? other.getStkcd() == null : this.getStkcd().equals(other.getStkcd()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getValue() == null ? other.getValue() == null : this.getValue().equals(other.getValue()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 分析师类-一致预期pb
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStkcd() == null) ? 0 : getStkcd().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getValue() == null) ? 0 : getValue().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 分析师类-一致预期pb
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stkcd=").append(stkcd);
        sb.append(", date=").append(date);
        sb.append(", value=").append(value);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}