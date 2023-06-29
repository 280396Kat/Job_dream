package com.example.dream_job.repository;

import com.example.dream_job.model.File;

import java.util.Optional;

public interface FileRepository {

    File save(File file);

    Optional<File> findById(int id);

    boolean deleteById(int id);
}
