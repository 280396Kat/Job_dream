package com.example.dream_job.repository;

import com.example.dream_job.model.City;

import java.util.Collection;

public interface CityRepository {

    Collection<City> findAll();
}
