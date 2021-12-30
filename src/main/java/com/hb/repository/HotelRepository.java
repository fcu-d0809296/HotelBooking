package com.hb.repository;

import com.hb.model.Hotel;
import com.hb.model.Room;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface HotelRepository extends CrudRepository<Hotel, Integer> {
    //long countById(int id);

    @Query(value = "SELECT * FROM rooms WHERE hotel_id = :hotel_id;", nativeQuery = true)
    List<Room> listHotelsRoom(@Param("hotel_id") Integer targetHotel);

    @Query(value = "SELECT * FROM rooms WHERE location = :loc;", nativeQuery = true)
    List<Hotel> findAllByLocation(@Param("loc") String location);

}