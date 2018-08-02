package com.citicup.model;

import java.io.Serializable;

public class AssetLiabilityRatio extends AssetLiabilityRatioKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 资产负债率.assetAbiRatio
     *
     * @mbggenerated
     */
    private String assetabiratio;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 资产负债率
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 资产负债率.assetAbiRatio
     *
     * @return the value of 资产负债率.assetAbiRatio
     *
     * @mbggenerated
     */
    public String getAssetabiratio() {
        return assetabiratio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 资产负债率.assetAbiRatio
     *
     * @param assetabiratio the value for 资产负债率.assetAbiRatio
     *
     * @mbggenerated
     */
    public void setAssetabiratio(String assetabiratio) {
        this.assetabiratio = assetabiratio == null ? null : assetabiratio.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 资产负债率
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
        AssetLiabilityRatio other = (AssetLiabilityRatio) that;
        return (this.get﻿stkcd() == null ? other.get﻿stkcd() == null : this.get﻿stkcd().equals(other.get﻿stkcd()))
            && (this.getAcceper() == null ? other.getAcceper() == null : this.getAcceper().equals(other.getAcceper()))
            && (this.getAssetabiratio() == null ? other.getAssetabiratio() == null : this.getAssetabiratio().equals(other.getAssetabiratio()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 资产负债率
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((get﻿stkcd() == null) ? 0 : get﻿stkcd().hashCode());
        result = prime * result + ((getAcceper() == null) ? 0 : getAcceper().hashCode());
        result = prime * result + ((getAssetabiratio() == null) ? 0 : getAssetabiratio().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 资产负债率
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", assetabiratio=").append(assetabiratio);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}