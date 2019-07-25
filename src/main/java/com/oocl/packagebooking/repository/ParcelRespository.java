package com.oocl.packagebooking.repository;

import com.oocl.packagebooking.model.Parcel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface ParcelRespository extends JpaRepository<Parcel,Long> {
    @Modifying
    @Query("update Parcel u set u.status = :status where u.parcelId = :parcelId")
    Parcel updateParcelSetStatusForParcelId(@Param("status") Integer status, @Param("parcelId") long parcelId);

    @Query("update Parcel u set u.getPaecelTime = :getPaecelTime where u.parcelId = :parcelId")
    Parcel updateParcelSetgetPaecelTimeForParcelId(@Param("getPaecelTime") Date getPaecelTime, @Param("parcelId") long parcelId);
}
