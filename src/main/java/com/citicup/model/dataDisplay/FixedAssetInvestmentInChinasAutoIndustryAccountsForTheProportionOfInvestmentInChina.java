package com.citicup.model.dataDisplay;

import java.io.Serializable;

public class FixedAssetInvestmentInChinasAutoIndustryAccountsForTheProportionOfInvestmentInChina implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国汽车行业固定资产投资占全国投资比重.year
     *
     * @mbggenerated
     */
    private String year;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国汽车行业固定资产投资占全国投资比重.fixedAssetInvPro
     *
     * @mbggenerated
     */
    private String fixedassetinvpro;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 中国汽车行业固定资产投资占全国投资比重
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国汽车行业固定资产投资占全国投资比重.year
     *
     * @return the value of 中国汽车行业固定资产投资占全国投资比重.year
     *
     * @mbggenerated
     */
    public String getYear() {
        return year;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国汽车行业固定资产投资占全国投资比重.year
     *
     * @param year the value for 中国汽车行业固定资产投资占全国投资比重.year
     *
     * @mbggenerated
     */
    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国汽车行业固定资产投资占全国投资比重.fixedAssetInvPro
     *
     * @return the value of 中国汽车行业固定资产投资占全国投资比重.fixedAssetInvPro
     *
     * @mbggenerated
     */
    public String getFixedassetinvpro() {
        return fixedassetinvpro;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国汽车行业固定资产投资占全国投资比重.fixedAssetInvPro
     *
     * @param fixedassetinvpro the value for 中国汽车行业固定资产投资占全国投资比重.fixedAssetInvPro
     *
     * @mbggenerated
     */
    public void setFixedassetinvpro(String fixedassetinvpro) {
        this.fixedassetinvpro = fixedassetinvpro == null ? null : fixedassetinvpro.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业固定资产投资占全国投资比重
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
        FixedAssetInvestmentInChinasAutoIndustryAccountsForTheProportionOfInvestmentInChina other = (FixedAssetInvestmentInChinasAutoIndustryAccountsForTheProportionOfInvestmentInChina) that;
        return (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getFixedassetinvpro() == null ? other.getFixedassetinvpro() == null : this.getFixedassetinvpro().equals(other.getFixedassetinvpro()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业固定资产投资占全国投资比重
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getFixedassetinvpro() == null) ? 0 : getFixedassetinvpro().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业固定资产投资占全国投资比重
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
        sb.append(", fixedassetinvpro=").append(fixedassetinvpro);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}