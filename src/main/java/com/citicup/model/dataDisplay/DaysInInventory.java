package com.citicup.model.dataDisplay;

import java.io.Serializable;

public class DaysInInventory extends DaysInInventoryKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 存货周转天数.invTurnDays
     *
     * @mbggenerated
     */
    private String invturndays;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 存货周转天数
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 存货周转天数.invTurnDays
     *
     * @return the value of 存货周转天数.invTurnDays
     *
     * @mbggenerated
     */
    public String getInvturndays() {
        return invturndays;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 存货周转天数.invTurnDays
     *
     * @param invturndays the value for 存货周转天数.invTurnDays
     *
     * @mbggenerated
     */
    public void setInvturndays(String invturndays) {
        this.invturndays = invturndays == null ? null : invturndays.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 存货周转天数
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
        DaysInInventory other = (DaysInInventory) that;
        return (this.getStkcd() == null ? other.getStkcd() == null : this.getStkcd().equals(other.getStkcd()))
            && (this.getAcceper() == null ? other.getAcceper() == null : this.getAcceper().equals(other.getAcceper()))
            && (this.getInvturndays() == null ? other.getInvturndays() == null : this.getInvturndays().equals(other.getInvturndays()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 存货周转天数
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStkcd() == null) ? 0 : getStkcd().hashCode());
        result = prime * result + ((getAcceper() == null) ? 0 : getAcceper().hashCode());
        result = prime * result + ((getInvturndays() == null) ? 0 : getInvturndays().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 存货周转天数
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", invturndays=").append(invturndays);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}