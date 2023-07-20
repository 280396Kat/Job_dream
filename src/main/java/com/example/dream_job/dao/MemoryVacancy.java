package com.example.dream_job.dao;

import com.example.dream_job.model.Vacancy;

import java.util.Collection;
import java.util.Optional;

public interface MemoryVacancy {

    Vacancy save(Vacancy vacancy);

    boolean deleteById(int id);

    boolean update(Vacancy vacancy);

    Optional<Vacancy> findById(int id);

    Collection<Vacancy> findAll();
}
