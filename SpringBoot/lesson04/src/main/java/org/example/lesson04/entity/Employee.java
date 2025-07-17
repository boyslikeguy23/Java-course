package org.example.lesson04.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
    private int id;
    private String fullName;
    private int age;
    private int salary;
}
