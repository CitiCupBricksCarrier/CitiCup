package com.citicup.model;

import java.io.Serializable;

public class MonthlyAverageMarketPriceOfNaturalRubberInChina implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国天然橡胶月均市场价.month
     *
     * @mbggenerated
     */
    private String month;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国天然橡胶月均市场价.ntRubMonAveMktPri
     *
     * @mbggenerated
     */
    private String ntrubmonavemktpri;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 中国天然橡胶月均市场价
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国天然橡胶月均市场价.month
     *
     * @return the value of 中国天然橡胶月均市场价.month
     *
     * @mbggenerated
     */
    public String getMonth() {
        return month;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国天然橡胶月均市场价.month
     *
     * @param month the value for 中国天然橡胶月均市场价.month
     *
     * @mbggenerated
     */
    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国天然橡胶月均市场价.ntRubMonAveMktPri
     *
     * @return the value of 中国天然橡胶月均市场价.ntRubMonAveMktPri
     *
     * @mbggenerated
     */
    public String getNtrubmonavemktpri() {
        return ntrubmonavemktpri;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国天然橡胶月均市场价.ntRubMonAveMktPri
     *
     * @param ntrubmonavemktpri the value for 中国天然橡胶月均市场价.ntRubMonAveMktPri
     *
     * @mbggenerated
     */
    public void setNtrubmonavemktpri(String ntrubmonavemktpri) {
        this.ntrubmonavemktpri = ntrubmonavemktpri == null ? null : ntrubmonavemktpri.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国天然橡胶月均市场价
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
        MonthlyAverageMarketPriceOfNaturalRubberInChina other = (MonthlyAverageMarketPriceOfNaturalRubberInChina) that;
        return (this.getMonth() == null ? other.getMonth() == null : this.getMonth().equals(other.getMonth()))
            && (this.getNtrubmonavemktpri() == null ? other.getNtrubmonavemktpri() == null : this.getNtrubmonavemktpri().equals(other.getNtrubmonavemktpri()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国天然橡胶月均市场价
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMonth() == null) ? 0 : getMonth().hashCode());
        result = prime * result + ((getNtrubmonavemktpri() == null) ? 0 : getNtrubmonavemktpri().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国天然橡胶月均市场价
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", month=").append(month);
        sb.append(", ntrubmonavemktpri=").append(ntrubmonavemktpri);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}