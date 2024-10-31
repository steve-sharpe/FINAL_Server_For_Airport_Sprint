// this is the repository interface for the Airport entity

package com.airline.api.repositories;

import com.airline.api.models.Airport;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Integer> {
}
