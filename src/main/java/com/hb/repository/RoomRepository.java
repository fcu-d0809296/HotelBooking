package com.hb.repository;

import com.hb.model.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface RoomRepository extends CrudRepository<Room, Integer> {


    //public long countById(int id);
    //List<Room> findAllByLocation(String loc);
}