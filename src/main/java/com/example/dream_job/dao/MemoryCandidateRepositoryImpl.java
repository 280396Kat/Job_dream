package com.example.dream_job.dao;

import com.example.dream_job.model.Candidate;
import com.example.dream_job.model.City;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static java.time.LocalDateTime.now;

@Component
public class MemoryCandidateRepositoryImpl implements MemoryCandidate {

    private int nextId = 1;

    private final Map<Integer, Candidate> candidates = new HashMap<>();

    public MemoryCandidateRepositoryImpl() {
        save(new Candidate(0, "Semen", "Java junior developer", now(), new City()));
        save(new Candidate(0, "Petr", "Java junior developer", now(), new City()));
        save(new Candidate(0, "Vladimir", "Java middle developer", now(), new City()));
        save(new Candidate(0, "Timur", "Java senior developer", now(), new City()));
    }

    @Override
    public Candidate save(Candidate candidate) {
        candidate.setId(nextId++);
        candidates.put(candidate.getId(), candidate);
        return candidate;
    }

    @Override
    public boolean deleteById(int id) {
        return candidates.remove(id) != null;
    }

    @Override
    public boolean update(Candidate candidate) {
        if (candidates.computeIfPresent(candidate.getId(), (id, oldCandidate) ->
                new Candidate(oldCandidate.getId(), candidate.getName(), candidate.getDescription(),
                        candidate.getCreationDate(), candidate.getCity())) != null) return true;
        else return false;
    }

    @Override
    public Optional<Candidate> findById(int id) {
        return Optional.ofNullable(candidates.get(id));
    }

    @Override
    public Collection<Candidate> findAll() {
        return candidates.values();
    }
}
