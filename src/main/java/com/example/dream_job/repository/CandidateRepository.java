package com.example.dream_job.repository;

import com.example.dream_job.model.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event;

import java.util.Collection;
import java.util.Optional;
@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Integer> {

}
