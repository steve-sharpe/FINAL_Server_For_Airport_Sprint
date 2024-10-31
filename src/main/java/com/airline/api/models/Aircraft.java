package com.airline.api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class Aircraft {
    @Id
    private Integer id;
    private String type;
    private String airlineName;
    private Integer numberOfPassengers;

    @OneToMany
    private List<Passenger> passengers;

    @OneToMany
    private List<Airport> airports;

    public Aircraft() {
    }

    public Aircraft(Integer id, String type, String airlineName, Integer numberOfPassengers) {
        this.id = id;
        this.type = type;
        this.airlineName = airlineName;
        this.numberOfPassengers = numberOfPassengers;
    }

    public Aircraft(Integer id, String type, String airlineName, Integer numberOfPassengers,
                    List<Passenger> passengers) {
        this.id = id;
        this.type = type;
        this.airlineName = airlineName;
        this.numberOfPassengers = numberOfPassengers;
        this.passengers = passengers;
    }

    public Aircraft(Integer id, String type, String airlineName, Integer numberOfPassengers, List<Passenger> passengers,
                    List<Airport> airports) {
        this.id = id;
        this.type = type;
        this.airlineName = airlineName;
        this.numberOfPassengers = numberOfPassengers;
        this.passengers = passengers;
        this.airports = airports;
    }

    public Integer getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public Integer getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public List<Airport> getAirports() {
        return airports;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}