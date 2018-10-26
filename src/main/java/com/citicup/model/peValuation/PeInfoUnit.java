package com.citicup.model.peValuation;

import java.util.List;

public class PeInfoUnit {
    private double pe;
    private String pePercentile;
    private String timeToMarket;
    private String evaluation;
    private double forecast;
    private List<CompanyPeInfo> peRank;

    public PeInfoUnit(double pe, String pePercentile, String evaluation, String timeToMarket, double forecast, List<CompanyPeInfo> list) {
        this.pe = pe;
        this.pePercentile = pePercentile;
        this.evaluation = evaluation;
        this.timeToMarket = timeToMarket;
        this.forecast = forecast;
        this.peRank = list;
    }

    public double getPe() {
        return pe;
    }

    public String getPePercentile() {
        return pePercentile;
    }

    public String getTimeToMarket() {
        return timeToMarket;
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
