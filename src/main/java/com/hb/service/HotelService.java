package com.hb.service;

import com.hb.exception.NotFoundException;
import com.hb.model.Hotel;
import com.hb.model.Room;
import com.hb.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class HotelService{
    @Autowired
    private HotelRepository hotelRepo;
    @Autowired
    private RoomRepository roomRepo;

    public void addHotel(String name, String location, String comment) {
        Hotel hotel = new Hotel();
        hotel.setName(name);
        hotel.setLocation(location);
        hotel.setComment(comment);
        hotelRepo.save(hotel);
    }
    public void addHotel(Hotel hotel) {
        hotelRepo.save(hotel);
    }
    public List<Hotel> listHotels() {
        return (List<Hotel>) hotelRepo.findAll();
    }
    public List<Hotel> listHotelsByLocation(String location) {
        return hotelRepo.findByLocation(location);
    }
    public List<Room> listHotelsRoomByName(String name) {
        return roomRepo.findByNameHotel(name);
    }
    public Hotel getHotelByName(String name) {
        Hotel result = hotelRepo.findByName(name);
        return result;
    }
    public Hotel getHotelById(Long id) {
        return hotelRepo.findById(id).get();
    }
    public void deleteByHotelName(String name) {
        Hotel h = getHotelByName(name);
        hotelRepo.deleteById(h.getId());
        hotelRepo.clearAutoIncrement();
    }
    public void editHotelById(Long id, Hotel newData) {
        Hotel oldData = getHotelById(id);
        newData.setId(oldData.getId());
        hotelRepo.save(newData);
    }
    public void changeLocationByHotelName(String name, String newLocation) {
        Hotel h = getHotelByName(name);
        h.setLocation(newLocation);
        hotelRepo.save(h);
    }
    public void changeCommentByHotelName(String name, String newComment) {
        Hotel h = getHotelByName(name);
        h.setComment(newComment);
        hotelRepo.save(h);
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



















