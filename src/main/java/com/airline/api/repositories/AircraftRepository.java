// This is the repository class for the Aircraft entity. This class is used to interact with the database.

package com.airline.api.repositories;

import com.airline.api.models.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AircraftRepository extends JpaRepository<Aircraft, Integer> {
}
