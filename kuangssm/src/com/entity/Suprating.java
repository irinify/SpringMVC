package com.entity;

public class Suprating {
    private Integer supratingid;

    private Integer year;

    private String suppliername;

    private Float annualrating;

    private String rank;

    public Integer getSupratingid() {
        return supratingid;
    }

    public void setSupratingid(Integer supratingid) {
        this.supratingid = supratingid;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername == null ? null : suppliername.trim();
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