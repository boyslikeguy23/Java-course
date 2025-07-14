package org.example.lesson04.dto;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
    @Size(min = 3, max = 25, message = "Full name must be between 3 and 25 characters")
    private String fullName;
    @Min(value = 18, message = "Age must be at least 18 years old")
    @Max(value = 60, message = "Age must be at most 60 years old")
    private int age;
    @Min(value = 0, message = "Salary must be at least 0")
    private int salary;
}
