package com.hb.repository;

import com.hb.model.Hotel;
import com.hb.model.User;
import org.springframework.data.repository.CrudRepository;

public interface HotelRespository extends CrudRepository<Hotel, Integer> {
    public long countById(int id);
}