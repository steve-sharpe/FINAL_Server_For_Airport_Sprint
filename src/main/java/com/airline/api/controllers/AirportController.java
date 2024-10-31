// this is the controller class for the airport entity

package com.airline.api.controllers;

import java.util.List;

import com.airline.api.models.Airport;
import com.airline.api.services.AirportService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/airports")
public class AirportController {
    @Autowired
    private AirportService airportService;

    @GetMapping
    public List<Airport> getAllAirports() {
        return airportService.getAirports();
    }

    @GetMapping("/{id}")
    public Airport getAirportById(@PathVariable Integer id) {
        return airportService.getAirportById(id);
    }
}
