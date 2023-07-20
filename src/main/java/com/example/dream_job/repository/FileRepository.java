package com.example.dream_job.repository;

import com.example.dream_job.model.City;
import com.example.dream_job.model.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FileRepository extends JpaRepository<File, Integer> {
}
