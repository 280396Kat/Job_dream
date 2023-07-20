package com.example.dream_job.dao;

import com.example.dream_job.model.Candidate;

import java.util.Collection;
import java.util.Optional;

public interface MemoryCandidate {

    Candidate save(Candidate candidate);

    boolean deleteById(int id);

    boolean update(Candidate candidate);

    Optional<Candidate> findById(int id);

    Collection<Candidate> findAll();
}
