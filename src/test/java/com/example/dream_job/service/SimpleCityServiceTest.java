package com.example.dream_job.service;

import com.example.dream_job.dao.MemoryCity;
import com.example.dream_job.dao.MemoryCityRepositoryImpl;
import com.example.dream_job.model.Candidate;
import com.example.dream_job.model.City;
import com.example.dream_job.model.Vacancy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCityServiceTest {

    private MemoryCity memoryCity;

    private CityService cityService;

    @Test
    void findAll() {
        memoryCity = new MemoryCityRepositoryImpl();
        cityService = new SimpleCityService(memoryCity);

        List<City> expected = List.of(
                new City(),
                new City(),
                new City()
        );
        Collection<City> result = cityService.findAll();

        Assertions.assertNotNull(result);
        Assertions.assertEquals(expected.size(), result.size());
    }
}