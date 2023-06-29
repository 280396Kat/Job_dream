package com.example.dream_job.service;

import com.example.dream_job.model.City;
import com.example.dream_job.repository.CityRepository;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class SimpleCityService implements CityService {

    private final CityRepository cityRepository;

    public SimpleCityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public Collection<City> findAll() {
        return cityRepository.findAll();
    }
}
