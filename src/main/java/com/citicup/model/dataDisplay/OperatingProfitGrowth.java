package com.citicup.model.dataDisplay;

import java.io.Serializable;

public class OperatingProfitGrowth extends OperatingProfitGrowthKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 营业利润增长率.growthRateOfOperPro
     *
     * @mbggenerated
     */
    private String growthrateofoperpro;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 营业利润增长率
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 营业利润增长率.growthRateOfOperPro
     *
     * @return the value of 营业利润增长率.growthRateOfOperPro
     *
     * @mbggenerated
     */
    public String getGrowthrateofoperpro() {
        return growthrateofoperpro;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 营业利润增长率.growthRateOfOperPro
     *
     * @param growthrateofoperpro the value for 营业利润增长率.growthRateOfOperPro
     *
     * @mbggenerated
     */
    public void setGrowthrateofoperpro(String growthrateofoperpro) {
        this.growthrateofoperpro = growthrateofoperpro == null ? null : growthrateofoperpro.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 营业利润增长率
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
        OperatingProfitGrowth other = (OperatingProfitGrowth) that;
        return (this.getStkcd() == null ? other.getStkcd() == null : this.getStkcd().equals(other.getStkcd()))
            && (this.getFiscalyear() == null ? other.getFiscalyear() == null : this.getFiscalyear().equals(other.getFiscalyear()))
            && (this.getGrowthrateofoperpro() == null ? other.getGrowthrateofoperpro() == null : this.getGrowthrateofoperpro().equals(other.getGrowthrateofoperpro()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 营业利润增长率
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStkcd() == null) ? 0 : getStkcd().hashCode());
        result = prime * result + ((getFiscalyear() == null) ? 0 : getFiscalyear().hashCode());
        result = prime * result + ((getGrowthrateofoperpro() == null) ? 0 : getGrowthrateofoperpro().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 营业利润增长率
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", growthrateofoperpro=").append(growthrateofoperpro);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}