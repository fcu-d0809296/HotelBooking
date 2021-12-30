package com.hb.service;

import com.hb.exception.NotFoundException;
import com.hb.model.Hotel;
import com.hb.model.Room;
import com.hb.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepo;

//    public void changeRoomDescribe(Integer id,String newDescribe) throws NotFoundException {
//        Hotel p = new Hotel();
//        p = getHotelById(id);
//        p.setHotelDescribe(newDescribe);
//        hotelRepo.save(p);
//    List<Room> findAllByHotelId(long id) {
//        return roomRepo.findAllByHotelId(id);
//    }
//
//    List<Room> findAllByLocation(String city) {
//        return roomRepo.findAllByLocation(city);
//    }
}
