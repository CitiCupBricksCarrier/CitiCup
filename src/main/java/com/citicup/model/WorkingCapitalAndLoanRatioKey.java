package com.citicup.model;

import java.io.Serializable;

public class WorkingCapitalAndLoanRatioKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 营运资金与借款比.﻿stkcd
     *
     * @mbggenerated
     */
    private String stkcd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 营运资金与借款比.acceper
     *
     * @mbggenerated
     */
    private String acceper;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 营运资金与借款比
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 营运资金与借款比.﻿stkcd
     *
     * @return the value of 营运资金与借款比.﻿stkcd
     *
     * @mbggenerated
     */
    public String get﻿stkcd() {
        return stkcd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 营运资金与借款比.﻿stkcd
     *
     * @param ﻿stkcd the value for 营运资金与借款比.﻿stkcd
     *
     * @mbggenerated
     */
    public void set﻿stkcd(String stkcd) {
        this.stkcd = stkcd == null ? null : stkcd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 营运资金与借款比.acceper
     *
     * @return the value of 营运资金与借款比.acceper
     *
     * @mbggenerated
     */
    public String getAcceper() {
        return acceper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 营运资金与借款比.acceper
     *
     * @param acceper the value for 营运资金与借款比.acceper
     *
     * @mbggenerated
     */
    public void setAcceper(String acceper) {
        this.acceper = acceper == null ? null : acceper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 营运资金与借款比
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
        WorkingCapitalAndLoanRatioKey other = (WorkingCapitalAndLoanRatioKey) that;
        return (this.get﻿stkcd() == null ? other.get﻿stkcd() == null : this.get﻿stkcd().equals(other.get﻿stkcd()))
            && (this.getAcceper() == null ? other.getAcceper() == null : this.getAcceper().equals(other.getAcceper()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 营运资金与借款比
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((get﻿stkcd() == null) ? 0 : get﻿stkcd().hashCode());
        result = prime * result + ((getAcceper() == null) ? 0 : getAcceper().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 营运资金与借款比
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ﻿stkcd=").append(stkcd);
        sb.append(", acceper=").append(acceper);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}