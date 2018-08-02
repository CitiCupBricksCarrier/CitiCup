package com.citicup.model;

import java.io.Serializable;

public class ChineseDomesticManufacturingProduction implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国国内制造商用车产量.f1
     *
     * @mbggenerated
     */
    private String f1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国国内制造商用车产量.commerProductionMICHN
     *
     * @mbggenerated
     */
    private String commerproductionmichn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 中国国内制造商用车产量
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国国内制造商用车产量.f1
     *
     * @return the value of 中国国内制造商用车产量.f1
     *
     * @mbggenerated
     */
    public String getF1() {
        return f1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国国内制造商用车产量.f1
     *
     * @param f1 the value for 中国国内制造商用车产量.f1
     *
     * @mbggenerated
     */
    public void setF1(String f1) {
        this.f1 = f1 == null ? null : f1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国国内制造商用车产量.commerProductionMICHN
     *
     * @return the value of 中国国内制造商用车产量.commerProductionMICHN
     *
     * @mbggenerated
     */
    public String getCommerproductionmichn() {
        return commerproductionmichn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国国内制造商用车产量.commerProductionMICHN
     *
     * @param commerproductionmichn the value for 中国国内制造商用车产量.commerProductionMICHN
     *
     * @mbggenerated
     */
    public void setCommerproductionmichn(String commerproductionmichn) {
        this.commerproductionmichn = commerproductionmichn == null ? null : commerproductionmichn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国国内制造商用车产量
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
        ChineseDomesticManufacturingProduction other = (ChineseDomesticManufacturingProduction) that;
        return (this.getF1() == null ? other.getF1() == null : this.getF1().equals(other.getF1()))
            && (this.getCommerproductionmichn() == null ? other.getCommerproductionmichn() == null : this.getCommerproductionmichn().equals(other.getCommerproductionmichn()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国国内制造商用车产量
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getF1() == null) ? 0 : getF1().hashCode());
        result = prime * result + ((getCommerproductionmichn() == null) ? 0 : getCommerproductionmichn().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国国内制造商用车产量
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
        sb.append(", commerproductionmichn=").append(commerproductionmichn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}