package com.example.fmicro.controller;

public class Rate {

    private int rate;
    private String country;
    public Rate(int rate , String country){
        this.country = country;
        this.rate = rate;
    }
public Rate(){

}
    public int getRate(){return rate;}
    public String getCountry(){return country;}

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

