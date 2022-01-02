package com.hb.service;

import com.hb.exception.NotFoundException;
import com.hb.model.Hotel;
import com.hb.model.Room;
import com.hb.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class RoomService{
    @Autowired
    private HotelRepository hotelRepo;
    @Autowired
    private RoomRepository roomRepo;

    public void addRoom(String nameHotel, Integer floor, Integer price, Integer capacity,String comment) {
        Room room = new Room(nameHotel,floor,price,capacity,comment);
        roomRepo.save(room);
    }
    public void addRoom(Room room) {
        roomRepo.save(room);
    }
    public Room getRoomById(Long id) {
        return roomRepo.findById(id).get();
    }
    public List<Room> listRooms() {
        return (List<Room>) roomRepo.findAll();
    }
    public List<Room> listAvailable(String nameHotel) {
        return roomRepo.findByNameHotelAndState(nameHotel,0);
    }
    public List<Room> listRoomsByHotelName(String name) {
        return roomRepo.findByNameHotel(name);
    }
    public void clearBookingRoomById(Long id) {
        Room room = getRoomById(id);
        room.setState(true);
        room.setCustomerName(null);
        room.setCheckIn(null);
        room.setCheckOut(null);
        roomRepo.save(room);
    }
    public void bookingRoomById(Long id, String customerName, Date checkIn, Date checkOut) {
        Room room = getRoomById(id);
        room.setState(false);
        room.setCustomerName(customerName);
        room.setCheckIn(checkIn);
        room.setCheckOut(checkOut);
        roomRepo.save(room);
    }
    public void editRoomById(Long id,Room newData) {
        Room oldData = getRoomById(id);
        newData.setId(oldData.getId());
        roomRepo.save(newData);
    }
    public void deleteRoomsByHotelName(String name) {
        roomRepo.deleteAllByNameHotel(name);
    }
    public void deleteRoomById(Long id) {
        roomRepo.deleteById(id);
    }


//    public Hotel getHotelById(Integer id) throws NotFoundException {
//        Optional<Hotel> result = hotelRepo.findById(id);
//        if (result.isPresent()) {
//            return result.get();
//        }
//        throw new NotFoundException("Could not find any hotels with ID" + id);
//    }
//

//    public void deleteHotel(int id) throws NotFoundException {
//        Optional<Hotel> result = hotelRepo.findById(id);
//        roomRepo.deleteAll(listHotelsRoomById(id));
//        if (result.isPresent()) {
//            hotelRepo.deleteById(id);
//        }
//        throw new NotFoundException("Could not find any hotels with ID" + id);
//
//    }
//    public void save(Hotel hotel) {
//        hotelRepo.save(hotel);
//    }
//    public void delete(Hotel hotel) {
//        hotelRepo.delete(hotel);
//    }

}



















