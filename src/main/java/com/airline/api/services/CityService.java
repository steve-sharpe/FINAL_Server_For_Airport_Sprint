// this is the service class for the city entity

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

    public City getCityById(Integer id) {
        return cityRepository.findById(id).orElse(null);
    }

    public City createCity(City city) {
        return cityRepository.save(city);
    }

    public City updateCity(Integer id, City city) {
        City existingCity = cityRepository.findById(id).orElse(null);
        if (existingCity == null) {
            return null;
        }
        existingCity.setName(city.getName());
        existingCity.setState(city.getState());
        existingCity.setPopulation(city.getPopulation());
        return cityRepository.save(existingCity);
    }

    public void deleteCity(Integer id) {
        cityRepository.deleteById(id);
    }
}