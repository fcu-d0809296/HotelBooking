package com.hb.service;

import com.hb.model.Hotel;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import com.hb.service.HotelService;
import com.hb.repository.HotelRepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class HotelServiceTest {
    @Autowired
    private HotelService hotelService;
    @Autowired
    private HotelRepository hotelRepository;

    @Test
    void addHotel(){
        Hotel hotel = new Hotel();
        hotel.setId(3);
        hotel.setHotelName("hotel3");
        hotel.setHotelLocation("tainan");
        hotel.setHotelDescribe("test3");
        //hotelRepository.save(hotel);
        //Hotel savedHotel = hotelRepository.save(hotel);

        System.out.println(hotel.toString());
        //Assertions.assertThat(savedHotel).isNotNull();

//        User user = new User();
//
//        user.setFirstName("abcjsdksjdk");
//
//       User savedUser = repo.save(user);
//       System.out.println(user);
//       Assertions.assertThat(savedUser).isNotNull();
//       Assertions.assertThat(savedUser.getId()).isGreaterThan(0);

    }
//    @Test
//    void listAllHotel() {
//    }
//
//    @Test
//    void listHotelsRoomById() {
//    }
//
//    @Test
//    void getHotelById() {
//    }
//
//    @Test
//    void changeHotelLocation() {
//    }
//
//    @Test
//    void changeHotelDescribe() {
//    }
//
//    @Test
//    void deleteHotel() {
//    }
}