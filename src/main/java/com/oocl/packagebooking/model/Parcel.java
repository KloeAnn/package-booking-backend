package com.oocl.packagebooking.model;

import java.util.Date;

public class Parcel {
    private long parcelId;
    private String name;
    private String tele;
    private int status;
    private Date getPaecelTime;

    public Parcel(){}

    public Parcel(String name, String tele) {
        this.name = name;
        this.tele = tele;
        this.status = 1;
    }

    public long getParcelId() {
        return parcelId;
    }

    public void setParcelId(long parcelId) {
        this.parcelId = parcelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getGetPaecelTime() {
        return getPaecelTime;
    }

    public void setGetPaecelTime(Date getPaecelTime) {
        this.getPaecelTime = getPaecelTime;
    }
}
