package com.citicup.model;

import java.io.Serializable;

public class InventoryTurnoverRatio extends InventoryTurnoverRatioKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 存货周转率.invTurnRate
     *
     * @mbggenerated
     */
    private String invturnrate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 存货周转率
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 存货周转率.invTurnRate
     *
     * @return the value of 存货周转率.invTurnRate
     *
     * @mbggenerated
     */
    public String getInvturnrate() {
        return invturnrate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 存货周转率.invTurnRate
     *
     * @param invturnrate the value for 存货周转率.invTurnRate
     *
     * @mbggenerated
     */
    public void setInvturnrate(String invturnrate) {
        this.invturnrate = invturnrate == null ? null : invturnrate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 存货周转率
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
        InventoryTurnoverRatio other = (InventoryTurnoverRatio) that;
        return (this.get﻿stkcd() == null ? other.get﻿stkcd() == null : this.get﻿stkcd().equals(other.get﻿stkcd()))
            && (this.getAcceper() == null ? other.getAcceper() == null : this.getAcceper().equals(other.getAcceper()))
            && (this.getInvturnrate() == null ? other.getInvturnrate() == null : this.getInvturnrate().equals(other.getInvturnrate()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 存货周转率
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((get﻿stkcd() == null) ? 0 : get﻿stkcd().hashCode());
        result = prime * result + ((getAcceper() == null) ? 0 : getAcceper().hashCode());
        result = prime * result + ((getInvturnrate() == null) ? 0 : getInvturnrate().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 存货周转率
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", invturnrate=").append(invturnrate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}