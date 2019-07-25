package com.oocl.packagebooking.controller;

import com.oocl.packagebooking.model.Parcel;
import com.oocl.packagebooking.repository.ParcelRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ParcelController {

    @Autowired
    ParcelRespository parcelRespository;

    @GetMapping
    public ResponseEntity<List<Parcel>> getAllParcels(){
        return ResponseEntity.ok(parcelRespository.findAll());
    }

}
