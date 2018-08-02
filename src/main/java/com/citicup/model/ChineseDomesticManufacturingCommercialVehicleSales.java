package com.citicup.model;

import java.io.Serializable;

public class ChineseDomesticManufacturingCommercialVehicleSales implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国国内制造商用车销量.f1
     *
     * @mbggenerated
     */
    private String f1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国国内制造商用车销量.commerSalesMICHN
     *
     * @mbggenerated
     */
    private String commersalesmichn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 中国国内制造商用车销量
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国国内制造商用车销量.f1
     *
     * @return the value of 中国国内制造商用车销量.f1
     *
     * @mbggenerated
     */
    public String getF1() {
        return f1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国国内制造商用车销量.f1
     *
     * @param f1 the value for 中国国内制造商用车销量.f1
     *
     * @mbggenerated
     */
    public void setF1(String f1) {
        this.f1 = f1 == null ? null : f1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国国内制造商用车销量.commerSalesMICHN
     *
     * @return the value of 中国国内制造商用车销量.commerSalesMICHN
     *
     * @mbggenerated
     */
    public String getCommersalesmichn() {
        return commersalesmichn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国国内制造商用车销量.commerSalesMICHN
     *
     * @param commersalesmichn the value for 中国国内制造商用车销量.commerSalesMICHN
     *
     * @mbggenerated
     */
    public void setCommersalesmichn(String commersalesmichn) {
        this.commersalesmichn = commersalesmichn == null ? null : commersalesmichn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国国内制造商用车销量
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
        ChineseDomesticManufacturingCommercialVehicleSales other = (ChineseDomesticManufacturingCommercialVehicleSales) that;
        return (this.getF1() == null ? other.getF1() == null : this.getF1().equals(other.getF1()))
            && (this.getCommersalesmichn() == null ? other.getCommersalesmichn() == null : this.getCommersalesmichn().equals(other.getCommersalesmichn()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国国内制造商用车销量
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getF1() == null) ? 0 : getF1().hashCode());
        result = prime * result + ((getCommersalesmichn() == null) ? 0 : getCommersalesmichn().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国国内制造商用车销量
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
        sb.append(", commersalesmichn=").append(commersalesmichn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}