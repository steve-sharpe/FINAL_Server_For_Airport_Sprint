// this is the controller class for the city entity

package com.airline.api.controllers;

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
    public City getCity(@PathVariable Integer id) {
        return cityService.getCityById(id);
    }

    @PostMapping
    public City addCity(@RequestBody City city) {
        return cityService.createCity(city);
    }

    @PutMapping("/{id}")
    public City updateCity(@PathVariable Integer id, @RequestBody City city) {
        return cityService.updateCity(id, city);
    }

    @DeleteMapping("/{id}")
    public void deleteCity(@PathVariable Integer id) {
        cityService.deleteCity(id);
    }
}
