import com.airline.api.models.City;
import com.airline.api.repositories.CityRepository;
import com.airline.api.services.CityService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CityServiceTest {

    @Mock
    private CityRepository cityRepository;

    @InjectMocks
    private CityService cityService;

    private City city;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        city = new City();
        city.setId(1L);
        city.setName("Test City");
        city.setState("Test State");
        city.setPopulation(500000);
    }

    @Test
    void testGetAllCities() {
        List<City> cities = Collections.singletonList(city);
        when(cityRepository.findAll()).thenReturn(cities);

        List<City> result = cityService.getAllCities();
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("Test City", result.get(0).getName());
    }

    @Test
    void testGetCityById_Found() {
        when(cityRepository.findById(1L)).thenReturn(Optional.of(city));

        City result = cityService.getCityById(1L);
        assertNotNull(result);
        assertEquals("Test City", result.getName());
    }

    @Test
    void testGetCityById_NotFound() {
        when(cityRepository.findById(1L)).thenReturn(Optional.empty());

        City result = cityService.getCityById(1L);
        assertNull(result);
    }

    @Test
    void testAddCity() {
        when(cityRepository.save(city)).thenReturn(city);

        City result = cityService.addCity(city);
        assertNotNull(result);
        assertEquals("Test City", result.getName());
    }

    @Test
    void testUpdateCity_Found() {
        City updatedCity = new City();
        updatedCity.setName("Updated City");
        updatedCity.setState("Updated State");
        updatedCity.setPopulation(600000);

        when(cityRepository.findById(1L)).thenReturn(Optional.of(city));
        when(cityRepository.save(city)).thenReturn(city);

        City result = cityService.updateCity(1L, updatedCity);
        assertNotNull(result);
        assertEquals("Updated City", result.getName());
        assertEquals("Updated State", result.getState());
        assertEquals(600000, result.getPopulation());
    }

    @Test
    void testUpdateCity_NotFound() {
        City updatedCity = new City();
        updatedCity.setName("Updated City");

        when(cityRepository.findById(1L)).thenReturn(Optional.empty());

        City result = cityService.updateCity(1L, updatedCity);
        assertNull(result);
    }

    @Test
    void testDeleteCity() {
        doNothing().when(cityRepository).deleteById(1L);

        cityService.deleteCity(1L);
        verify(cityRepository, times(1)).deleteById(1L);
    }

    @Test
    void testGetCityWithAirports() {
        when(cityRepository.findCityWithAirports(1L)).thenReturn(city);

        City result = cityService.getCityWithAirports(1L);
        assertNotNull(result);
        assertEquals("Test City", result.getName());
    }

    @Test
    void testGetCityWithPassengers() {
        when(cityRepository.findCityWithPassengers(1L)).thenReturn(city);

        City result = cityService.getCityWithPassengers(1L);
        assertNotNull(result);
        assertEquals("Test City", result.getName());
    }

    @Test
    void testGetCityWithAirportsAndPassengers() {
        when(cityRepository.findCityWithAirportsAndPassengers(1L)).thenReturn(city);

        City result = cityService.getCityWithAirportsAndPassengers(1L);
        assertNotNull(result);
        assertEquals("Test City", result.getName());
    }
}