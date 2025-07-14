package org.example.lesson04.entity;

import jakarta.validation.constraints.Size;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Khoa {
    private String Makh;
    private String Tenkh;
}
