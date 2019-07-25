package com.oocl.packagebooking.model;

import java.util.ArrayList;
import java.util.List;

public class Station {
    private List<Parcel> parcelList;

    public Station(List<Parcel> parcelList) {
        this.parcelList = new ArrayList<>();
    }

    public List<Parcel> getParcelList() {
        return parcelList;
    }

    public void setParcelList(List<Parcel> parcelList) {
        this.parcelList = new ArrayList<>();
    }


    public void addParcel(Parcel parcel){
        getParcelList().add(parcel);
    }

    public void getParcel(Parcel parcel){

    }
}
