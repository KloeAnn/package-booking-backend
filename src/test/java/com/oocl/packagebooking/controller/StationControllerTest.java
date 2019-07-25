package com.oocl.packagebooking.controller;

import com.oocl.packagebooking.model.Parcel;
import com.oocl.packagebooking.repository.ParcelRespository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringRunner.class)
@DataJpaTest
class StationControllerTest {

    @Autowired
    ParcelRespository parcelRespository;


    @Test
    public void should_return_a_parcel_item_when_add_a_parcel_item(){
        List<Parcel>parcelList=new ArrayList<>();

        Parcel parcel1=new Parcel("lisi","123456789");
        Parcel parcel2=new Parcel("zhangsan","123456789");
        Parcel parcel3=new Parcel("zhangsan","123456789");
        parcelList.add(parcel1);
        parcelList.add(parcel2);
        parcelList.add(parcel3);
    }

}