package com.citicup.model.dataDisplay;

import java.io.Serializable;

public class ComparisonOfValuationPerformance_codeName implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 估值表现分析代码简称.securCode
     *
     * @mbggenerated
     */
    private String securcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 估值表现分析代码简称.securName
     *
     * @mbggenerated
     */
    private String securname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 估值表现分析代码简称
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 估值表现分析代码简称.securCode
     *
     * @return the value of 估值表现分析代码简称.securCode
     *
     * @mbggenerated
     */
    public String getSecurcode() {
        return securcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 估值表现分析代码简称.securCode
     *
     * @param securcode the value for 估值表现分析代码简称.securCode
     *
     * @mbggenerated
     */
    public void setSecurcode(String securcode) {
        this.securcode = securcode == null ? null : securcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 估值表现分析代码简称.securName
     *
     * @return the value of 估值表现分析代码简称.securName
     *
     * @mbggenerated
     */
    public String getSecurname() {
        return securname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 估值表现分析代码简称.securName
     *
     * @param securname the value for 估值表现分析代码简称.securName
     *
     * @mbggenerated
     */
    public void setSecurname(String securname) {
        this.securname = securname == null ? null : securname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 估值表现分析代码简称
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
        ComparisonOfValuationPerformance_codeName other = (ComparisonOfValuationPerformance_codeName) that;
        return (this.getSecurcode() == null ? other.getSecurcode() == null : this.getSecurcode().equals(other.getSecurcode()))
            && (this.getSecurname() == null ? other.getSecurname() == null : this.getSecurname().equals(other.getSecurname()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 估值表现分析代码简称
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSecurcode() == null) ? 0 : getSecurcode().hashCode());
        result = prime * result + ((getSecurname() == null) ? 0 : getSecurname().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 估值表现分析代码简称
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", securcode=").append(securcode);
        sb.append(", securname=").append(securname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}