// This is the controller class for the Aircraft entity. It is responsible for handling HTTP requests and responses.
// It is also responsible for handling the business logic of the application.

package com.airline.api.controllers;

import com.airline.api.models.Aircraft;
import com.airline.api.repositories.AircraftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aircraft")
public class AircraftController {

    @Autowired
    private AircraftRepository aircraftRepository;

    @GetMapping
    public List<Aircraft> getAllAircraft() {
        return aircraftRepository.findAll();
    }

    @GetMapping("/{id}")
    public Aircraft getAircraftById(@PathVariable int id) {
        return aircraftRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Aircraft addAircraft(@RequestBody Aircraft aircraft) {
        return aircraftRepository.save(aircraft);
    }

    @PutMapping("/{id}")
    public Aircraft updateAircraft(@PathVariable int id, @RequestBody Aircraft aircraft) {
        aircraft.setId(id);
        return aircraftRepository.save(aircraft);
    }

    @DeleteMapping("/{id}")
    public void deleteAircraft(@PathVariable int id) {
        aircraftRepository.deleteById(id);
    }
}
