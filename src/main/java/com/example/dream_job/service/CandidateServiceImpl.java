package com.example.dream_job.service;

import com.example.dream_job.model.Candidate;
import com.example.dream_job.repository.CandidateRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class CandidateServiceImpl implements CandidateService{

    private final CandidateRepository candidateRepository;

    public CandidateServiceImpl(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    @Override
    public Candidate save(Candidate candidate) {
        return candidateRepository.save(candidate);
    }

    @Override
    public boolean deleteById(int id) {
        Optional<Candidate> getCandidate = candidateRepository.findById(id);
        if (getCandidate.isEmpty()) {
            return false;
        }
        Candidate candidate = getCandidate.get();
        candidateRepository.delete(candidate);
        return true;
    }

    @Override
    public boolean update(Candidate candidate) {
        Optional<Candidate> optionalCandidate = candidateRepository.findById(candidate.getId());
        if (optionalCandidate.isEmpty()) {
            return false;
        }
        Candidate getCandidate = optionalCandidate.get();
        getCandidate.setCity(candidate.getCity());
        getCandidate.setName(candidate.getName());
        getCandidate.setDescription(candidate.getDescription());
        return true;
    }

    @Override
    public Optional<Candidate> findById(int id) {
        return candidateRepository.findById(id);
    }

    @Override
    public Collection<Candidate> findAll() {
        return candidateRepository.findAll();
    }

}
