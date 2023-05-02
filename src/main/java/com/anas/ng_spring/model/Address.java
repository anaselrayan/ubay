package com.anas.ng_spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {
    @Id
    private int id;
    private String country;
    private String state;
    private String city;
    private String street;
}
