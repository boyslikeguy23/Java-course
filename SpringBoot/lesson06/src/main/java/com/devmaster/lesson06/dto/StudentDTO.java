package com.devmaster.lesson06.dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class StudentDTO {
    private Long id;
    private String name;
    private String email;
    private int age;
}
