package com.example.dream_job.repository;

import com.example.dream_job.model.Vacancy;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class MemoryVacancyRepository implements VacancyRepository {

    private int nextId = 1;

    private final Map<Integer, Vacancy> vacancies = new HashMap<>();

    private MemoryVacancyRepository() {
        save(new Vacancy(0, "Intern Java Developer", "description1", LocalDateTime.now(), true, 1, 0));
        save(new Vacancy(0, "Junior Java Developer", "description1", LocalDateTime.now(), true, 1, 0));
        save(new Vacancy(0, "Junior+ Java Developer", "description2", LocalDateTime.now(), false, 2, 0));
        save(new Vacancy(0, "Middle Java Developer", "description3", LocalDateTime.now(), true, 3, 0));
        save(new Vacancy(0, "Middle+ Java Developer", "description4", LocalDateTime.now(), false, 2, 0));
        save(new Vacancy(0, "Senior Java Developer", "description5", LocalDateTime.now(), true, 3, 0));
    }

    @Override
    public Vacancy save(Vacancy vacancy) {
        vacancy.setId(nextId++);
        vacancies.put(vacancy.getId(), vacancy);
        return vacancy;
    }

    @Override
    public boolean deleteById(int id) {
        return vacancies.remove(id) != null;
    }

    @Override
    public boolean update(Vacancy vacancy) {
        return vacancies.computeIfPresent(vacancy.getId(), (id, oldVacancy) ->
                new Vacancy(oldVacancy.getId(), vacancy.getTitle(), vacancy.getDescription(),
                        vacancy.getCreationDate(), vacancy.isVisible(), vacancy.getCityId(), oldVacancy.getFileId())) != null;
    }

    @Override
    public Optional<Vacancy> findById(int id) {
        return Optional.ofNullable(vacancies.get(id));
    }

    @Override
    public Collection<Vacancy> findAll() {
        return vacancies.values();
    }
}
