package com.citicup.model;

import java.io.Serializable;

public class HeavyTruckProductionInChina implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国重卡产量.year
     *
     * @mbggenerated
     */
    private String year;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国重卡产量.hvTruckOP
     *
     * @mbggenerated
     */
    private String hvtruckop;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 中国重卡产量
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国重卡产量.year
     *
     * @return the value of 中国重卡产量.year
     *
     * @mbggenerated
     */
    public String getYear() {
        return year;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国重卡产量.year
     *
     * @param year the value for 中国重卡产量.year
     *
     * @mbggenerated
     */
    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国重卡产量.hvTruckOP
     *
     * @return the value of 中国重卡产量.hvTruckOP
     *
     * @mbggenerated
     */
    public String getHvtruckop() {
        return hvtruckop;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国重卡产量.hvTruckOP
     *
     * @param hvtruckop the value for 中国重卡产量.hvTruckOP
     *
     * @mbggenerated
     */
    public void setHvtruckop(String hvtruckop) {
        this.hvtruckop = hvtruckop == null ? null : hvtruckop.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国重卡产量
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
        HeavyTruckProductionInChina other = (HeavyTruckProductionInChina) that;
        return (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getHvtruckop() == null ? other.getHvtruckop() == null : this.getHvtruckop().equals(other.getHvtruckop()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国重卡产量
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getHvtruckop() == null) ? 0 : getHvtruckop().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国重卡产量
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", year=").append(year);
        sb.append(", hvtruckop=").append(hvtruckop);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}