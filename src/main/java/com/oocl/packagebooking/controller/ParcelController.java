package com.oocl.packagebooking.controller;

import com.oocl.packagebooking.model.Parcel;
import com.oocl.packagebooking.repository.ParcelRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/parcels")
@CrossOrigin(origins = "http://localhost:8081")
public class ParcelController {

    @Autowired
    ParcelRespository parcelRespository;

    @GetMapping
    public ResponseEntity<List<Parcel>> getParcels(){

        return ResponseEntity.ok(parcelRespository.findAll());
    }

    @PostMapping
    public ResponseEntity<Parcel> addOneParcel(@RequestBody Parcel parcel){
        return ResponseEntity.ok(parcelRespository.save(parcel));
    }

//    @PutMapping
//    public ResponseEntity<Parcel> takeParcel(@RequestParam long id){
//        return ResponseEntity.ok(parcelRespository.save(parcel));
//    }

}
