package com.oocl.packagebooking.model;

public class Boss {
    private Station station;

    public  Boss(){

    }

    public Boss(Station station) {
        this.station = station;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public void addParcel(Parcel parcel){
        getStation().getParcelList().add(parcel);
    }

    public void certainParcel(Parcel parcel){
        parcel.setStatus(4);
    }

}
