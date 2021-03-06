package com.citicup.model.dataDisplay;

import java.io.Serializable;

public class TotalProfitPreTaxProfitRatio extends TotalProfitPreTaxProfitRatioKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 利润总额与息税前利润相比.totalProComparedToPreTaxPro
     *
     * @mbggenerated
     */
    private String totalprocomparedtopretaxpro;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 利润总额与息税前利润相比
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 利润总额与息税前利润相比.totalProComparedToPreTaxPro
     *
     * @return the value of 利润总额与息税前利润相比.totalProComparedToPreTaxPro
     *
     * @mbggenerated
     */
    public String getTotalprocomparedtopretaxpro() {
        return totalprocomparedtopretaxpro;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 利润总额与息税前利润相比.totalProComparedToPreTaxPro
     *
     * @param totalprocomparedtopretaxpro the value for 利润总额与息税前利润相比.totalProComparedToPreTaxPro
     *
     * @mbggenerated
     */
    public void setTotalprocomparedtopretaxpro(String totalprocomparedtopretaxpro) {
        this.totalprocomparedtopretaxpro = totalprocomparedtopretaxpro == null ? null : totalprocomparedtopretaxpro.trim();
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
        TotalProfitPreTaxProfitRatio other = (TotalProfitPreTaxProfitRatio) that;
        return (this.getStkcd() == null ? other.getStkcd() == null : this.getStkcd().equals(other.getStkcd()))
            && (this.getAcceper() == null ? other.getAcceper() == null : this.getAcceper().equals(other.getAcceper()))
            && (this.getTotalprocomparedtopretaxpro() == null ? other.getTotalprocomparedtopretaxpro() == null : this.getTotalprocomparedtopretaxpro().equals(other.getTotalprocomparedtopretaxpro()));
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
        result = prime * result + ((getTotalprocomparedtopretaxpro() == null) ? 0 : getTotalprocomparedtopretaxpro().hashCode());
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
        sb.append(", totalprocomparedtopretaxpro=").append(totalprocomparedtopretaxpro);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}