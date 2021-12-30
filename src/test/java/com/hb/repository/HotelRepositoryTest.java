//package com.hb.repository;
//
//import com.hb.model.Hotel;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.test.annotation.Rollback;
//import com.hb.repository.HotelRepository;
//import static org.junit.jupiter.api.Assertions.*;
//
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//@EnableJpaRepositories(basePackages = "com.hb.repository")
//@Rollback
//class HotelRepositoryTest {
//    @Autowired private HotelRepository hotelRepository;
//
//
//    @Test
//    void testAddHotel() {
//        Hotel hotel = new Hotel();
//        hotel.setId(3);
//        hotel.setHotelName("hotel3");
//        hotel.setLocation("tainan");
//        hotel.setHotelDescribe("test3");
//        Hotel savedHotel = hotelRepository.save(hotel);
//        //System.out.println(hotel);
//        //Assertions.assertThat(savedHotel).isNotNull();
//
////        User user = new User();
////
////        user.setFirstName("abcjsdksjdk");
////
////       User savedUser = repo.save(user);
////       System.out.println(user);
////       Assertions.assertThat(savedUser).isNotNull();
////       Assertions.assertThat(savedUser.getId()).isGreaterThan(0);
//    }
////    @Test
////    void listHotelsRoom() {
////    }
////    @Test
////    void findAllByLocation() {
////    }
//}