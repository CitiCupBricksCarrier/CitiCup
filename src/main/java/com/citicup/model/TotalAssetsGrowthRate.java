package com.citicup.model;

import java.io.Serializable;

public class TotalAssetsGrowthRate extends TotalAssetsGrowthRateKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 总资产增长率.totalAssetGrowthRate
     *
     * @mbggenerated
     */
    private String totalassetgrowthrate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 总资产增长率
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 总资产增长率.totalAssetGrowthRate
     *
     * @return the value of 总资产增长率.totalAssetGrowthRate
     *
     * @mbggenerated
     */
    public String getTotalassetgrowthrate() {
        return totalassetgrowthrate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 总资产增长率.totalAssetGrowthRate
     *
     * @param totalassetgrowthrate the value for 总资产增长率.totalAssetGrowthRate
     *
     * @mbggenerated
     */
    public void setTotalassetgrowthrate(String totalassetgrowthrate) {
        this.totalassetgrowthrate = totalassetgrowthrate == null ? null : totalassetgrowthrate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 总资产增长率
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
        TotalAssetsGrowthRate other = (TotalAssetsGrowthRate) that;
        return (this.get﻿stkcd() == null ? other.get﻿stkcd() == null : this.get﻿stkcd().equals(other.get﻿stkcd()))
            && (this.getFiscalyear() == null ? other.getFiscalyear() == null : this.getFiscalyear().equals(other.getFiscalyear()))
            && (this.getTotalassetgrowthrate() == null ? other.getTotalassetgrowthrate() == null : this.getTotalassetgrowthrate().equals(other.getTotalassetgrowthrate()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 总资产增长率
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((get﻿stkcd() == null) ? 0 : get﻿stkcd().hashCode());
        result = prime * result + ((getFiscalyear() == null) ? 0 : getFiscalyear().hashCode());
        result = prime * result + ((getTotalassetgrowthrate() == null) ? 0 : getTotalassetgrowthrate().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 总资产增长率
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", totalassetgrowthrate=").append(totalassetgrowthrate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}