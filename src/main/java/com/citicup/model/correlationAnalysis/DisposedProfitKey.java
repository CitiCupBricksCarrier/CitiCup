package com.citicup.model.correlationAnalysis;

import java.io.Serializable;

public class DisposedProfitKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 处理后利润表.stkcd
     *
     * @mbggenerated
     */
    private String stkcd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 处理后利润表.time
     *
     * @mbggenerated
     */
    private String time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 处理后利润表
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 处理后利润表.stkcd
     *
     * @return the value of 处理后利润表.stkcd
     *
     * @mbggenerated
     */
    public String getStkcd() {
        return stkcd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 处理后利润表.stkcd
     *
     * @param stkcd the value for 处理后利润表.stkcd
     *
     * @mbggenerated
     */
    public void setStkcd(String stkcd) {
        this.stkcd = stkcd == null ? null : stkcd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 处理后利润表.time
     *
     * @return the value of 处理后利润表.time
     *
     * @mbggenerated
     */
    public String getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 处理后利润表.time
     *
     * @param time the value for 处理后利润表.time
     *
     * @mbggenerated
     */
    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 处理后利润表
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
        DisposedProfitKey other = (DisposedProfitKey) that;
        return (this.getStkcd() == null ? other.getStkcd() == null : this.getStkcd().equals(other.getStkcd()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 处理后利润表
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStkcd() == null) ? 0 : getStkcd().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 处理后利润表
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
        sb.append(", time=").append(time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}