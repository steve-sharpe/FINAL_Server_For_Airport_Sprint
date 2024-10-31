package com.airline.api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.ManyToMany;
import java.util.List;

@Entity
public class Passenger {
    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    @ManyToOne
    private City city;

    @ManyToMany
    private List<Aircraft> aircrafts;

    public Passenger() {
    }

    public Passenger(Integer id, String firstName, String lastName, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public Passenger(Integer id, String firstName, String lastName, String phoneNumber, City city) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.city = city;
    }

    public Passenger(Integer id, String firstName, String lastName, String phoneNumber, City city,
                     List<Aircraft> aircrafts) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.aircrafts = aircrafts;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public City getCity() {
        return city;
    }

    public List<Aircraft> getAircrafts() {
        return aircrafts;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}