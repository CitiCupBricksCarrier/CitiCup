package com.citicup.model.dataDisplay;

import java.io.Serializable;

public class TotalAssets extends TotalAssetsKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 总资产.TotalAssets
     *
     * @mbggenerated
     */
    private String totalassets;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 总资产
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 总资产.TotalAssets
     *
     * @return the value of 总资产.TotalAssets
     *
     * @mbggenerated
     */
    public String getTotalassets() {
        return totalassets;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 总资产.TotalAssets
     *
     * @param totalassets the value for 总资产.TotalAssets
     *
     * @mbggenerated
     */
    public void setTotalassets(String totalassets) {
        this.totalassets = totalassets == null ? null : totalassets.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 总资产
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
        TotalAssets other = (TotalAssets) that;
        return (this.getStkcd() == null ? other.getStkcd() == null : this.getStkcd().equals(other.getStkcd()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getTotalassets() == null ? other.getTotalassets() == null : this.getTotalassets().equals(other.getTotalassets()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 总资产
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStkcd() == null) ? 0 : getStkcd().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getTotalassets() == null) ? 0 : getTotalassets().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 总资产
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", totalassets=").append(totalassets);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}