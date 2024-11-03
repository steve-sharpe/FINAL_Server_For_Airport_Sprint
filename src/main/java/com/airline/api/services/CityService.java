package com.airline.api.services;

import com.airline.api.models.Airport;
import com.airline.api.models.City;
import com.airline.api.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public List<City> getAllCities() {
        return cityRepository.findAll();
    }

    public City getCityById(Long id) {
        return cityRepository.findById(id).orElse(null);
    }

    public City addCity(City city) {
        return cityRepository.save(city);
    }

    public City updateCity(Long id, City city) {
        city.setId(id);
        return cityRepository.save(city);
    }

    public void deleteCity(Long id) {
        cityRepository.deleteById(id);
    }

    public City getCityByAirportId(Long airportId) {
        // Implement this method based on your requirements
        return null;
    }

    public List<Airport> getAirportsByCityId(Long id) {
        City city = cityRepository.findById(id).orElse(null);
        return city != null ? city.getAirports() : null;
    }
}