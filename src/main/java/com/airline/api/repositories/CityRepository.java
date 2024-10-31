// this is the repository interface for the city entity

package com.airline.api.repositories;

import com.airline.api.models.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
}
