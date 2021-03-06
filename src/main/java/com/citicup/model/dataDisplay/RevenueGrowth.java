package com.citicup.model.dataDisplay;

import java.io.Serializable;

public class RevenueGrowth extends RevenueGrowthKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 营业收入增长率.growthRateOfOperIncome
     *
     * @mbggenerated
     */
    private String growthrateofoperincome;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 营业收入增长率
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 营业收入增长率.growthRateOfOperIncome
     *
     * @return the value of 营业收入增长率.growthRateOfOperIncome
     *
     * @mbggenerated
     */
    public String getGrowthrateofoperincome() {
        return growthrateofoperincome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 营业收入增长率.growthRateOfOperIncome
     *
     * @param growthrateofoperincome the value for 营业收入增长率.growthRateOfOperIncome
     *
     * @mbggenerated
     */
    public void setGrowthrateofoperincome(String growthrateofoperincome) {
        this.growthrateofoperincome = growthrateofoperincome == null ? null : growthrateofoperincome.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 营业收入增长率
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
        RevenueGrowth other = (RevenueGrowth) that;
        return (this.getStkcd() == null ? other.getStkcd() == null : this.getStkcd().equals(other.getStkcd()))
            && (this.getFiscalyear() == null ? other.getFiscalyear() == null : this.getFiscalyear().equals(other.getFiscalyear()))
            && (this.getGrowthrateofoperincome() == null ? other.getGrowthrateofoperincome() == null : this.getGrowthrateofoperincome().equals(other.getGrowthrateofoperincome()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 营业收入增长率
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStkcd() == null) ? 0 : getStkcd().hashCode());
        result = prime * result + ((getFiscalyear() == null) ? 0 : getFiscalyear().hashCode());
        result = prime * result + ((getGrowthrateofoperincome() == null) ? 0 : getGrowthrateofoperincome().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 营业收入增长率
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", growthrateofoperincome=").append(growthrateofoperincome);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}