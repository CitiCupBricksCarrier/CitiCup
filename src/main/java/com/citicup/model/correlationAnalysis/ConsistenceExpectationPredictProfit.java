package com.citicup.model.correlationAnalysis;

import java.io.Serializable;

public class ConsistenceExpectationPredictProfit extends ConsistenceExpectationPredictProfitKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 分析师类一致预期预测营业收入.value
     *
     * @mbggenerated
     */
    private String value;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 分析师类一致预期预测营业收入
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 分析师类一致预期预测营业收入.value
     *
     * @return the value of 分析师类一致预期预测营业收入.value
     *
     * @mbggenerated
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 分析师类一致预期预测营业收入.value
     *
     * @param value the value for 分析师类一致预期预测营业收入.value
     *
     * @mbggenerated
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 分析师类一致预期预测营业收入
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
        ConsistenceExpectationPredictProfit other = (ConsistenceExpectationPredictProfit) that;
        return (this.getStkcd() == null ? other.getStkcd() == null : this.getStkcd().equals(other.getStkcd()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getValue() == null ? other.getValue() == null : this.getValue().equals(other.getValue()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 分析师类一致预期预测营业收入
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStkcd() == null) ? 0 : getStkcd().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getValue() == null) ? 0 : getValue().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 分析师类一致预期预测营业收入
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", value=").append(value);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}