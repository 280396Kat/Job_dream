package com.example.dream_job.dao;

import com.example.dream_job.model.File;

import java.util.Optional;

public interface MemoryFile {

    File save(File file);

    Optional<File> findById(int id);

    boolean deleteById(int id);
}
