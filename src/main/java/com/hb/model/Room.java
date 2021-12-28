package com.hb.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

}
