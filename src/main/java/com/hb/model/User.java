package com.hb.model;

import lombok.Data;

import javax.persistence.*;

@SuppressWarnings("ALL")
@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45, nullable = false, name = "name")
    private String userName;

    @Column(length = 45, nullable = false, name = "email")
    private String userEmail;

    @Column(length = 16, nullable = false, name = "password")
    private String userPassword;

//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + getId() +
//
//                ", firstName='" + getFirstName() + '\'' +
//                '}';
//    }

}
