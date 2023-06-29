package com.example.dream_job.model;

import lombok.*;

@AllArgsConstructor
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class City {

    private final int id;

    private final String name;

}
