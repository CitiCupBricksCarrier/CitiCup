package com.citicup.model;

import java.io.Serializable;

public class Point extends PointKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column point.status
     *
     * @mbggenerated
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column point.defectProb
     *
     * @mbggenerated
     */
    private Double defectprob;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column point.infectProb
     *
     * @mbggenerated
     */
    private Double infectprob;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column point.infectProbTemp
     *
     * @mbggenerated
     */
    private Double infectprobtemp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column point.infectTime
     *
     * @mbggenerated
     */
    private Integer infecttime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column point.timeLeft
     *
     * @mbggenerated
     */
    private Integer timeleft;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column point.color
     *
     * @mbggenerated
     */
    private String color;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column point.role
     *
     * @mbggenerated
     */
    private String role;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column point.posx
     *
     * @mbggenerated
     */
    private String posx;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column point.posy
     *
     * @mbggenerated
     */
    private String posy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column point.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table point
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column point.status
     *
     * @return the value of point.status
     *
     * @mbggenerated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column point.status
     *
     * @param status the value for point.status
     *
     * @mbggenerated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column point.defectProb
     *
     * @return the value of point.defectProb
     *
     * @mbggenerated
     */
    public Double getDefectprob() {
        return defectprob;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column point.defectProb
     *
     * @param defectprob the value for point.defectProb
     *
     * @mbggenerated
     */
    public void setDefectprob(Double defectprob) {
        this.defectprob = defectprob;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column point.infectProb
     *
     * @return the value of point.infectProb
     *
     * @mbggenerated
     */
    public Double getInfectprob() {
        return infectprob;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column point.infectProb
     *
     * @param infectprob the value for point.infectProb
     *
     * @mbggenerated
     */
    public void setInfectprob(Double infectprob) {
        this.infectprob = infectprob;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column point.infectProbTemp
     *
     * @return the value of point.infectProbTemp
     *
     * @mbggenerated
     */
    public Double getInfectprobtemp() {
        return infectprobtemp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column point.infectProbTemp
     *
     * @param infectprobtemp the value for point.infectProbTemp
     *
     * @mbggenerated
     */
    public void setInfectprobtemp(Double infectprobtemp) {
        this.infectprobtemp = infectprobtemp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column point.infectTime
     *
     * @return the value of point.infectTime
     *
     * @mbggenerated
     */
    public Integer getInfecttime() {
        return infecttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column point.infectTime
     *
     * @param infecttime the value for point.infectTime
     *
     * @mbggenerated
     */
    public void setInfecttime(Integer infecttime) {
        this.infecttime = infecttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column point.timeLeft
     *
     * @return the value of point.timeLeft
     *
     * @mbggenerated
     */
    public Integer getTimeleft() {
        return timeleft;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column point.timeLeft
     *
     * @param timeleft the value for point.timeLeft
     *
     * @mbggenerated
     */
    public void setTimeleft(Integer timeleft) {
        this.timeleft = timeleft;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column point.color
     *
     * @return the value of point.color
     *
     * @mbggenerated
     */
    public String getColor() {
        return color;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column point.color
     *
     * @param color the value for point.color
     *
     * @mbggenerated
     */
    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column point.role
     *
     * @return the value of point.role
     *
     * @mbggenerated
     */
    public String getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column point.role
     *
     * @param role the value for point.role
     *
     * @mbggenerated
     */
    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column point.posx
     *
     * @return the value of point.posx
     *
     * @mbggenerated
     */
    public String getPosx() {
        return posx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column point.posx
     *
     * @param posx the value for point.posx
     *
     * @mbggenerated
     */
    public void setPosx(String posx) {
        this.posx = posx == null ? null : posx.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column point.posy
     *
     * @return the value of point.posy
     *
     * @mbggenerated
     */
    public String getPosy() {
        return posy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column point.posy
     *
     * @param posy the value for point.posy
     *
     * @mbggenerated
     */
    public void setPosy(String posy) {
        this.posy = posy == null ? null : posy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column point.name
     *
     * @return the value of point.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column point.name
     *
     * @param name the value for point.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point
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
        Point other = (Point) that;
        return (this.getStkcd() == null ? other.getStkcd() == null : this.getStkcd().equals(other.getStkcd()))
            && (this.getGraphid() == null ? other.getGraphid() == null : this.getGraphid().equals(other.getGraphid()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getDefectprob() == null ? other.getDefectprob() == null : this.getDefectprob().equals(other.getDefectprob()))
            && (this.getInfectprob() == null ? other.getInfectprob() == null : this.getInfectprob().equals(other.getInfectprob()))
            && (this.getInfectprobtemp() == null ? other.getInfectprobtemp() == null : this.getInfectprobtemp().equals(other.getInfectprobtemp()))
            && (this.getInfecttime() == null ? other.getInfecttime() == null : this.getInfecttime().equals(other.getInfecttime()))
            && (this.getTimeleft() == null ? other.getTimeleft() == null : this.getTimeleft().equals(other.getTimeleft()))
            && (this.getColor() == null ? other.getColor() == null : this.getColor().equals(other.getColor()))
            && (this.getRole() == null ? other.getRole() == null : this.getRole().equals(other.getRole()))
            && (this.getPosx() == null ? other.getPosx() == null : this.getPosx().equals(other.getPosx()))
            && (this.getPosy() == null ? other.getPosy() == null : this.getPosy().equals(other.getPosy()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStkcd() == null) ? 0 : getStkcd().hashCode());
        result = prime * result + ((getGraphid() == null) ? 0 : getGraphid().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getDefectprob() == null) ? 0 : getDefectprob().hashCode());
        result = prime * result + ((getInfectprob() == null) ? 0 : getInfectprob().hashCode());
        result = prime * result + ((getInfectprobtemp() == null) ? 0 : getInfectprobtemp().hashCode());
        result = prime * result + ((getInfecttime() == null) ? 0 : getInfecttime().hashCode());
        result = prime * result + ((getTimeleft() == null) ? 0 : getTimeleft().hashCode());
        result = prime * result + ((getColor() == null) ? 0 : getColor().hashCode());
        result = prime * result + ((getRole() == null) ? 0 : getRole().hashCode());
        result = prime * result + ((getPosx() == null) ? 0 : getPosx().hashCode());
        result = prime * result + ((getPosy() == null) ? 0 : getPosy().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", status=").append(status);
        sb.append(", defectprob=").append(defectprob);
        sb.append(", infectprob=").append(infectprob);
        sb.append(", infectprobtemp=").append(infectprobtemp);
        sb.append(", infecttime=").append(infecttime);
        sb.append(", timeleft=").append(timeleft);
        sb.append(", color=").append(color);
        sb.append(", role=").append(role);
        sb.append(", posx=").append(posx);
        sb.append(", posy=").append(posy);
        sb.append(", name=").append(name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public Point(String stkcd, String graphid, Byte status, Double defectprob, Double infectprob, Double infectprobtemp, Integer infecttime, Integer timeleft, String color, String role, String posx, String posy, String name) {
        super(stkcd, graphid);
        this.status = status;
        this.defectprob = defectprob;
        this.infectprob = infectprob;
        this.infectprobtemp = infectprobtemp;
        this.infecttime = infecttime;
        this.timeleft = timeleft;
        this.color = color;
        this.role = role;
        this.posx = posx;
        this.posy = posy;
        this.name = name;
    }

    public Point() {
    }
}