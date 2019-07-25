package com.oocl.packagebooking.controller;

import com.oocl.packagebooking.model.Parcel;
import com.oocl.packagebooking.repository.ParcelRespository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ParcelControllerTest {

//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private ParcelRespository parcelRespository;
//
//    List<Parcel> parcelList;
//
//    @Before
//    public void beforeTest(){
//        parcelList=new ArrayList<>();
//
//        Parcel parcel1=new Parcel(1L,"lisi","123456789");
//        Parcel parcel2=new Parcel(2L,"zhangsan","123456789");
//        Parcel parcel3=new Parcel(3L,"zhangsan","123456789");
//        parcelList.add(parcel1);
//        parcelList.add(parcel2);
//        parcelList.add(parcel3);
//    }
//
//
//    @Test
//    public void should_return_all_parcel_items_when_get_all_parcel_items()throws Exception{
//        Mockito.when(parcelRespository.findAll()).thenReturn(parcelList);
//
//        mockMvc.perform(get("/parcels")
//                .contentType(MediaType.APPLICATION_JSON_UTF8))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.length()").value(parcelList.size()));
//
//    }
//
//    @Test
//    public void should_return_a_parcel_item_when_add_a_parcel_item()throws Exception{
//        Parcel parcel=new Parcel(10L,"lisi","123456789");
//
//        Mockito.when(parcelRespository.save(parcel)).thenReturn(parcel);
//
//        mockMvc.perform(post("/parcels")
//                .contentType(MediaType.APPLICATION_JSON_UTF8))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.id").value("10L"));
//
//    }
}