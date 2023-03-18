package edu.sdr.dc.model;

import lombok.Getter;

@Getter
public class Rate {

    private Integer id;
    private String currency;
    private String rate;
    private String date;
    private Integer multiplier;

    public Rate(String date, String currency, String rate, Integer multiplier) {
        this.currency = currency;
        this.rate = rate;
        this.date = date;
        this.multiplier = multiplier;
    }

    public Rate(String date, String currency, String rate) {
        this.currency = currency;
        this.rate = rate;
        this.date = date;
        this.multiplier = 1;
    }
}
