package com.example.dream_job.service;

import com.example.dream_job.dto.FileDto;
import com.example.dream_job.model.Candidate;
import com.example.dream_job.model.Vacancy;
import com.example.dream_job.repository.VacancyRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class VacancyServiceImpl implements VacancyService{

    private final VacancyRepository vacancyRepository;

    public VacancyServiceImpl(VacancyRepository vacancyRepository) {
        this.vacancyRepository = vacancyRepository;
    }

    @Override
    public Vacancy save(Vacancy vacancy, FileDto image) {
        return vacancyRepository.save(vacancy);
    }

    @Override
    public boolean deleteById(int id) {
        Optional<Vacancy> getVacancy = vacancyRepository.findById(id);
        if (getVacancy.isEmpty()) {
            return false;
        }
        Vacancy vacancy = getVacancy.get();
        vacancyRepository.delete(vacancy);
        return true;
    }

    @Override
    public boolean update(Vacancy vacancy, FileDto image) {
        Optional<Vacancy> optionalVacancy = vacancyRepository.findById(vacancy.getId());
        if (optionalVacancy.isEmpty()) {
            return false;
        }
        Vacancy getVacancy = optionalVacancy.get();
        getVacancy.setCity(vacancy.getCity());
        getVacancy.setFile(vacancy.getFile());
        getVacancy.setDescription(vacancy.getDescription());
        getVacancy.setTitle(vacancy.getTitle());
        return true;
    }

    @Override
    public Optional<Vacancy> findById(int id) {
        return vacancyRepository.findById(id);
    }

    @Override
    public Collection<Vacancy> findAll() {
        return vacancyRepository.findAll();
    }
}
