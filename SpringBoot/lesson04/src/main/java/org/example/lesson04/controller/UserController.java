package org.example.lesson04.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.lesson04.dto.UserDTO;
import org.example.lesson04.entity.User;
import org.example.lesson04.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@AllArgsConstructor
@NoArgsConstructor
public class UserController {
    @Autowired
    public UserService userService;

    @GetMapping("/user-list")
    public List<User> getAllUsers() {
        return userService.getUserList();
    }

    @PostMapping("/user-add")
    public ResponseEntity<String> addUser(@Valid @RequestBody UserDTO userDTO) {
        userService.create(userDTO);
        return ResponseEntity.badRequest().body("User created successfully!");
    }
}
