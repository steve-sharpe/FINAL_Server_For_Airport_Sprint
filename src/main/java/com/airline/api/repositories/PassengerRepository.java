// this is the repository for the passenger entity

package com.airline.api.repositories;

import com.airline.api.models.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}
