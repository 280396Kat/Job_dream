package com.example.dream_job.repository;

import com.example.dream_job.model.Candidate;
import com.example.dream_job.model.Vacancy;

import java.util.Collection;
import java.util.Optional;

public interface CandidateRepository {

    Candidate save(Candidate candidate);

    boolean deleteById(int id);

    boolean update(Candidate candidate);

    Optional<Candidate> findById(int id);

    Collection<Candidate> findAll();
}
