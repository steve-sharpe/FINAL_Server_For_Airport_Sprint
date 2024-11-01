package com.airline.api.controllers;

import java.util.List;

import com.airline.api.models.Airport;
import com.airline.api.services.AirportService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("airports")
public class AirportController {
    @Autowired
    private AirportService airportService;

    @GetMapping
    public List<Airport> getAllAirports() {
        return airportService.getAirports();
    }

    @PostMapping
    public Airport addAirport(@RequestBody Airport airport) {
        return airportService.addAirport(airport);
    }

    @GetMapping("/{id}")
    public Airport getAirportById(@PathVariable Long id) {
        return airportService.getAirportById(id);
    }
}