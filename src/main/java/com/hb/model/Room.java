package com.hb.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@SuppressWarnings("ALL")
@Entity
@Data
@Table(name = "rooms")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roomId;
    @Column(nullable = false, name = "hotel_id")
    private Integer hotelId;

    @Column(nullable = false, name = "floor")
    private Integer roomFloor;

    @Column(nullable = false, name = "state")
    private Boolean roomState;

    @Column(nullable = false, name = "price")
    private Integer roomPrice;

    @Column(nullable = false, name = "capacity")
    private Integer roomCapacity;

    @Column(nullable = true, name = "customer_name")
    private String customerName;

    @Column(nullable = true, name = "describe")
    private String roomDescribe;

    @Column(nullable = true, name = "check_in")
    private Date checkIn;
    @Column(nullable = true, name = "check_out")
    private Date checkOut;

    @Override
    public String toString() {
        return "Room{" +
                "id=" + getRoomId() +
                ", hotelId='" + getHotelId() + '\'' +
                ", roomFloor='" + getRoomFloor() + '\'' +
                ", roomState='" + getRoomState() + '\'' +
                ", roomPrice='" + getRoomPrice() + '\'' +
                ", roomCapacity='" + getRoomCapacity() + '\'' +
                ", customerName='" + getCustomerName() + '\'' +
                ", roomDescribe='" + getRoomDescribe() + '\'' +
                ", checkIn='" + getCheckIn() + '\'' +
                ", checkOut='" + getCheckOut() + '\'' +
                '}';
    }
}
