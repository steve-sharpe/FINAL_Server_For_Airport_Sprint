package com.airline.api.services;

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
        City existingCity = cityRepository.findById(id).orElse(null);
        if (existingCity != null) {
            existingCity.setName(city.getName());
            existingCity.setState(city.getState());
            existingCity.setPopulation(city.getPopulation());
            return cityRepository.save(existingCity);
        }
        return null;
    }

    public void deleteCity(Long id) {
        cityRepository.deleteById(id);
    }

    public City getCityWithAirports(Long cityId) {
        return cityRepository.findCityWithAirports(cityId);
    }

    public City getCityWithPassengers(Long cityId) {
        return cityRepository.findCityWithPassengers(cityId);
    }

    public City getCityWithAirportsAndPassengers(Long cityId) {
        return cityRepository.findCityWithAirportsAndPassengers(cityId);
    }
}