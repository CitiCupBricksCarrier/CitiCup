package com.citicup.model.dataDisplay;

import java.io.Serializable;

public class AverageNumberOfEmployeesInChinaAutoIndustry implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国汽车行业全部从业人员平均人数.year
     *
     * @mbggenerated
     */
    private String year;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国汽车行业全部从业人员平均人数.numEmpAve
     *
     * @mbggenerated
     */
    private String numempave;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 中国汽车行业全部从业人员平均人数
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国汽车行业全部从业人员平均人数.year
     *
     * @return the value of 中国汽车行业全部从业人员平均人数.year
     *
     * @mbggenerated
     */
    public String getYear() {
        return year;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国汽车行业全部从业人员平均人数.year
     *
     * @param year the value for 中国汽车行业全部从业人员平均人数.year
     *
     * @mbggenerated
     */
    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国汽车行业全部从业人员平均人数.numEmpAve
     *
     * @return the value of 中国汽车行业全部从业人员平均人数.numEmpAve
     *
     * @mbggenerated
     */
    public String getNumempave() {
        return numempave;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国汽车行业全部从业人员平均人数.numEmpAve
     *
     * @param numempave the value for 中国汽车行业全部从业人员平均人数.numEmpAve
     *
     * @mbggenerated
     */
    public void setNumempave(String numempave) {
        this.numempave = numempave == null ? null : numempave.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业全部从业人员平均人数
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
        AverageNumberOfEmployeesInChinaAutoIndustry other = (AverageNumberOfEmployeesInChinaAutoIndustry) that;
        return (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getNumempave() == null ? other.getNumempave() == null : this.getNumempave().equals(other.getNumempave()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业全部从业人员平均人数
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getNumempave() == null) ? 0 : getNumempave().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国汽车行业全部从业人员平均人数
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
        sb.append(", numempave=").append(numempave);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}