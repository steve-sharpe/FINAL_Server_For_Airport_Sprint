// this is the controller class for the passenger entity

package com.airline.api.controllers;

import java.util.List;

import com.airline.api.models.Passenger;
import com.airline.api.services.PassengerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/passengers")
public class PassengerController {
    @Autowired
    private PassengerService passengerService;

    @GetMapping
    public List<Passenger> getPassengers() {
        return passengerService.getPassengers();
    }

    @GetMapping("/{id}")
    public Passenger getPassenger(@PathVariable Integer id) {
        return passengerService.getPassenger(id);
    }

    @PostMapping
    public Passenger addPassenger(@RequestBody Passenger passenger) {
        return passengerService.addPassenger(passenger);
    }
}