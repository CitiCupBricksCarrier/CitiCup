package com.citicup.model;

import java.io.Serializable;

public class ChineseDomesticManufacturingPassengerCarSalesDividedByType implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国国内制造乘用车分车型销量.f1
     *
     * @mbggenerated
     */
    private String f1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国国内制造乘用车分车型销量.basicSalesMICHN
     *
     * @mbggenerated
     */
    private String basicsalesmichn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国国内制造乘用车分车型销量.MPVSalesMICHN
     *
     * @mbggenerated
     */
    private String mpvsalesmichn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国国内制造乘用车分车型销量.SUVSalesMICHN
     *
     * @mbggenerated
     */
    private String suvsalesmichn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国国内制造乘用车分车型销量.acrossSalesMICHN
     *
     * @mbggenerated
     */
    private String acrosssalesmichn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 中国国内制造乘用车分车型销量
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国国内制造乘用车分车型销量.f1
     *
     * @return the value of 中国国内制造乘用车分车型销量.f1
     *
     * @mbggenerated
     */
    public String getF1() {
        return f1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国国内制造乘用车分车型销量.f1
     *
     * @param f1 the value for 中国国内制造乘用车分车型销量.f1
     *
     * @mbggenerated
     */
    public void setF1(String f1) {
        this.f1 = f1 == null ? null : f1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国国内制造乘用车分车型销量.basicSalesMICHN
     *
     * @return the value of 中国国内制造乘用车分车型销量.basicSalesMICHN
     *
     * @mbggenerated
     */
    public String getBasicsalesmichn() {
        return basicsalesmichn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国国内制造乘用车分车型销量.basicSalesMICHN
     *
     * @param basicsalesmichn the value for 中国国内制造乘用车分车型销量.basicSalesMICHN
     *
     * @mbggenerated
     */
    public void setBasicsalesmichn(String basicsalesmichn) {
        this.basicsalesmichn = basicsalesmichn == null ? null : basicsalesmichn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国国内制造乘用车分车型销量.MPVSalesMICHN
     *
     * @return the value of 中国国内制造乘用车分车型销量.MPVSalesMICHN
     *
     * @mbggenerated
     */
    public String getMpvsalesmichn() {
        return mpvsalesmichn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国国内制造乘用车分车型销量.MPVSalesMICHN
     *
     * @param mpvsalesmichn the value for 中国国内制造乘用车分车型销量.MPVSalesMICHN
     *
     * @mbggenerated
     */
    public void setMpvsalesmichn(String mpvsalesmichn) {
        this.mpvsalesmichn = mpvsalesmichn == null ? null : mpvsalesmichn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国国内制造乘用车分车型销量.SUVSalesMICHN
     *
     * @return the value of 中国国内制造乘用车分车型销量.SUVSalesMICHN
     *
     * @mbggenerated
     */
    public String getSuvsalesmichn() {
        return suvsalesmichn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国国内制造乘用车分车型销量.SUVSalesMICHN
     *
     * @param suvsalesmichn the value for 中国国内制造乘用车分车型销量.SUVSalesMICHN
     *
     * @mbggenerated
     */
    public void setSuvsalesmichn(String suvsalesmichn) {
        this.suvsalesmichn = suvsalesmichn == null ? null : suvsalesmichn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国国内制造乘用车分车型销量.acrossSalesMICHN
     *
     * @return the value of 中国国内制造乘用车分车型销量.acrossSalesMICHN
     *
     * @mbggenerated
     */
    public String getAcrosssalesmichn() {
        return acrosssalesmichn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国国内制造乘用车分车型销量.acrossSalesMICHN
     *
     * @param acrosssalesmichn the value for 中国国内制造乘用车分车型销量.acrossSalesMICHN
     *
     * @mbggenerated
     */
    public void setAcrosssalesmichn(String acrosssalesmichn) {
        this.acrosssalesmichn = acrosssalesmichn == null ? null : acrosssalesmichn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国国内制造乘用车分车型销量
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
        ChineseDomesticManufacturingPassengerCarSalesDividedByType other = (ChineseDomesticManufacturingPassengerCarSalesDividedByType) that;
        return (this.getF1() == null ? other.getF1() == null : this.getF1().equals(other.getF1()))
            && (this.getBasicsalesmichn() == null ? other.getBasicsalesmichn() == null : this.getBasicsalesmichn().equals(other.getBasicsalesmichn()))
            && (this.getMpvsalesmichn() == null ? other.getMpvsalesmichn() == null : this.getMpvsalesmichn().equals(other.getMpvsalesmichn()))
            && (this.getSuvsalesmichn() == null ? other.getSuvsalesmichn() == null : this.getSuvsalesmichn().equals(other.getSuvsalesmichn()))
            && (this.getAcrosssalesmichn() == null ? other.getAcrosssalesmichn() == null : this.getAcrosssalesmichn().equals(other.getAcrosssalesmichn()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国国内制造乘用车分车型销量
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getF1() == null) ? 0 : getF1().hashCode());
        result = prime * result + ((getBasicsalesmichn() == null) ? 0 : getBasicsalesmichn().hashCode());
        result = prime * result + ((getMpvsalesmichn() == null) ? 0 : getMpvsalesmichn().hashCode());
        result = prime * result + ((getSuvsalesmichn() == null) ? 0 : getSuvsalesmichn().hashCode());
        result = prime * result + ((getAcrosssalesmichn() == null) ? 0 : getAcrosssalesmichn().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国国内制造乘用车分车型销量
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
        sb.append(", basicsalesmichn=").append(basicsalesmichn);
        sb.append(", mpvsalesmichn=").append(mpvsalesmichn);
        sb.append(", suvsalesmichn=").append(suvsalesmichn);
        sb.append(", acrosssalesmichn=").append(acrosssalesmichn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}