package com.entity;

import java.util.Date;

public class Blacklist {
    private Integer blacklistid;

    private String suppliername;

    private String applyunit;

    private String applyman;

    private String applyitem;

    private String applyremark;

    private Date applydate;

    private String checkunit;

    private String checkman;

    private String checkremark;

    private Date checkdate;

    private String status;

    private String suggestion;

    public Integer getBlacklistid() {
        return blacklistid;
    }

    public void setBlacklistid(Integer blacklistid) {
        this.blacklistid = blacklistid;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername == null ? null : suppliername.trim();
    }

    public String getApplyunit() {
        return applyunit;
    }

    public void setApplyunit(String applyunit) {
        this.applyunit = applyunit == null ? null : applyunit.trim();
    }

    public String getApplyman() {
        return applyman;
    }

    public void setApplyman(String applyman) {
        this.applyman = applyman == null ? null : applyman.trim();
    }

    public String getApplyitem() {
        return applyitem;
    }

    public void setApplyitem(String applyitem) {
        this.applyitem = applyitem == null ? null : applyitem.trim();
    }

    public String getApplyremark() {
        return applyremark;
    }

    public void setApplyremark(String applyremark) {
        this.applyremark = applyremark == null ? null : applyremark.trim();
    }

    public Date getApplydate() {
        return applydate;
    }

    public void setApplydate(Date applydate) {
        this.applydate = applydate;
    }

    public String getCheckunit() {
        return checkunit;
    }

    public void setCheckunit(String checkunit) {
        this.checkunit = checkunit == null ? null : checkunit.trim();
    }

    public String getCheckman() {
        return checkman;
    }

    public void setCheckman(String checkman) {
        this.checkman = checkman == null ? null : checkman.trim();
    }

    public String getCheckremark() {
        return checkremark;
    }

    public void setCheckremark(String checkremark) {
        this.checkremark = checkremark == null ? null : checkremark.trim();
    }

    public Date getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion == null ? null : suggestion.trim();
    }
}