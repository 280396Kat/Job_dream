package com.example.dream_job.dto;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@Data
public class FileDto {

    private String name;

    private byte[] content;
}
