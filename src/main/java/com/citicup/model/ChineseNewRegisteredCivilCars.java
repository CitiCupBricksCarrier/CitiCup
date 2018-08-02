package com.citicup.model;

import java.io.Serializable;

public class ChineseNewRegisteredCivilCars implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国新注册民用汽车数量.f1
     *
     * @mbggenerated
     */
    private String f1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国新注册民用汽车数量.civilcoachCHN
     *
     * @mbggenerated
     */
    private String civilcoachchn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国新注册民用汽车数量.civiltruckCHN
     *
     * @mbggenerated
     */
    private String civiltruckchn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国新注册民用汽车数量.civilotherCHN
     *
     * @mbggenerated
     */
    private String civilotherchn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 中国新注册民用汽车数量.civilcarCHN
     *
     * @mbggenerated
     */
    private String civilcarchn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 中国新注册民用汽车数量
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国新注册民用汽车数量.f1
     *
     * @return the value of 中国新注册民用汽车数量.f1
     *
     * @mbggenerated
     */
    public String getF1() {
        return f1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国新注册民用汽车数量.f1
     *
     * @param f1 the value for 中国新注册民用汽车数量.f1
     *
     * @mbggenerated
     */
    public void setF1(String f1) {
        this.f1 = f1 == null ? null : f1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国新注册民用汽车数量.civilcoachCHN
     *
     * @return the value of 中国新注册民用汽车数量.civilcoachCHN
     *
     * @mbggenerated
     */
    public String getCivilcoachchn() {
        return civilcoachchn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国新注册民用汽车数量.civilcoachCHN
     *
     * @param civilcoachchn the value for 中国新注册民用汽车数量.civilcoachCHN
     *
     * @mbggenerated
     */
    public void setCivilcoachchn(String civilcoachchn) {
        this.civilcoachchn = civilcoachchn == null ? null : civilcoachchn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国新注册民用汽车数量.civiltruckCHN
     *
     * @return the value of 中国新注册民用汽车数量.civiltruckCHN
     *
     * @mbggenerated
     */
    public String getCiviltruckchn() {
        return civiltruckchn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国新注册民用汽车数量.civiltruckCHN
     *
     * @param civiltruckchn the value for 中国新注册民用汽车数量.civiltruckCHN
     *
     * @mbggenerated
     */
    public void setCiviltruckchn(String civiltruckchn) {
        this.civiltruckchn = civiltruckchn == null ? null : civiltruckchn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国新注册民用汽车数量.civilotherCHN
     *
     * @return the value of 中国新注册民用汽车数量.civilotherCHN
     *
     * @mbggenerated
     */
    public String getCivilotherchn() {
        return civilotherchn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国新注册民用汽车数量.civilotherCHN
     *
     * @param civilotherchn the value for 中国新注册民用汽车数量.civilotherCHN
     *
     * @mbggenerated
     */
    public void setCivilotherchn(String civilotherchn) {
        this.civilotherchn = civilotherchn == null ? null : civilotherchn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 中国新注册民用汽车数量.civilcarCHN
     *
     * @return the value of 中国新注册民用汽车数量.civilcarCHN
     *
     * @mbggenerated
     */
    public String getCivilcarchn() {
        return civilcarchn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 中国新注册民用汽车数量.civilcarCHN
     *
     * @param civilcarchn the value for 中国新注册民用汽车数量.civilcarCHN
     *
     * @mbggenerated
     */
    public void setCivilcarchn(String civilcarchn) {
        this.civilcarchn = civilcarchn == null ? null : civilcarchn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国新注册民用汽车数量
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
        ChineseNewRegisteredCivilCars other = (ChineseNewRegisteredCivilCars) that;
        return (this.getF1() == null ? other.getF1() == null : this.getF1().equals(other.getF1()))
            && (this.getCivilcoachchn() == null ? other.getCivilcoachchn() == null : this.getCivilcoachchn().equals(other.getCivilcoachchn()))
            && (this.getCiviltruckchn() == null ? other.getCiviltruckchn() == null : this.getCiviltruckchn().equals(other.getCiviltruckchn()))
            && (this.getCivilotherchn() == null ? other.getCivilotherchn() == null : this.getCivilotherchn().equals(other.getCivilotherchn()))
            && (this.getCivilcarchn() == null ? other.getCivilcarchn() == null : this.getCivilcarchn().equals(other.getCivilcarchn()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国新注册民用汽车数量
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getF1() == null) ? 0 : getF1().hashCode());
        result = prime * result + ((getCivilcoachchn() == null) ? 0 : getCivilcoachchn().hashCode());
        result = prime * result + ((getCiviltruckchn() == null) ? 0 : getCiviltruckchn().hashCode());
        result = prime * result + ((getCivilotherchn() == null) ? 0 : getCivilotherchn().hashCode());
        result = prime * result + ((getCivilcarchn() == null) ? 0 : getCivilcarchn().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 中国新注册民用汽车数量
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
        sb.append(", civilcoachchn=").append(civilcoachchn);
        sb.append(", civiltruckchn=").append(civiltruckchn);
        sb.append(", civilotherchn=").append(civilotherchn);
        sb.append(", civilcarchn=").append(civilcarchn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}