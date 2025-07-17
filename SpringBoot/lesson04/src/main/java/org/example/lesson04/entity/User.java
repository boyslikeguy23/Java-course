package org.example.lesson04.entity;


import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;


@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    Long id;

    String username;

    String password;

    String fullName;
    LocalDate birthDay;

    String email;

    String phone;

    int age;

    Boolean status;


}
