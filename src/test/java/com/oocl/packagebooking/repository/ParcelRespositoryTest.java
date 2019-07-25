package com.oocl.packagebooking.repository;

import com.oocl.packagebooking.model.Parcel;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;


@DataJpaTest

@RunWith(SpringRunner.class)
public class ParcelRespositoryTest {

    @Autowired
     TestEntityManager entityManager;

    @Autowired
     ParcelRespository parcelRespository;

    @Before
    public void initData() {

        Parcel parcel1=new Parcel(1L,"lisi","123456789");

        entityManager.persist(parcel1);

    }

    @Test
    public void should_return_parcel_when_update_status_with_id(){
        Parcel parcel=parcelRespository.updateParcelSetStatusForlId(1,1L);
        assertEquals(1,parcel.getStatus());
    }

}