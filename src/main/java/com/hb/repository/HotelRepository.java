package com.hb.repository;

import com.hb.model.Hotel;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface HotelRepository extends CrudRepository<Hotel, Long> {
    Hotel findByName(String name);
    List<Hotel> findByLocation(String location);
    long count();

    @Modifying
    @Query(value = "alter table hotels AUTO_INCREMENT = 1", nativeQuery = true)
    void clearAutoIncrement();

    @Query(value = "SELECT location FROM hotels GROUP BY location", nativeQuery = true)
    List<String> listAllGroupLocation();

    //List<Hotel> countHotelByLocation();
}