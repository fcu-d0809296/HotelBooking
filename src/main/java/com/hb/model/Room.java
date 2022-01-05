package com.hb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@SuppressWarnings("ALL")
@Entity
@Data
@Table(name = "rooms")
@EntityListeners(AuditingEntityListener.class)
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private Long id;

    @Column(name = "name_hotel")
    private String nameHotel;

    @Column(name = "floor")
    private Integer floor;

    @Column(name = "price")
    private Integer price;

    @Column(name = "capacity")
    private Integer capacity;

    @Column(name = "comment")
    private String comment;

    @Column(name = "state")
    private Integer state;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "check_in")
    private Date checkIn;
    @Column(name = "check_out")
    private Date checkOut;

    public Room() {
        this.state = 0;
    }

    public Room(String nameHotel, Integer floor,Integer price,Integer capacity,String comment) {
        this.nameHotel = nameHotel;
        this.floor = floor;
        this.state = 0;
        this.price = price;
        this.capacity = capacity;
        this.comment = comment;
        this.customerName = null;
        this.checkIn = null;
        this.checkOut = null;
    }

    @Override
    public String toString() {
        return "Room {" +
                "id=" + getId() +
                ", nameHotel='" + getNameHotel() + '\'' +
                ", floor='" + getFloor() + '\'' +
                ", state='" + getState() + '\'' +
                ", price='" + getPrice() + '\'' +
                ", capacity='" + getCapacity() + '\'' +
                ", customerName='" + getCustomerName() + '\'' +
                ", describe='" + getComment() + '\'' +
                ", checkIn='" + getCheckIn() + '\'' +
                ", checkOut='" + getCheckOut() + '\'' +
                '}'+"\n";
    }

}
