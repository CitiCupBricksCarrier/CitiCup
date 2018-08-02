package com.citicup.model;

import java.io.Serializable;

public class ChineseDomesticManufacturingCommercialVehicleSalesByFuel implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国国内制造商用车分燃料类型销量.f1
     *
     * @mbggenerated
     */
    private String f1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国国内制造商用车分燃料类型销量.comdieselSalesMICHN
     *
     * @mbggenerated
     */
    private String comdieselsalesmichn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国国内制造商用车分燃料类型销量.comgasSalesMICHN
     *
     * @mbggenerated
     */
    private String comgassalesmichn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国国内制造商用车分燃料类型销量.comotherFuelSalesMICHN
     *
     * @mbggenerated
     */
    private String comotherfuelsalesmichn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 中国国内制造商用车分燃料类型销量
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国国内制造商用车分燃料类型销量.f1
     *
     * @return the value of 中国国内制造商用车分燃料类型销量.f1
     *
     * @mbggenerated
     */
    public String getF1() {
        return f1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国国内制造商用车分燃料类型销量.f1
     *
     * @param f1 the value for 中国国内制造商用车分燃料类型销量.f1
     *
     * @mbggenerated
     */
    public void setF1(String f1) {
        this.f1 = f1 == null ? null : f1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国国内制造商用车分燃料类型销量.comdieselSalesMICHN
     *
     * @return the value of 中国国内制造商用车分燃料类型销量.comdieselSalesMICHN
     *
     * @mbggenerated
     */
    public String getComdieselsalesmichn() {
        return comdieselsalesmichn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国国内制造商用车分燃料类型销量.comdieselSalesMICHN
     *
     * @param comdieselsalesmichn the value for 中国国内制造商用车分燃料类型销量.comdieselSalesMICHN
     *
     * @mbggenerated
     */
    public void setComdieselsalesmichn(String comdieselsalesmichn) {
        this.comdieselsalesmichn = comdieselsalesmichn == null ? null : comdieselsalesmichn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国国内制造商用车分燃料类型销量.comgasSalesMICHN
     *
     * @return the value of 中国国内制造商用车分燃料类型销量.comgasSalesMICHN
     *
     * @mbggenerated
     */
    public String getComgassalesmichn() {
        return comgassalesmichn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国国内制造商用车分燃料类型销量.comgasSalesMICHN
     *
     * @param comgassalesmichn the value for 中国国内制造商用车分燃料类型销量.comgasSalesMICHN
     *
     * @mbggenerated
     */
    public void setComgassalesmichn(String comgassalesmichn) {
        this.comgassalesmichn = comgassalesmichn == null ? null : comgassalesmichn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国国内制造商用车分燃料类型销量.comotherFuelSalesMICHN
     *
     * @return the value of 中国国内制造商用车分燃料类型销量.comotherFuelSalesMICHN
     *
     * @mbggenerated
     */
    public String getComotherfuelsalesmichn() {
        return comotherfuelsalesmichn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国国内制造商用车分燃料类型销量.comotherFuelSalesMICHN
     *
     * @param comotherfuelsalesmichn the value for 中国国内制造商用车分燃料类型销量.comotherFuelSalesMICHN
     *
     * @mbggenerated
     */
    public void setComotherfuelsalesmichn(String comotherfuelsalesmichn) {
        this.comotherfuelsalesmichn = comotherfuelsalesmichn == null ? null : comotherfuelsalesmichn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国国内制造商用车分燃料类型销量
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
        ChineseDomesticManufacturingCommercialVehicleSalesByFuel other = (ChineseDomesticManufacturingCommercialVehicleSalesByFuel) that;
        return (this.getF1() == null ? other.getF1() == null : this.getF1().equals(other.getF1()))
            && (this.getComdieselsalesmichn() == null ? other.getComdieselsalesmichn() == null : this.getComdieselsalesmichn().equals(other.getComdieselsalesmichn()))
            && (this.getComgassalesmichn() == null ? other.getComgassalesmichn() == null : this.getComgassalesmichn().equals(other.getComgassalesmichn()))
            && (this.getComotherfuelsalesmichn() == null ? other.getComotherfuelsalesmichn() == null : this.getComotherfuelsalesmichn().equals(other.getComotherfuelsalesmichn()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国国内制造商用车分燃料类型销量
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getF1() == null) ? 0 : getF1().hashCode());
        result = prime * result + ((getComdieselsalesmichn() == null) ? 0 : getComdieselsalesmichn().hashCode());
        result = prime * result + ((getComgassalesmichn() == null) ? 0 : getComgassalesmichn().hashCode());
        result = prime * result + ((getComotherfuelsalesmichn() == null) ? 0 : getComotherfuelsalesmichn().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国国内制造商用车分燃料类型销量
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
        sb.append(", comdieselsalesmichn=").append(comdieselsalesmichn);
        sb.append(", comgassalesmichn=").append(comgassalesmichn);
        sb.append(", comotherfuelsalesmichn=").append(comotherfuelsalesmichn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}