package com.example.dream_job.service;

import com.example.dream_job.dto.FileDto;
import com.example.dream_job.model.File;

import java.util.Optional;

public interface FileService {

    File save(FileDto fileDto);

    Optional<FileDto> getFileById(int id);

    boolean deleteById(int id);
}
