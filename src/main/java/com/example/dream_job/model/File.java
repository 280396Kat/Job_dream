package com.example.dream_job.model;

import lombok.*;

@Getter
@Setter
@Data
public class File {

    private int id;

    private String name;

    private String path;

    public File(String name, String path) {
        this.name = name;
        this.path = path;
    }
}
