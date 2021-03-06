package com.citicup.model.dataDisplay;

import java.io.Serializable;

public class TotalDebtOfAutoIndustryInChina implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国汽车行业负债总计.year
     *
     * @mbggenerated
     */
    private String year;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国汽车行业负债总计.totalLiailities
     *
     * @mbggenerated
     */
    private String totalliailities;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 中国汽车行业负债总计
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国汽车行业负债总计.year
     *
     * @return the value of 中国汽车行业负债总计.year
     *
     * @mbggenerated
     */
    public String getYear() {
        return year;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国汽车行业负债总计.year
     *
     * @param year the value for 中国汽车行业负债总计.year
     *
     * @mbggenerated
     */
    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国汽车行业负债总计.totalLiailities
     *
     * @return the value of 中国汽车行业负债总计.totalLiailities
     *
     * @mbggenerated
     */
    public String getTotalliailities() {
        return totalliailities;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国汽车行业负债总计.totalLiailities
     *
     * @param totalliailities the value for 中国汽车行业负债总计.totalLiailities
     *
     * @mbggenerated
     */
    public void setTotalliailities(String totalliailities) {
        this.totalliailities = totalliailities == null ? null : totalliailities.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业负债总计
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
        TotalDebtOfAutoIndustryInChina other = (TotalDebtOfAutoIndustryInChina) that;
        return (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getTotalliailities() == null ? other.getTotalliailities() == null : this.getTotalliailities().equals(other.getTotalliailities()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业负债总计
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getTotalliailities() == null) ? 0 : getTotalliailities().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业负债总计
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
        sb.append(", totalliailities=").append(totalliailities);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}