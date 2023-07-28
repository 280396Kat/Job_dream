package com.example.dream_job.service;

import com.example.dream_job.dao.MemoryCandidate;
import com.example.dream_job.dao.MemoryCandidateRepositoryImpl;
import com.example.dream_job.model.Candidate;
import com.example.dream_job.model.City;
import lombok.Builder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import static java.time.LocalDateTime.now;
import static org.junit.jupiter.api.Assertions.*;


class SimpleCandidateServiceTest {

    private MemoryCandidate memoryCandidate;

    private CandidateService candidateService;

    @BeforeEach
    void init() {
        memoryCandidate = new MemoryCandidateRepositoryImpl();
        candidateService = new SimpleCandidateService(memoryCandidate);
    }

    @Test
    void save() {
        //Arrange
        Candidate expected = Candidate.builder()
                .id(1)
                .name("name")
                .build();
        // Act
        Candidate result = candidateService.save(expected);
        //Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void deleteById() {
        int id = 1;

        boolean result = candidateService.deleteById(id);

        Assertions.assertTrue(result);
    }


    @Test
    void update() {
        Candidate candidate = new Candidate(0, "Ola", "Java junior developer", now(), new City());
        boolean result = candidateService.update(candidate);
        Assertions.assertFalse(result);
    }

    @Test
    void findById() {
            Candidate expected = Candidate.builder()
                    .id(1)
                    .name("name")
                    .build();
            Candidate  candidateSave = candidateService.save(expected);
            Optional<Candidate> result = candidateService.findById(candidateSave.getId());
            Assertions.assertFalse(result.isEmpty());
        }


    @Test
    void findAll() {
        List<Candidate> expected = List.of(
        new Candidate(0, "Semen", "Java junior developer", now(), new City()),
        new Candidate(0, "Petr", "Java junior developer", now(), new City()),
        new Candidate(0, "Vladimir", "Java middle developer", now(), new City()),
        new Candidate(0, "Timur", "Java senior developer", now(), new City())
        );

        Collection<Candidate> result = candidateService.findAll();

        Assertions.assertNotNull(result);
        Assertions.assertEquals(expected.size(), result.size());
    }
}