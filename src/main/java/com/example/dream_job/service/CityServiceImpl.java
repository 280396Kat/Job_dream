package com.example.dream_job.service;

import com.example.dream_job.dto.FileDto;
import com.example.dream_job.model.City;
import com.example.dream_job.model.Vacancy;
import com.example.dream_job.repository.CityRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class CityServiceImpl implements CityService{

    private final CityRepository cityRepository;

    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public Collection<City> findAll() {
        return cityRepository.findAll();
    }

    public boolean update(City city) {
        Optional<City> optionalCity = cityRepository.findById(city.getId());
        if (optionalCity.isEmpty()) {
            return false;
        }
        City getCity = optionalCity.get();
        getCity.setName(city.getName());
        return true;
    }
}
