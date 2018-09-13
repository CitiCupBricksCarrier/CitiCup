package com.citicup.model;

public class Index {
    private String stkcd;
    private String date;
    private String value;

    public Index(String stkcd, String date, String value){
        this.stkcd = stkcd;
        this.date = date;
        this.value = value;
    }

    public String getStkcd() {
        return stkcd;
    }

    public String getDate() {
        return date;
    }

    public String getValue() {
        return value;
    }
}
