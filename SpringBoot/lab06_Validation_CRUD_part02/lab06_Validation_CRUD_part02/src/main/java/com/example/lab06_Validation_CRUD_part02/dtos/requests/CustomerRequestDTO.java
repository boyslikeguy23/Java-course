package com.example.lab06_Validation_CRUD_part02.dtos.requests;


import lombok.*;

import java.time.LocalDate;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerRequestDTO {

    private Long id;

    @NotBlank(message = "Username cannot be null")
    @Size(min = 6, message = "Username must be at least 6 characters")
    private String username;

    @NotBlank(message = "Password cannot be null")
    @Size(min = 6, message = "Password must be at least 6 characters")
    private String password;

    @NotBlank(message = "Full name cannot be null")
    @Size(min = 3, message = "Full name must be at least 3 characters")
    private String fullName;

    @NotBlank(message = "Address cannot be null")
    @Size(min = 5, message = "Address must be at least 5 characters")
    private String address;

    @Pattern(regexp = "^\\+?[0-9]{10,15}$", message = "Phone must contain number characters in 10 - 15 length")
    @NotBlank(message = "Phone cannot be null")
    @Size(min = 10, max = 15, message = "Phone must be between 10 and 15 characters")
    private String phone;

    @NotBlank(message = "Email cannot be null")
    @Email(message = "Email not valid")
    private String email;

    @NotNull(message = "Birth day cannot be null")
    private LocalDate birthDay;

    private boolean active;
}
