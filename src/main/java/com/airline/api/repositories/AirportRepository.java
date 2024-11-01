package com.airline.api.repositories;

import com.airline.api.models.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepository extends JpaRepository<Airport, Long> {

}
