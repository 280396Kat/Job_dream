package com.example.dream_job.service;

import com.example.dream_job.model.City;
import com.example.dream_job.dao.MemoryCity;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class SimpleCityService implements CityService {

    private final MemoryCity cityRepository;

    public SimpleCityService(MemoryCity cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public Collection<City> findAll() {
        return cityRepository.findAll();
    }
}
