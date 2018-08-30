package com.citicup.model;

import java.io.Serializable;

public class Edge extends EdgeKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column edge.status
     *
     * @mbggenerated
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column edge.propagateProbA
     *
     * @mbggenerated
     */
    private Double propagateproba;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column edge.propagateProbB
     *
     * @mbggenerated
     */
    private Double propagateprobb;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column edge.fund
     *
     * @mbggenerated
     */
    private Double fund;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table edge
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column edge.status
     *
     * @return the value of edge.status
     *
     * @mbggenerated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column edge.status
     *
     * @param status the value for edge.status
     *
     * @mbggenerated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column edge.propagateProbA
     *
     * @return the value of edge.propagateProbA
     *
     * @mbggenerated
     */
    public Double getPropagateproba() {
        return propagateproba;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column edge.propagateProbA
     *
     * @param propagateproba the value for edge.propagateProbA
     *
     * @mbggenerated
     */
    public void setPropagateproba(Double propagateproba) {
        this.propagateproba = propagateproba;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column edge.propagateProbB
     *
     * @return the value of edge.propagateProbB
     *
     * @mbggenerated
     */
    public Double getPropagateprobb() {
        return propagateprobb;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column edge.propagateProbB
     *
     * @param propagateprobb the value for edge.propagateProbB
     *
     * @mbggenerated
     */
    public void setPropagateprobb(Double propagateprobb) {
        this.propagateprobb = propagateprobb;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column edge.fund
     *
     * @return the value of edge.fund
     *
     * @mbggenerated
     */
    public Double getFund() {
        return fund;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column edge.fund
     *
     * @param fund the value for edge.fund
     *
     * @mbggenerated
     */
    public void setFund(Double fund) {
        this.fund = fund;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edge
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
        Edge other = (Edge) that;
        return (this.getStkcda() == null ? other.getStkcda() == null : this.getStkcda().equals(other.getStkcda()))
            && (this.getStkcdb() == null ? other.getStkcdb() == null : this.getStkcdb().equals(other.getStkcdb()))
            && (this.getGraphid() == null ? other.getGraphid() == null : this.getGraphid().equals(other.getGraphid()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getPropagateproba() == null ? other.getPropagateproba() == null : this.getPropagateproba().equals(other.getPropagateproba()))
            && (this.getPropagateprobb() == null ? other.getPropagateprobb() == null : this.getPropagateprobb().equals(other.getPropagateprobb()))
            && (this.getFund() == null ? other.getFund() == null : this.getFund().equals(other.getFund()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edge
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStkcda() == null) ? 0 : getStkcda().hashCode());
        result = prime * result + ((getStkcdb() == null) ? 0 : getStkcdb().hashCode());
        result = prime * result + ((getGraphid() == null) ? 0 : getGraphid().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getPropagateproba() == null) ? 0 : getPropagateproba().hashCode());
        result = prime * result + ((getPropagateprobb() == null) ? 0 : getPropagateprobb().hashCode());
        result = prime * result + ((getFund() == null) ? 0 : getFund().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edge
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
        sb.append(", propagateproba=").append(propagateproba);
        sb.append(", propagateprobb=").append(propagateprobb);
        sb.append(", fund=").append(fund);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public Edge(String stkcda, String stkcdb, String graphid,
                Byte status, Double propagateproba, Double propagateprobb, Double fund) {
        super(stkcda, stkcdb, graphid);
        this.status = status;
        this.propagateproba = propagateproba;
        this.propagateprobb = propagateprobb;
        this.fund = fund;
    }

    public Edge() {
    }
}
