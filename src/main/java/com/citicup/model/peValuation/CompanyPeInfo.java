package com.citicup.model.peValuation;

import java.io.Serializable;

public class CompanyPeInfo implements Serializable {
    private String companyName;
    private String stkcd;
    private double pe;
    private String evaluation;

    public CompanyPeInfo (String name, String stockCode, double pe, String evaluation) {
        this.companyName = name;
        this.stkcd = stockCode;
        this.pe = pe;
        this.evaluation = evaluation;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getStkcd() {
        return stkcd;
    }

    public double getPe() {
        return pe;
    }

    public String getEvaluation() {
        return evaluation;
    }
}
