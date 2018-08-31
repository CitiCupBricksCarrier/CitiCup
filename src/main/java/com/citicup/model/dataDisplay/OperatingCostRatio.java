package com.citicup.model.dataDisplay;

import java.io.Serializable;

public class OperatingCostRatio extends OperatingCostRatioKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 营业成本率.operCostRate
     *
     * @mbggenerated
     */
    private String opercostrate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 营业成本率
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 营业成本率.operCostRate
     *
     * @return the value of 营业成本率.operCostRate
     *
     * @mbggenerated
     */
    public String getOpercostrate() {
        return opercostrate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 营业成本率.operCostRate
     *
     * @param opercostrate the value for 营业成本率.operCostRate
     *
     * @mbggenerated
     */
    public void setOpercostrate(String opercostrate) {
        this.opercostrate = opercostrate == null ? null : opercostrate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 营业成本率
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
        OperatingCostRatio other = (OperatingCostRatio) that;
        return (this.get﻿stkcd() == null ? other.get﻿stkcd() == null : this.get﻿stkcd().equals(other.get﻿stkcd()))
            && (this.getAcceper() == null ? other.getAcceper() == null : this.getAcceper().equals(other.getAcceper()))
            && (this.getOpercostrate() == null ? other.getOpercostrate() == null : this.getOpercostrate().equals(other.getOpercostrate()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 营业成本率
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((get﻿stkcd() == null) ? 0 : get﻿stkcd().hashCode());
        result = prime * result + ((getAcceper() == null) ? 0 : getAcceper().hashCode());
        result = prime * result + ((getOpercostrate() == null) ? 0 : getOpercostrate().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 营业成本率
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", opercostrate=").append(opercostrate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}