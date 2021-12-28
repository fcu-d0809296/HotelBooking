package com.hb.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;

@Data
//@Table(name = "hotels")
public class Hotel {

    private Integer hotelId;

    private String hotelName;

    private String hotelLocation;

    private String hotelDescribe;

    private ArrayList<Room> hotelRooms ;
}
