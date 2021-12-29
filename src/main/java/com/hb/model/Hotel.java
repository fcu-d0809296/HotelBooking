package com.hb.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;

@SuppressWarnings("ALL")
@Entity
@Data
@Table(name = "hotels")
public class Hotel {
    @Id
    private Integer hotelId;

    @Column(length = 45, nullable = false, name = "name")
    private String hotelName;

    @Column(length = 45, nullable = false, name = "location")
    private String hotelLocation;

    @Column(length = 100, nullable = true, name = "describe")
    private String hotelDescribe;

    private ArrayList<Room> hotelRooms ;
}
