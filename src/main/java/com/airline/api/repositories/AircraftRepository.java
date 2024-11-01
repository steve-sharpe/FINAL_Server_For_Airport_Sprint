package com.airline.api.repositories;

import com.airline.api.models.Aircraft;
import com.airline.api.models.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AircraftRepository extends JpaRepository<Aircraft, Long> {

}