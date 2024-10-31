package com.airline.api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class Airport {
    @Id
    private Integer id;
    private String name;
    private String code;

    @ManyToOne
    private City city;

    @OneToMany
    private List<Passenger> passengers;

    @OneToMany
    private List<Aircraft> aircrafts;

    public Airport() {
    }

    public Airport(Integer id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    public Airport(Integer id, String name, String code, City city) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.city = city;
    }

    public Airport(Integer id, String name, String code, City city, List<Passenger> passengers,
                   List<Aircraft> aircrafts) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.city = city;
        this.passengers = passengers;
        this.aircrafts = aircrafts;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public City getCity() {
        return city;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public List<Aircraft> getAircrafts() {
        return aircrafts;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public void setAircrafts(List<Aircraft> aircrafts) {
        this.aircrafts = aircrafts;
    }
}