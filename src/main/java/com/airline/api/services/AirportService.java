// This is the service class for the Airport entity. This class is used to interact with the database.
// Cities can have many airports
// Passengers can fly on many aircraft and live in one city
// Aircraft can have many passengers and land/take off from many Airports
// Airports can only be in one city
// Airports can have many aircraft
// Airports can have many passengers

package com.airline.api.services;

import com.airline.api.models.Airport;
import com.airline.api.repositories.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportService {
    private final AirportRepository airportRepository;

    @Autowired
    public AirportService(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }

    public List<Airport> getAirports() {
        return airportRepository.findAll();
    }

    public Airport getAirportById(int id) {
        return airportRepository.findById(id).orElse(null);
    }

    public Airport addAirport(Airport airport) {
        return airportRepository.save(airport);
    }

    public Airport updateAirport(Airport airport) {
        return airportRepository.save(airport);
    }

    public void deleteAirport(int id) {
        airportRepository.deleteById(id);
    }
}
