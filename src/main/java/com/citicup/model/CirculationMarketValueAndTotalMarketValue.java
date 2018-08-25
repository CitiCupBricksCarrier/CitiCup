package com.citicup.model;

import java.io.Serializable;

public class CirculationMarketValueAndTotalMarketValue extends CirculationMarketValueAndTotalMarketValueKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 流通市值与总市值.CirculationMarketValue
     *
     * @mbggenerated
     */
    private String circulationmarketvalue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 流通市值与总市值.TotalMarketValue
     *
     * @mbggenerated
     */
    private String totalmarketvalue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 流通市值与总市值
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 流通市值与总市值.CirculationMarketValue
     *
     * @return the value of 流通市值与总市值.CirculationMarketValue
     *
     * @mbggenerated
     */
    public String getCirculationmarketvalue() {
        return circulationmarketvalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 流通市值与总市值.CirculationMarketValue
     *
     * @param circulationmarketvalue the value for 流通市值与总市值.CirculationMarketValue
     *
     * @mbggenerated
     */
    public void setCirculationmarketvalue(String circulationmarketvalue) {
        this.circulationmarketvalue = circulationmarketvalue == null ? null : circulationmarketvalue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 流通市值与总市值.TotalMarketValue
     *
     * @return the value of 流通市值与总市值.TotalMarketValue
     *
     * @mbggenerated
     */
    public String getTotalmarketvalue() {
        return totalmarketvalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 流通市值与总市值.TotalMarketValue
     *
     * @param totalmarketvalue the value for 流通市值与总市值.TotalMarketValue
     *
     * @mbggenerated
     */
    public void setTotalmarketvalue(String totalmarketvalue) {
        this.totalmarketvalue = totalmarketvalue == null ? null : totalmarketvalue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 流通市值与总市值
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
        CirculationMarketValueAndTotalMarketValue other = (CirculationMarketValueAndTotalMarketValue) that;
        return (this.getStkcd() == null ? other.getStkcd() == null : this.getStkcd().equals(other.getStkcd()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getCirculationmarketvalue() == null ? other.getCirculationmarketvalue() == null : this.getCirculationmarketvalue().equals(other.getCirculationmarketvalue()))
            && (this.getTotalmarketvalue() == null ? other.getTotalmarketvalue() == null : this.getTotalmarketvalue().equals(other.getTotalmarketvalue()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 流通市值与总市值
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStkcd() == null) ? 0 : getStkcd().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getCirculationmarketvalue() == null) ? 0 : getCirculationmarketvalue().hashCode());
        result = prime * result + ((getTotalmarketvalue() == null) ? 0 : getTotalmarketvalue().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 流通市值与总市值
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", circulationmarketvalue=").append(circulationmarketvalue);
        sb.append(", totalmarketvalue=").append(totalmarketvalue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}