package org.example.lab06_validation_crud.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name cannot be null")
    @Size(min = 3, message = "Name must be at least 3 characters")
    @Column(name = "full_name", nullable = false)
    private String fullName;

    @NotBlank(message = "Username cannot be null")
    @Size(min = 6, message = "Username must be at least 6 characters")
    @Column(unique = true, nullable = false)
    private String username;

    @NotBlank(message = "password cannot be null")
    @Size(min = 6, message = "password must be at least 6 characters")
    private String password;

    @NotBlank(message = "Email cannot be null")
    @Email(message = "Email not invalid")
    private String email;

    @Pattern(regexp="^\\+?[0-9]{10,15}$", message = "Phone must contain number characters in 10 - 15 length")
    private String phone;
    private String address;
    private Boolean isActive;
}
