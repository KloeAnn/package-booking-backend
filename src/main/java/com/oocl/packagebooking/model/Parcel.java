package com.oocl.packagebooking.model;

import org.hibernate.annotations.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Parcel {
    @Id
    @GeneratedValue
    private long parcelId;

    private String name;

    private String tele;

    private int status;

    private Date getPaecelTime;

    public Parcel(){}

    public Parcel(String name, String tele) {
        this.name = name;
        this.tele = tele;
        this.getPaecelTime=new Date();
        this.status = 0;
    }

    public Parcel(long id,String name, String tele) {
        this.parcelId=id;
        this.name = name;
        this.tele = tele;
        this.getPaecelTime=new Date();
        this.status = 0;
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
