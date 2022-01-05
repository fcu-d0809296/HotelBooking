package com.hb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import java.util.ArrayList;

@SuppressWarnings("ALL")
@Entity
@Table(name = "hotels")
@Data
@EntityListeners(AuditingEntityListener.class)
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String location;

    @Column(name = "comment")
    private String comment;

    @Column(name = "image_hotel")
    private String imgHotel;
//
//    public Long getId() { return id; }
//    public void setId(Long id) { this.id = id;}
//
//    public String getName() { return name; }
//    public void setName(String name) { this.name = name;}
//
//    public String getLocation() { return location; }
//    public void setLocation(String location) { this.location = location;}
//
//    public String getComment() { return comment; }
//    public void setComment(String comment) { this.comment = comment;}
//
    public Hotel() {}

    public Hotel(String name, String location,String comment) {
        this.name = name;
        this.location = location;
        this.comment = comment;
    }

//    @Nullable
//    private ArrayList<Room> hotelRooms ;

//    @Override
//    public String toString() {
//        return "Hotel{" +
//                "id=" + getId() +
//                ", hotelName='" + getName() + '\'' +
//                ", hotelLocation='" + getLocation() + '\'' +
//                ", hotelComment='" + getComment() + '\'' +
////                ", hotelRooms='" + getHotelRooms() + '\'' +
//                '}'+"\n";
//    }
}
