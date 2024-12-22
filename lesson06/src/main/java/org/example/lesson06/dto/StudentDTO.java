package org.example.lesson06.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentDTO {
     Long id;
     String name;
     String email;
     int age;
}
