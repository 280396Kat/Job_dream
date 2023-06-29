package com.example.dream_job.model;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Candidate {

    @EqualsAndHashCode.Include
    private int id;

    private String name;

    private String description;

    private LocalDateTime creationDate = LocalDateTime.now();

    private int cityId;
}
