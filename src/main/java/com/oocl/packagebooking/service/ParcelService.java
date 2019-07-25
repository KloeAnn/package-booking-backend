package com.oocl.packagebooking.service;

import com.oocl.packagebooking.model.Parcel;
import com.oocl.packagebooking.repository.ParcelRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ParcelService {

    @Autowired
    ParcelRespository parcelRespository;


    public List<Parcel> getAllParcels(){
        return parcelRespository.findAll();
    }

    public Parcel addOneParcel(Parcel parcel){
        return parcelRespository.save(parcel);
    }

    public Parcel updateParcelTime(Date date,long id){
        return parcelRespository.updateParcelSetgetPaecelTimeForParcelId(date,id);
    }

    public Parcel updateParcelStatus(int status,long id){
        return parcelRespository.updateParcelSetStatusForParcelId(status,id);
    }
}
