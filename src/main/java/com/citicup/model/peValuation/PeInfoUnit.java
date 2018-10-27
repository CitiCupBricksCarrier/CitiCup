package com.citicup.model.peValuation;

import java.util.List;

public class PeInfoUnit {
    private double pe;
    private String pePercentile;
    private String valuationTime;
    private String evaluation;
    private double forecast;
    private List<CompanyPeInfo> peRank;

    public PeInfoUnit(double pe, String pePercentile, String evaluation, String valuationTime, double forecast, List<CompanyPeInfo> list) {
        this.pe = pe;
        this.pePercentile = pePercentile;
        this.evaluation = evaluation;
        this.valuationTime = valuationTime;
        this.forecast = forecast;
        this.peRank = list;
    }

    public double getPe() {
        return pe;
    }

    public String getPePercentile() {
        return pePercentile;
    }

    public String getValuationTime() {
        return valuationTime;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public double getForecast() {
        return forecast;
    }

    public List<CompanyPeInfo> getPeRank() {
        return peRank;
    }
}
