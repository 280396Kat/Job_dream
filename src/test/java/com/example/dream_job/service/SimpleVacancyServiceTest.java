package com.example.dream_job.service;

import com.example.dream_job.dao.*;
import com.example.dream_job.dto.FileDto;
import com.example.dream_job.model.Candidate;
import com.example.dream_job.model.Vacancy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleVacancyServiceTest {

    private MemoryVacancy memoryVacancy;

    private VacancyService vacancyService;

    private FileService fileService;

    private MemoryFile memoryFile;

    @BeforeEach
//    void init() {
//        memoryFile = new MemoryFileRepositoryImpl();
//        memoryVacancy = new MemoryVacancyRepositoryImpl();
//        fileService = new SimpleFileService(memoryFile, );
//        vacancyService = new SimpleVacancyService(memoryVacancy, fileService);
//    }

    @Test
    void save() {
        Vacancy expected = Vacancy.builder()
                .id(1)
                .title("title")
                .build();
        // Act
        Vacancy result = vacancyService.save(expected, (FileDto) fileService);
        //Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void deleteById() {
        int id = 1;

        boolean result = vacancyService.deleteById(id);

        Assertions.assertTrue(result);
    }

    @Test
    void update() {
    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
    }
}