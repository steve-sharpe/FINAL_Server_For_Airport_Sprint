package com.airline.api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class City {
    @Id
    private Integer id;
    private String name;
    private String state;
    private Integer population;

    @OneToMany
    private List<Airport> airports;

    public City() {
    }

    public City(Integer id, String name, String state, Integer population) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.population = population;
    }

    public City(Integer id, String name, String state, Integer population, List<Airport> airports) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.population = population;
        this.airports = airports;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public Integer getPopulation() {
        return population;
    }

    public List<Airport> getAirports() {
        return airports;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public void setAirports(List<Airport> airports) {
        this.airports = airports;
    }
}