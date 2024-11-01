package com.airline.api.services;

import com.airline.api.models.Aircraft;
import com.airline.api.repositories.AircraftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AircraftService {
    private final AircraftRepository aircraftRepository;

    @Autowired
    public AircraftService(AircraftRepository aircraftRepository) {
        this.aircraftRepository = aircraftRepository;
    }

    public List<Aircraft> getAircraft() {
        return aircraftRepository.findAll();
    }

    public Aircraft getAircraftById(Long id) {
        return aircraftRepository.findById(id).orElse(null);
    }

    public Aircraft addAircraft(Aircraft aircraft) {
        return aircraftRepository.save(aircraft);
    }

    public Aircraft updateAircraft(Aircraft aircraft) {
        return aircraftRepository.save(aircraft);
    }

    public void deleteAircraft(Long id) {
        aircraftRepository.deleteById(id);
    }
}