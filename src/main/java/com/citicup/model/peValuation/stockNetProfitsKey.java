package com.citicup.model.peValuation;

import java.io.Serializable;

public class stockNetProfitsKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stocknetprofits.stkcd
     *
     * @mbggenerated
     */
    private String stkcd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stocknetprofits.quarter
     *
     * @mbggenerated
     */
    private String quarter;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table stocknetprofits
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stocknetprofits.stkcd
     *
     * @return the value of stocknetprofits.stkcd
     *
     * @mbggenerated
     */
    public String getStkcd() {
        return stkcd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stocknetprofits.stkcd
     *
     * @param stkcd the value for stocknetprofits.stkcd
     *
     * @mbggenerated
     */
    public void setStkcd(String stkcd) {
        this.stkcd = stkcd == null ? null : stkcd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stocknetprofits.quarter
     *
     * @return the value of stocknetprofits.quarter
     *
     * @mbggenerated
     */
    public String getQuarter() {
        return quarter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stocknetprofits.quarter
     *
     * @param quarter the value for stocknetprofits.quarter
     *
     * @mbggenerated
     */
    public void setQuarter(String quarter) {
        this.quarter = quarter == null ? null : quarter.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stocknetprofits
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
        stockNetProfitsKey other = (stockNetProfitsKey) that;
        return (this.getStkcd() == null ? other.getStkcd() == null : this.getStkcd().equals(other.getStkcd()))
            && (this.getQuarter() == null ? other.getQuarter() == null : this.getQuarter().equals(other.getQuarter()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stocknetprofits
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStkcd() == null) ? 0 : getStkcd().hashCode());
        result = prime * result + ((getQuarter() == null) ? 0 : getQuarter().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stocknetprofits
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
        sb.append(", quarter=").append(quarter);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}