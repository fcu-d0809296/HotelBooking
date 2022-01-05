package com.hb.service;

import com.hb.model.*;
import com.hb.repository.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.assertj.core.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HotelServiceTest {
    @Autowired
    HotelRepository hotelRepository;
    @Autowired
    RoomRepository roomRepository;
    @Autowired
    HotelService hotelService;

    @Test
    public void listHotels() {
        Assertions.assertThat(hotelService.listHotels().size()>0);
        Assertions.assertThat(hotelService.listHotels().size() == hotelRepository.count());
        System.out.println(hotelService.listHotels());
    }
    @Test
    public void addHotelWithArgs() {
        long size = hotelRepository.count();
        hotelService.addHotel("Test Name","Tainan","test3");
        Assertions.assertThat(hotelRepository.count() == size+1);
        hotelService.deleteByHotelName("Test Name");
    }
    @Test
    public void addHotelWithObj() {
        long size = hotelRepository.count();
        Hotel hotel = new Hotel("Test Name","Tainan","test3");
        hotelService.addHotel(hotel);
        Assertions.assertThat(hotelRepository.count() == size+1);
        hotelService.deleteByHotelName("Test Name");
    }
    @Test
    public void getHotelByName() {
        hotelService.addHotel("Test Name","Tainan","test3");
        Hotel hotel = hotelService.getHotelByName("Test Name");
        Assertions.assertThat("Test Name" == hotel.getName());
        hotelRepository.delete(hotel);
        hotelRepository.clearAutoIncrement();
    }
    @Test
    public void clearAutoIncrement() {
        hotelRepository.clearAutoIncrement();
    }
    @Test
    public void deleteByHotelName() {
        Hotel hotel = new Hotel("Test Name","Tainan","test3");
        hotelRepository.save(hotel);
        hotelService.deleteByHotelName("Test Name");
        Assertions.assertThat(hotelService.getHotelByName("Test Name") == null);
    }
    @Test
    public void getHotelsByLocation() {
        List<Hotel> hotels = hotelService.listHotelsByLocation("Taipei");
        Boolean flag = false;
        for(int i=0; i>hotels.size()-1; i++) {
            if(hotels.get(i).getLocation() != hotels.get(i+1).getLocation())
                flag = true;
        }
        Assertions.assertThat(flag == false);
    }
//    @Test
//    public void changeLocationByHotelName() {
//        hotelService.addHotel("Test Name","Tainan","test3");
//        hotelService.changeLocationByHotelName("Test Name","change location test");
//        Assertions.assertThat(hotelService.getHotelByName("Test Name").getLocation() == "change location test");
//        hotelService.deleteByHotelName("Test Name");
//
//    }
//    @Test
//    public void changeCommentByHotelName() {
//        hotelService.addHotel("Test Name","Tainan","test3");
//        hotelService.changeCommentByHotelName("Test Name","change comment test");
//        Assertions.assertThat(hotelService.getHotelByName("Test Name").getLocation() == "change comment test");
//        hotelService.deleteByHotelName("Test Name");
//    }
    @Test
    public void listHotelsRoomByName() {
        List<Room> rooms = hotelService.listHotelsRoomByName("hotel_B");
        Boolean flag = false;
        for(int i=0; i>rooms.size()-1; i++) {
            if(rooms.get(i).getNameHotel() != rooms.get(i+1).getNameHotel())
                flag = true;
        }
        Assertions.assertThat(flag == false);
        System.out.println(roomRepository.findByNameHotel("hotel_B"));
    }
    @Test
    public void listAllGroupLocation() {
        System.out.println(hotelService.listAllGroupLocation());
    }

}