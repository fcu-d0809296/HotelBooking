package com.hb.repository;

import com.hb.model.Hotel;
import com.hb.model.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

public interface HotelRepository extends CrudRepository<Hotel, Integer> {
    //public long countById(int id);

}