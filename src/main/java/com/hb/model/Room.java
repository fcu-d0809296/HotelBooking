package com.hb.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roomId;

    private Integer hotelId;

    private Integer roomFloor;

    private Boolean roomState;

    private Integer roomPrice;

    private String guestUserName;

    private Integer roomCapacity;

    private String roomDescribe;

    private Date checkIn;
    private Date checkOut;
}
