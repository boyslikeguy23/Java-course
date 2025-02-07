package org.example.lesson06_part02.dto;

import lombok.*;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CustomerDTO {
    private Long id;
    private String username;
    private String password;
    private String fullName;
    private String address;
    private String phone;
    private String email;
    private Date birthDay;
    private boolean active;
}
