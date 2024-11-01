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
    public Aircraft getAircraftById(@PathVariable Long id) {
        return aircraftRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Aircraft addAircraft(@RequestBody Aircraft aircraft) {
        return aircraftRepository.save(aircraft);
    }

    @PutMapping("/{id}")
    public Aircraft updateAircraft(@PathVariable Long id, @RequestBody Aircraft aircraft) {
        aircraft.setId(id);
        return aircraftRepository.save(aircraft);
    }

    @DeleteMapping("/{id}")
    public void deleteAircraft(@PathVariable Long id) {
        aircraftRepository.deleteById(id);
    }
}