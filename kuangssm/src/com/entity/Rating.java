package com.entity;

public class Rating {
    private Integer ratingid;

    private Integer year;

    private String powerplant;

    private String suppliername;

    private Float jan;

    private Float feb;

    private Float mar;

    private Float apr;

    private Float may;

    private Float jun;

    private Float july;

    private Float aug;

    private Float sep;

    private Float oct;

    private Float nov;

    private Float dec;

    private Float annualrating;

    private String rank;

    public Integer getRatingid() {
        return ratingid;
    }

    public void setRatingid(Integer ratingid) {
        this.ratingid = ratingid;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getPowerplant() {
        return powerplant;
    }

    public void setPowerplant(String powerplant) {
        this.powerplant = powerplant == null ? null : powerplant.trim();
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername == null ? null : suppliername.trim();
    }

    public Float getJan() {
        return jan;
    }

    public void setJan(Float jan) {
        this.jan = jan;
    }

    public Float getFeb() {
        return feb;
    }

    public void setFeb(Float feb) {
        this.feb = feb;
    }

    public Float getMar() {
        return mar;
    }

    public void setMar(Float mar) {
        this.mar = mar;
    }

    public Float getApr() {
        return apr;
    }

    public void setApr(Float apr) {
        this.apr = apr;
    }

    public Float getMay() {
        return may;
    }

    public void setMay(Float may) {
        this.may = may;
    }

    public Float getJun() {
        return jun;
    }

    public void setJun(Float jun) {
        this.jun = jun;
    }

    public Float getJuly() {
        return july;
    }

    public void setJuly(Float july) {
        this.july = july;
    }

    public Float getAug() {
        return aug;
    }

    public void setAug(Float aug) {
        this.aug = aug;
    }

    public Float getSep() {
        return sep;
    }

    public void setSep(Float sep) {
        this.sep = sep;
    }

    public Float getOct() {
        return oct;
    }

    public void setOct(Float oct) {
        this.oct = oct;
    }

    public Float getNov() {
        return nov;
    }

    public void setNov(Float nov) {
        this.nov = nov;
    }

    public Float getDec() {
        return dec;
    }

    public void setDec(Float dec) {
        this.dec = dec;
    }

    public Float getAnnualrating() {
        return annualrating;
    }

    public void setAnnualrating(Float annualrating) {
        this.annualrating = annualrating;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank == null ? null : rank.trim();
    }
}