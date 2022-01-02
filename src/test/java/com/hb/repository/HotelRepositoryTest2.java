package com.hb.repository;

import com.hb.MyHotelBookingApplication;
import com.hb.model.Hotel;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

//@RunWith(SpringRunner.class)
////@ContextConfiguration(classes = ElastSearchBootApplication.class)
//@SpringBootTest(classes = {MyHotelBookingApplication.class})
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HotelRepositoryTest2 {
    @Autowired
    HotelRepository hotelRepository;

    @Test
    public void listHotels() {
        System.out.println(hotelRepository.findAll());
    }

//    @Test
//    public void addTest() throws Exception{
////        Hotel hotel = new Hotel();
////        hotel.setName("hotel3");
////        hotel.setLocation("tainan");
////        hotel.setDescribe("test3");
//        Hotel hotel = new Hotel("hotel4","Tainan","test3");
//        hotelRepository.save(hotel);
//        System.out.println(hotelRepository.findAll());
//    }
}