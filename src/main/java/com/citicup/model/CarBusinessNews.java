package com.citicup.model;

import java.io.Serializable;

public class CarBusinessNews implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 汽车企业新闻速览.shortName
     *
     * @mbggenerated
     */
    private String shortname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 汽车企业新闻速览.declareDate
     *
     * @mbggenerated
     */
    private String declaredate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 汽车企业新闻速览.title
     *
     * @mbggenerated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 汽车企业新闻速览
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 汽车企业新闻速览.shortName
     *
     * @return the value of 汽车企业新闻速览.shortName
     *
     * @mbggenerated
     */
    public String getShortname() {
        return shortname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 汽车企业新闻速览.shortName
     *
     * @param shortname the value for 汽车企业新闻速览.shortName
     *
     * @mbggenerated
     */
    public void setShortname(String shortname) {
        this.shortname = shortname == null ? null : shortname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 汽车企业新闻速览.declareDate
     *
     * @return the value of 汽车企业新闻速览.declareDate
     *
     * @mbggenerated
     */
    public String getDeclaredate() {
        return declaredate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 汽车企业新闻速览.declareDate
     *
     * @param declaredate the value for 汽车企业新闻速览.declareDate
     *
     * @mbggenerated
     */
    public void setDeclaredate(String declaredate) {
        this.declaredate = declaredate == null ? null : declaredate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 汽车企业新闻速览.title
     *
     * @return the value of 汽车企业新闻速览.title
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 汽车企业新闻速览.title
     *
     * @param title the value for 汽车企业新闻速览.title
     *
     * @mbggenerated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 汽车企业新闻速览
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
        CarBusinessNews other = (CarBusinessNews) that;
        return (this.getShortname() == null ? other.getShortname() == null : this.getShortname().equals(other.getShortname()))
            && (this.getDeclaredate() == null ? other.getDeclaredate() == null : this.getDeclaredate().equals(other.getDeclaredate()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 汽车企业新闻速览
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getShortname() == null) ? 0 : getShortname().hashCode());
        result = prime * result + ((getDeclaredate() == null) ? 0 : getDeclaredate().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 汽车企业新闻速览
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", shortname=").append(shortname);
        sb.append(", declaredate=").append(declaredate);
        sb.append(", title=").append(title);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}