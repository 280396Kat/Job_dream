package com.example.dream_job.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class File {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String path;

    @OneToMany(mappedBy = "file")
    private List<Vacancy> vacancies;

    public File(String name, String path) {
        this.name = name;
        this.path = path;
    }
}
