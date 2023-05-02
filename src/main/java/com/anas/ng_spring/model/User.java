package com.anas.ng_spring.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class User {
    @Id @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Address> addressList;
    private Date joinedAt;
    private Date updatedAt;
    private Date deletedAt;
}
