package com.hb.model;

import lombok.Data;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.ArrayList;

@SuppressWarnings("ALL")
@Entity
@Data
@Table(name = "hotels")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45, nullable = false, name = "name")
    private String hotelName;

    @Column(length = 45, nullable = false, name = "location")
    private String hotelLocation;

    @Column(length = 100, nullable = true, name = "describe")
    private String hotelDescribe;

//    @Nullable
//    private ArrayList<Room> hotelRooms ;

    @Override
    public String toString() {
        return "Room{" +
                "id=" + getId() +
                ", hotelName='" + getHotelName() + '\'' +
                ", hotelLocation='" + getHotelLocation() + '\'' +
                ", hotelDescribe='" + getHotelDescribe() + '\'' +
//                ", hotelRooms='" + getHotelRooms() + '\'' +
                '}';
    }
}
