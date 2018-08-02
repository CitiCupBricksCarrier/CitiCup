package com.citicup.model;

import java.io.Serializable;

public class PerCapitaGdpIndexInChina implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国人均gdp指数.year
     *
     * @mbggenerated
     */
    private String year;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国人均gdp指数.perCapitaGDP
     *
     * @mbggenerated
     */
    private String percapitagdp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 中国人均gdp指数
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国人均gdp指数.year
     *
     * @return the value of 中国人均gdp指数.year
     *
     * @mbggenerated
     */
    public String getYear() {
        return year;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国人均gdp指数.year
     *
     * @param year the value for 中国人均gdp指数.year
     *
     * @mbggenerated
     */
    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国人均gdp指数.perCapitaGDP
     *
     * @return the value of 中国人均gdp指数.perCapitaGDP
     *
     * @mbggenerated
     */
    public String getPercapitagdp() {
        return percapitagdp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国人均gdp指数.perCapitaGDP
     *
     * @param percapitagdp the value for 中国人均gdp指数.perCapitaGDP
     *
     * @mbggenerated
     */
    public void setPercapitagdp(String percapitagdp) {
        this.percapitagdp = percapitagdp == null ? null : percapitagdp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国人均gdp指数
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
        PerCapitaGdpIndexInChina other = (PerCapitaGdpIndexInChina) that;
        return (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getPercapitagdp() == null ? other.getPercapitagdp() == null : this.getPercapitagdp().equals(other.getPercapitagdp()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国人均gdp指数
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getPercapitagdp() == null) ? 0 : getPercapitagdp().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国人均gdp指数
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
        sb.append(", percapitagdp=").append(percapitagdp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}