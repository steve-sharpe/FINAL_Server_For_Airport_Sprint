package com.airline.api.repositories;

import com.airline.api.models.City;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
    @EntityGraph(attributePaths = {"airports"}) // Load airports with city
    City findById(long id);
    @Query("SELECT c FROM City c JOIN FETCH c.airports a WHERE c.id = :cityId")
    City findCityWithAirports(Long cityId);

    @Query("SELECT c FROM City c JOIN FETCH c.passengers p WHERE c.id = :cityId")
    City findCityWithPassengers(Long cityId);

    @Query("SELECT c FROM City c JOIN FETCH c.airports a JOIN FETCH c.passengers p WHERE c.id = :cityId")
    City findCityWithAirportsAndPassengers(Long cityId);
}