package com.example.dream_job.dao;

import com.example.dream_job.model.City;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Component
public class MemoryCityRepositoryImpl implements MemoryCity {

    private final Map<Integer, City> cities = new HashMap<>() {
        {
            put(1, new City());
            put(2, new City());
            put(3, new City());
        }
    };

    @Override
    public Collection<City> findAll() {
        return cities.values();
    }

}
