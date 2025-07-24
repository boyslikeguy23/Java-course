package com.example.lab06_Validation_CRUD_part02.dtos.requests;


import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerRequestDTO {

    private Long id;

    private String username;

    private String password;

    private String fullName;

    private String address;

    private String phone;

    private String email;

    private LocalDate birthDay;

    private boolean active;
}
