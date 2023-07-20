package com.example.dream_job.dao;

import com.example.dream_job.model.Vacancy;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class MemoryVacancyRepositoryImpl implements MemoryVacancy {

    private int nextId = 1;

    private final Map<Integer, Vacancy> vacancies = new HashMap<>();

    private MemoryVacancyRepositoryImpl() {
        save(new Vacancy());
        save(new Vacancy());
        save(new Vacancy());
        save(new Vacancy());
        save(new Vacancy());
        save(new Vacancy());
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
                        vacancy.getCreationDate(), vacancy.isVisible(), vacancy.getCity(), oldVacancy.getFile())) != null;
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
