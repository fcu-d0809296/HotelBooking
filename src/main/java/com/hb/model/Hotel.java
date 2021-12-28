package com.hb.model;

import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

//@Table(name = "hotels")
public class Hotel {

    private int hotelId;

    private String hotelName;

    private String hotelLocation;

    private String hotelDescribe;

    private ArrayList<Room> hotelRooms ;
}
