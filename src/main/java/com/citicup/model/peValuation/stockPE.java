package com.citicup.model.peValuation;

import java.io.Serializable;

public class stockPE implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stockpe.stkcd
     *
     * @mbggenerated
     */
    private String stkcd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stockpe.pe
     *
     * @mbggenerated
     */
    private String pe;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table stockpe
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stockpe.stkcd
     *
     * @return the value of stockpe.stkcd
     *
     * @mbggenerated
     */
    public String getStkcd() {
        return stkcd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stockpe.stkcd
     *
     * @param stkcd the value for stockpe.stkcd
     *
     * @mbggenerated
     */
    public void setStkcd(String stkcd) {
        this.stkcd = stkcd == null ? null : stkcd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stockpe.pe
     *
     * @return the value of stockpe.pe
     *
     * @mbggenerated
     */
    public String getPe() {
        return pe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stockpe.pe
     *
     * @param pe the value for stockpe.pe
     *
     * @mbggenerated
     */
    public void setPe(String pe) {
        this.pe = pe == null ? null : pe.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stockpe
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
        stockPE other = (stockPE) that;
        return (this.getStkcd() == null ? other.getStkcd() == null : this.getStkcd().equals(other.getStkcd()))
            && (this.getPe() == null ? other.getPe() == null : this.getPe().equals(other.getPe()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stockpe
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStkcd() == null) ? 0 : getStkcd().hashCode());
        result = prime * result + ((getPe() == null) ? 0 : getPe().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stockpe
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stkcd=").append(stkcd);
        sb.append(", pe=").append(pe);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}