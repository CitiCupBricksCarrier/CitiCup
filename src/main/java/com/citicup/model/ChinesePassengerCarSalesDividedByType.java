package com.citicup.model;

import java.io.Serializable;

public class ChinesePassengerCarSalesDividedByType implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国乘用车分车型销量.f1
     *
     * @mbggenerated
     */
    private String f1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国乘用车分车型销量.basicSalesCHN
     *
     * @mbggenerated
     */
    private String basicsaleschn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国乘用车分车型销量.MPVSalesCHN
     *
     * @mbggenerated
     */
    private String mpvsaleschn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国乘用车分车型销量.SUVSalesCHN
     *
     * @mbggenerated
     */
    private String suvsaleschn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国乘用车分车型销量.acrossSalesCHN
     *
     * @mbggenerated
     */
    private String acrosssaleschn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 中国乘用车分车型销量
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国乘用车分车型销量.f1
     *
     * @return the value of 中国乘用车分车型销量.f1
     *
     * @mbggenerated
     */
    public String getF1() {
        return f1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国乘用车分车型销量.f1
     *
     * @param f1 the value for 中国乘用车分车型销量.f1
     *
     * @mbggenerated
     */
    public void setF1(String f1) {
        this.f1 = f1 == null ? null : f1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国乘用车分车型销量.basicSalesCHN
     *
     * @return the value of 中国乘用车分车型销量.basicSalesCHN
     *
     * @mbggenerated
     */
    public String getBasicsaleschn() {
        return basicsaleschn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国乘用车分车型销量.basicSalesCHN
     *
     * @param basicsaleschn the value for 中国乘用车分车型销量.basicSalesCHN
     *
     * @mbggenerated
     */
    public void setBasicsaleschn(String basicsaleschn) {
        this.basicsaleschn = basicsaleschn == null ? null : basicsaleschn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国乘用车分车型销量.MPVSalesCHN
     *
     * @return the value of 中国乘用车分车型销量.MPVSalesCHN
     *
     * @mbggenerated
     */
    public String getMpvsaleschn() {
        return mpvsaleschn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国乘用车分车型销量.MPVSalesCHN
     *
     * @param mpvsaleschn the value for 中国乘用车分车型销量.MPVSalesCHN
     *
     * @mbggenerated
     */
    public void setMpvsaleschn(String mpvsaleschn) {
        this.mpvsaleschn = mpvsaleschn == null ? null : mpvsaleschn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国乘用车分车型销量.SUVSalesCHN
     *
     * @return the value of 中国乘用车分车型销量.SUVSalesCHN
     *
     * @mbggenerated
     */
    public String getSuvsaleschn() {
        return suvsaleschn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国乘用车分车型销量.SUVSalesCHN
     *
     * @param suvsaleschn the value for 中国乘用车分车型销量.SUVSalesCHN
     *
     * @mbggenerated
     */
    public void setSuvsaleschn(String suvsaleschn) {
        this.suvsaleschn = suvsaleschn == null ? null : suvsaleschn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国乘用车分车型销量.acrossSalesCHN
     *
     * @return the value of 中国乘用车分车型销量.acrossSalesCHN
     *
     * @mbggenerated
     */
    public String getAcrosssaleschn() {
        return acrosssaleschn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国乘用车分车型销量.acrossSalesCHN
     *
     * @param acrosssaleschn the value for 中国乘用车分车型销量.acrossSalesCHN
     *
     * @mbggenerated
     */
    public void setAcrosssaleschn(String acrosssaleschn) {
        this.acrosssaleschn = acrosssaleschn == null ? null : acrosssaleschn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国乘用车分车型销量
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
        ChinesePassengerCarSalesDividedByType other = (ChinesePassengerCarSalesDividedByType) that;
        return (this.getF1() == null ? other.getF1() == null : this.getF1().equals(other.getF1()))
            && (this.getBasicsaleschn() == null ? other.getBasicsaleschn() == null : this.getBasicsaleschn().equals(other.getBasicsaleschn()))
            && (this.getMpvsaleschn() == null ? other.getMpvsaleschn() == null : this.getMpvsaleschn().equals(other.getMpvsaleschn()))
            && (this.getSuvsaleschn() == null ? other.getSuvsaleschn() == null : this.getSuvsaleschn().equals(other.getSuvsaleschn()))
            && (this.getAcrosssaleschn() == null ? other.getAcrosssaleschn() == null : this.getAcrosssaleschn().equals(other.getAcrosssaleschn()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国乘用车分车型销量
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getF1() == null) ? 0 : getF1().hashCode());
        result = prime * result + ((getBasicsaleschn() == null) ? 0 : getBasicsaleschn().hashCode());
        result = prime * result + ((getMpvsaleschn() == null) ? 0 : getMpvsaleschn().hashCode());
        result = prime * result + ((getSuvsaleschn() == null) ? 0 : getSuvsaleschn().hashCode());
        result = prime * result + ((getAcrosssaleschn() == null) ? 0 : getAcrosssaleschn().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国乘用车分车型销量
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", f1=").append(f1);
        sb.append(", basicsaleschn=").append(basicsaleschn);
        sb.append(", mpvsaleschn=").append(mpvsaleschn);
        sb.append(", suvsaleschn=").append(suvsaleschn);
        sb.append(", acrosssaleschn=").append(acrosssaleschn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}