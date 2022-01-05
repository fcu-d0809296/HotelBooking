package com.hb.repository;

import com.hb.model.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface RoomRepository extends CrudRepository<Room, Long> {

    List<Room> findByNameHotel(String name);
    List<Room> findByNameHotelAndState(String name,Integer state);
    List<Room> findByState(Integer state);
    void deleteAllByNameHotel(String name);
    @Modifying
    @Query(value = "alter table rooms AUTO_INCREMENT = 1", nativeQuery = true)
    public void clearAutoIncrement();


}