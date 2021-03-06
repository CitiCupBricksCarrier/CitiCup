package com.citicup.model.dataDisplay;

import java.io.Serializable;

public class CashFlowLiabilityRatioOfAutomobileEnterprisesInChina implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国汽车企业现金流动负债比率.year
     *
     * @mbggenerated
     */
    private String year;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国汽车企业现金流动负债比率.cashCurDebtRatio
     *
     * @mbggenerated
     */
    private String cashcurdebtratio;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 中国汽车企业现金流动负债比率
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国汽车企业现金流动负债比率.year
     *
     * @return the value of 中国汽车企业现金流动负债比率.year
     *
     * @mbggenerated
     */
    public String getYear() {
        return year;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国汽车企业现金流动负债比率.year
     *
     * @param year the value for 中国汽车企业现金流动负债比率.year
     *
     * @mbggenerated
     */
    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国汽车企业现金流动负债比率.cashCurDebtRatio
     *
     * @return the value of 中国汽车企业现金流动负债比率.cashCurDebtRatio
     *
     * @mbggenerated
     */
    public String getCashcurdebtratio() {
        return cashcurdebtratio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国汽车企业现金流动负债比率.cashCurDebtRatio
     *
     * @param cashcurdebtratio the value for 中国汽车企业现金流动负债比率.cashCurDebtRatio
     *
     * @mbggenerated
     */
    public void setCashcurdebtratio(String cashcurdebtratio) {
        this.cashcurdebtratio = cashcurdebtratio == null ? null : cashcurdebtratio.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车企业现金流动负债比率
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
        CashFlowLiabilityRatioOfAutomobileEnterprisesInChina other = (CashFlowLiabilityRatioOfAutomobileEnterprisesInChina) that;
        return (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getCashcurdebtratio() == null ? other.getCashcurdebtratio() == null : this.getCashcurdebtratio().equals(other.getCashcurdebtratio()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车企业现金流动负债比率
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getCashcurdebtratio() == null) ? 0 : getCashcurdebtratio().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车企业现金流动负债比率
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", year=").append(year);
        sb.append(", cashcurdebtratio=").append(cashcurdebtratio);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}