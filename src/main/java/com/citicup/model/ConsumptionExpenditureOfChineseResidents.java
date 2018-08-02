package com.citicup.model;

import java.io.Serializable;

public class ConsumptionExpenditureOfChineseResidents implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国居民消费支出.year
     *
     * @mbggenerated
     */
    private String year;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国居民消费支出.perCapitaExp
     *
     * @mbggenerated
     */
    private String percapitaexp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 中国居民消费支出
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国居民消费支出.year
     *
     * @return the value of 中国居民消费支出.year
     *
     * @mbggenerated
     */
    public String getYear() {
        return year;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国居民消费支出.year
     *
     * @param year the value for 中国居民消费支出.year
     *
     * @mbggenerated
     */
    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国居民消费支出.perCapitaExp
     *
     * @return the value of 中国居民消费支出.perCapitaExp
     *
     * @mbggenerated
     */
    public String getPercapitaexp() {
        return percapitaexp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国居民消费支出.perCapitaExp
     *
     * @param percapitaexp the value for 中国居民消费支出.perCapitaExp
     *
     * @mbggenerated
     */
    public void setPercapitaexp(String percapitaexp) {
        this.percapitaexp = percapitaexp == null ? null : percapitaexp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国居民消费支出
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
        ConsumptionExpenditureOfChineseResidents other = (ConsumptionExpenditureOfChineseResidents) that;
        return (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getPercapitaexp() == null ? other.getPercapitaexp() == null : this.getPercapitaexp().equals(other.getPercapitaexp()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国居民消费支出
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getPercapitaexp() == null) ? 0 : getPercapitaexp().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国居民消费支出
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
        sb.append(", percapitaexp=").append(percapitaexp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}