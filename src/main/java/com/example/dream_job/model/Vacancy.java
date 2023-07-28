package com.example.dream_job.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Builder
public class Vacancy {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private LocalDateTime creationDate = LocalDateTime.now();

    @Column
    private boolean visible;

    @ManyToMany(mappedBy = "vacancies")
    private List<City> city;

    @ManyToOne
    @JoinColumn(name = "vacancy_id")
    private File file;



}
