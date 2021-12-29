package com.hb.repository;

import com.hb.model.Room;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface RoomRepository extends CrudRepository<Room, Integer> {
//    public long countById(int id);
//    Optional<Room> findAllById(Integer id);
}