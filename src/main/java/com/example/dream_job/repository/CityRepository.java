package com.example.dream_job.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.dream_job.model.City;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;
@Repository
public interface CityRepository extends JpaRepository<City, Integer>{

}
