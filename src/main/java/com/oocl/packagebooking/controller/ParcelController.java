package com.oocl.packagebooking.controller;

import com.oocl.packagebooking.model.Parcel;
import com.oocl.packagebooking.repository.ParcelRespository;
import com.oocl.packagebooking.service.ParcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/parcels")
@CrossOrigin(origins = "http://localhost:8081")
public class ParcelController {

    @Autowired
    ParcelService parcelService;

    @GetMapping
    public ResponseEntity<List<Parcel>> getAllParcels(){

        return ResponseEntity.ok(parcelService.getAllParcels());
    }

    @PostMapping
    public ResponseEntity<Parcel> addOneParcel(@RequestBody Parcel parcel){
        return ResponseEntity.ok(parcelService.addOneParcel(parcel));
    }

//    @PutMapping
//    public ResponseEntity<Parcel> changeParcelTime(@RequestParam long id, @RequestParam Date date){
//        Parcel parcel= parcelService.updateParcelTime(date,id);
//        return ResponseEntity.ok(parcelService.updateParcelStatus(1,id));
//    }
//
//    @PutMapping
//    public ResponseEntity<Parcel> takeParcel(@RequestParam long id){
//        return ResponseEntity.ok(parcelService.updateParcelStatus(2,id));
//    }

}
