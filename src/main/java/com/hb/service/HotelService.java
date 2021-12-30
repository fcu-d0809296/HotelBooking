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

    public void addHotel(String name, String location, String desc) {
        Hotel hotel = new Hotel();
        hotel.setHotelName(name);
        hotel.setHotelLocation("taipei");
        hotel.setHotelDescribe("NO");
        hotelRepo.save(hotel);
    }
    public List<Hotel> listAllHotel() {
        return (List<Hotel>) hotelRepo.findAll();
    }
    public List<Room> listHotelsRoomById(Integer id) {
        return (List<Room>) hotelRepo.listHotelsRoom(id);
    }
    public Hotel getHotelById(Integer id) throws NotFoundException {
        Optional<Hotel> result = hotelRepo.findById(id);
        if (result.isPresent()) {
            return result.get();
        }
        throw new NotFoundException("Could not find any hotels with ID" + id);
    }

    public void changeHotelLocation(Integer id,String newLoc) throws NotFoundException{
        Hotel p = new Hotel();
        p = getHotelById(id);
        p.setHotelDescribe(newLoc);
        hotelRepo.save(p);
//        Hotel p = new Hotel();
//        p = hotelRepo.findById(id).get();
//        p.setHotelLocation(newLoc);
//        hotelRepo.save(p);
    }
    public void changeHotelDescribe(Integer id,String newDescribe) throws NotFoundException{
        Hotel p = new Hotel();
        p = getHotelById(id);
        p.setHotelDescribe(newDescribe);
        hotelRepo.save(p);
//        Hotel p = new Hotel();
//        p = hotelRepo.findById(id).get();
//        p.setHotelDescribe(newDescribe);
//        hotelRepo.save(p);
    }
    public void deleteHotel(int id) throws NotFoundException {
        Optional<Hotel> result = hotelRepo.findById(id);
        roomRepo.deleteAll(listHotelsRoomById(id));
        if (result.isPresent()) {
            hotelRepo.deleteById(id);
        }
        throw new NotFoundException("Could not find any hotels with ID" + id);

    }
//    public void save(Hotel hotel) {
//        hotelRepo.save(hotel);
//    }
//    public void delete(Hotel hotel) {
//        hotelRepo.delete(hotel);
//    }

}



















