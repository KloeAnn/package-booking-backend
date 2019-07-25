package com.oocl.packagebooking.model;

import java.util.Date;

public class Costomer {
    private Parcel parcel;
    private String name;
    private String tele;

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public Costomer(String name, String tele,Parcel parcel) {
        this.tele=tele;
        this.name = name;
        this.parcel=this.parcel;
    }

    public Parcel getParcel() {
        return parcel;
    }

    public void setParcel(Parcel parcel) {
        this.parcel = parcel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void reserveParcel(Date date){
        getParcel().setGetPaecelTime(date);
        getParcel().setStatus(2);
    }
    public void takeParcel(){
        getParcel().setStatus(3);
    }
}
