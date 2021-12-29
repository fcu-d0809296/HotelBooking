package com.hb.service;

import com.hb.repository.HotelRepository;
import com.hb.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelService{
    @Autowired
    private HotelRepository hotelRepo;
    @Autowired
    private RoomRepository roomRepo;

//    public List<Hotel> listAllHotel() {
//        return (List<Hotel>) hotelRepo.findAll();
//    }
//    public void save(Hotel hotel) {
//        hotelRepo.save(hotel);
//    }
//    public Hotel getHotel(Integer id) throws NotFoundException {
//        Optional<Hotel> result = hotelRepo.findById(id);
//        if (result.isPresent()) {
//            return result.get();
//        }
//        throw new NotFoundException("Could not find any hotels with ID" + id);
//    }
//    public void delete(int id) throws NotFoundException {
//        long count = hotelRepo.countById(id);
//        if (count == 0) {
//            throw new NotFoundException("Could not find any users with ID" + id);
//        }
//        hotelRepo.deleteById(id);
//    }


}



















