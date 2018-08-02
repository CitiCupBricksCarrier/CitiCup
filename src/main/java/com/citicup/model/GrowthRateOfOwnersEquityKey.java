package com.citicup.model;

import java.io.Serializable;

public class GrowthRateOfOwnersEquityKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 所有者权益增长率.﻿stkcd
     *
     * @mbggenerated
     */
    private String ﻿stkcd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 所有者权益增长率.fiscalYear
     *
     * @mbggenerated
     */
    private String fiscalyear;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 所有者权益增长率
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 所有者权益增长率.﻿stkcd
     *
     * @return the value of 所有者权益增长率.﻿stkcd
     *
     * @mbggenerated
     */
    public String get﻿stkcd() {
        return ﻿stkcd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 所有者权益增长率.﻿stkcd
     *
     * @param ﻿stkcd the value for 所有者权益增长率.﻿stkcd
     *
     * @mbggenerated
     */
    public void set﻿stkcd(String ﻿stkcd) {
        this.﻿stkcd = ﻿stkcd == null ? null : ﻿stkcd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 所有者权益增长率.fiscalYear
     *
     * @return the value of 所有者权益增长率.fiscalYear
     *
     * @mbggenerated
     */
    public String getFiscalyear() {
        return fiscalyear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 所有者权益增长率.fiscalYear
     *
     * @param fiscalyear the value for 所有者权益增长率.fiscalYear
     *
     * @mbggenerated
     */
    public void setFiscalyear(String fiscalyear) {
        this.fiscalyear = fiscalyear == null ? null : fiscalyear.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 所有者权益增长率
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
        GrowthRateOfOwnersEquityKey other = (GrowthRateOfOwnersEquityKey) that;
        return (this.get﻿stkcd() == null ? other.get﻿stkcd() == null : this.get﻿stkcd().equals(other.get﻿stkcd()))
            && (this.getFiscalyear() == null ? other.getFiscalyear() == null : this.getFiscalyear().equals(other.getFiscalyear()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 所有者权益增长率
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((get﻿stkcd() == null) ? 0 : get﻿stkcd().hashCode());
        result = prime * result + ((getFiscalyear() == null) ? 0 : getFiscalyear().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 所有者权益增长率
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ﻿stkcd=").append(﻿stkcd);
        sb.append(", fiscalyear=").append(fiscalyear);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}