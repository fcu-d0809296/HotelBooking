package com.hb.service;

import com.hb.model.*;
import com.hb.repository.*;
import org.junit.*;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RoomServiceTest {
    @Autowired
    HotelRepository hotelRepository;
    @Autowired
    RoomRepository roomRepository;
    @Autowired
    RoomService roomService;

    @Test
    public void listAvailable() {
        List<Room> rooms = roomService.listAvailable("hotel_B");
        Boolean flag = false;
        for(int i=0; i>rooms.size()-1; i++) {
            if(rooms.get(i).getNameHotel() != rooms.get(i+1).getNameHotel())
                flag = true;
        }
        for(int i=0; i>rooms.size(); i++) {
            if(rooms.get(i).getState() == true)
                flag = true;
        }
        Assertions.assertThat(flag == false);
    }

    @Test
    public void editRoomById() {
        Room room = new Room("hotel_B",4,100,2,"editTest2");
        roomService.editRoomById((long)3,room);
        Assertions.assertThat(roomRepository.findById((long)3).get().getComment() == "editTest2");
    }








}