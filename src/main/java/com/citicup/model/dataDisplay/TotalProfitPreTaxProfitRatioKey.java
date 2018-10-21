package com.citicup.model.dataDisplay;

import java.io.Serializable;

public class TotalProfitPreTaxProfitRatioKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 利润总额与息税前利润相比.stkcd
     *
     * @mbggenerated
     */
    private String stkcd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 利润总额与息税前利润相比.acceper
     *
     * @mbggenerated
     */
    private String acceper;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 利润总额与息税前利润相比
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 利润总额与息税前利润相比.stkcd
     *
     * @return the value of 利润总额与息税前利润相比.stkcd
     *
     * @mbggenerated
     */
    public String getStkcd() {
        return stkcd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 利润总额与息税前利润相比.stkcd
     *
     * @param stkcd the value for 利润总额与息税前利润相比.stkcd
     *
     * @mbggenerated
     */
    public void setStkcd(String stkcd) {
        this.stkcd = stkcd == null ? null : stkcd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 利润总额与息税前利润相比.acceper
     *
     * @return the value of 利润总额与息税前利润相比.acceper
     *
     * @mbggenerated
     */
    public String getAcceper() {
        return acceper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 利润总额与息税前利润相比.acceper
     *
     * @param acceper the value for 利润总额与息税前利润相比.acceper
     *
     * @mbggenerated
     */
    public void setAcceper(String acceper) {
        this.acceper = acceper == null ? null : acceper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 利润总额与息税前利润相比
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
        TotalProfitPreTaxProfitRatioKey other = (TotalProfitPreTaxProfitRatioKey) that;
        return (this.getStkcd() == null ? other.getStkcd() == null : this.getStkcd().equals(other.getStkcd()))
            && (this.getAcceper() == null ? other.getAcceper() == null : this.getAcceper().equals(other.getAcceper()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 利润总额与息税前利润相比
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStkcd() == null) ? 0 : getStkcd().hashCode());
        result = prime * result + ((getAcceper() == null) ? 0 : getAcceper().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 利润总额与息税前利润相比
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
        sb.append(", acceper=").append(acceper);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}