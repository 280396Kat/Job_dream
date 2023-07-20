package com.example.dream_job.repository;

import com.example.dream_job.model.Vacancy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;
@Repository
public interface VacancyRepository extends JpaRepository<Vacancy, Integer>{

}
