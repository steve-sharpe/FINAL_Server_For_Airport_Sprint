package com.airline.api.repositories;

import com.airline.api.models.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AirportRepository extends JpaRepository<Airport, Long> {
    List<Airport> findByCityId(Long cityId);
}
