package com.example.devmaster.lesson4.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UsersDTO {
    @NotBlank(message = "Username cannot be blank")
    @Size(min = 3, max = 20, message = "Username must be between 3 and 20 characters")
    @Column(unique = true, nullable = false)
    String username;

    @NotBlank(message = "Password cannot be blank")
    @Size(min = 8, max = 30, message = "Username must be between 3 and 20 characters")
    @Pattern(regexp = "(?=.*[0-9])(?=.*[a-zA-Z)]).{8,30}", message = "Password must cointain at least one letter and one number")
    String password;

    @NotBlank(message = "Full name cannot be blank")
    @Size(min = 2, max = 50, message = "Fullname must be between 2 and 50 characters")
    String fullName;


    @Past (message = "Birthday must be in the past")
    LocalDate birthDay;

    @Email(message = "Email should be valid")
    @NotBlank(message = "Email cannot be blank")
    @Column(unique = true)
    String email;

    @NotBlank (message = "Phone number cannot be blank")
    @Pattern(regexp = "^\\+?[0-9. ()-]{7,25}$", message = "Phone number is invalid")
    String phone;

    @Min(value = 18, message = "Age must be at least 18")
    @Max(value = 100, message = "Age must be less than or equal to 100")
    private int age;

    @NotNull(message = "Status cannot be null")
    Boolean status;

}
