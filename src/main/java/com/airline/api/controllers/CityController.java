package com.airline.api.controllers;

import com.airline.api.models.Airport;
import com.airline.api.models.City;
import com.airline.api.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping
    public List<City> getCities() {
        return cityService.getAllCities();
    }

    @GetMapping("/{id}")
    public City getCity(@PathVariable Long id) {
        return cityService.getCityById(id);
    }

    @PostMapping
    public City addCity(@RequestBody City city) {
        return cityService.addCity(city);
    }

    @PutMapping("/{id}")
    public City updateCity(@PathVariable Long id, @RequestBody City city) {
        return cityService.updateCity(id, city);
    }

    @DeleteMapping("/{id}")
    public void deleteCity(@PathVariable Long id) {
        cityService.deleteCity(id);
    }

    @GetMapping("/airport/{airportId}")
    public City getCityByAirportId(@PathVariable Long airportId) {
        return cityService.getCityByAirportId(airportId);
    }

    @GetMapping("/{id}/airports")
    public List<Airport> getAirportsByCityId(@PathVariable Long id) {
        return cityService.getAirportsByCityId(id);
    }
}