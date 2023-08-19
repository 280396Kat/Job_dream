package com.example.dream_job.repository;

import com.example.dream_job.model.City;
import com.example.dream_job.model.File;
import org.hibernate.annotations.Parameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface FileRepository extends JpaRepository<File, Integer> {
    @Query("insert into File(path) values(?1)")
    String savePath(@Param("path") String path);
}
