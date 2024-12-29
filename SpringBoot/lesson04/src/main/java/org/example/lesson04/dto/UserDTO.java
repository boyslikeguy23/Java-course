package org.example.lesson04.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.time.LocalDate;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserDTO {
    @NotBlank(message = "Username cannot be blank")
    @Size(min = 3, max = 20, message = "Username must be between 3 and 20 characters")
    @Column(unique = true, nullable = false)
    String username;

    @NotBlank(message = "Password cannot be blank")
    @Size(min = 8, max = 30, message = "Password must be between 9 and 30 characters")
    @Pattern(regexp = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,30}", message = "Password must contain at least one letter and one number")
    String password;

    @NotBlank(message = "Full name cannot be blank")
    @Size(min =2, max = 50, message = "Full name must be between 2 and 50 characters")
    String fullName;

    @Past(message = "Birthday must be in the past")
    LocalDate birthday;

    @Email(message = "Email should be valid")
    @NotBlank(message = "Email cannot be blank")
    @Column(unique = true)
    String email;

    @Pattern(regexp = "^\\+?[0-9. ()-]{7,25}$", message = "Phone number is invalid")
    @NotBlank(message = "Phone number cannot be blank")
    String phone;

    @Min(value = 18, message = "Age must be at least 18")
    @Max(value = 100, message = "Age must be less than or equal to 100")
    int age;

    @NotNull(message = "Status cannot be null")
    Boolean status;

//    public UserDTO() {
//    }
//
//    public UserDTO(String username, String password, String fullName, LocalDate birthday, String email, String phone, int age, Boolean status) {
//        this.username = username;
//        this.password = password;
//        this.fullName = fullName;
//        this.birthday = birthday;
//        this.email = email;
//        this.phone = phone;
//        this.age = age;
//        this.status = status;
//    }
//
//    public @NotBlank(message = "Username cannot be blank") @Size(min = 3, max = 20, message = "Username must be between 3 and 20 characters") String getUsername() {
//        return username;
//    }
//
//    public void setUsername(@NotBlank(message = "Username cannot be blank") @Size(min = 3, max = 20, message = "Username must be between 3 and 20 characters") String username) {
//        this.username = username;
//    }
//
//    public @NotBlank(message = "Password cannot be blank") @Size(min = 8, max = 30, message = "Password must be between 9 and 30 characters") @Pattern(regexp = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,30}", message = "Password must contain at least one letter and one number") String getPassword() {
//        return password;
//    }
//
//    public void setPassword(@NotBlank(message = "Password cannot be blank") @Size(min = 8, max = 30, message = "Password must be between 9 and 30 characters") @Pattern(regexp = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,30}", message = "Password must contain at least one letter and one number") String password) {
//        this.password = password;
//    }
//
//    public @NotBlank(message = "Full name cannot be blank") @Size(min = 2, max = 50, message = "Full name must be between 2 and 50 characters") String getFullName() {
//        return fullName;
//    }
//
//    public void setFullName(@NotBlank(message = "Full name cannot be blank") @Size(min = 2, max = 50, message = "Full name must be between 2 and 50 characters") String fullName) {
//        this.fullName = fullName;
//    }
//
//    public @Past(message = "Birthday must be in the past") LocalDate getBirthday() {
//        return birthday;
//    }
//
//    public void setBirthday(@Past(message = "Birthday must be in the past") LocalDate birthday) {
//        this.birthday = birthday;
//    }
//
//    public @Email(message = "Email should be valid") @NotBlank(message = "Email cannot be blank") String getEmail() {
//        return email;
//    }
//
//    public void setEmail(@Email(message = "Email should be valid") @NotBlank(message = "Email cannot be blank") String email) {
//        this.email = email;
//    }
//
//    public @Pattern(regexp = "^\\+?[0-9. ()-]{7,25}$", message = "Phone number is invalid") @NotBlank(message = "Phone number cannot be blank") String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(@Pattern(regexp = "^\\+?[0-9. ()-]{7,25}$", message = "Phone number is invalid") @NotBlank(message = "Phone number cannot be blank") String phone) {
//        this.phone = phone;
//    }
//
//    @Min(value = 18, message = "Age must be at least 18")
//    @Max(value = 100, message = "Age must be less than or equal to 100")
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(@Min(value = 18, message = "Age must be at least 18") @Max(value = 100, message = "Age must be less than or equal to 100") int age) {
//        this.age = age;
//    }
//
//    public @NotNull(message = "Status cannot be null") Boolean getStatus() {
//        return status;
//    }
//
//    public void setStatus(@NotNull(message = "Status cannot be null") Boolean status) {
//        this.status = status;
//    }
}
