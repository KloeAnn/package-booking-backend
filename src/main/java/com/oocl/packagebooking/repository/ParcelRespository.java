package com.oocl.packagebooking.repository;

import com.oocl.packagebooking.model.Parcel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface ParcelRespository extends JpaRepository<Parcel,Long> {

}
