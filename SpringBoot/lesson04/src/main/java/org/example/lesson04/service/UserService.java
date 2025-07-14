package org.example.lesson04.service;

import org.example.lesson04.dto.UserDTO;
import org.example.lesson04.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<User> userList = new ArrayList<>();

    public UserService() {
        userList.add(new User(1L, "user1", "pass1", "John Doe123", LocalDate.parse("1991-01-01"), "john1@example.com", "1234567890", 34, true));
        userList.add(new User(2L,"user2", "pass2", "John Doe456", LocalDate.parse("1992-05-15"), "john2@example.com", "10987654321", 32, false));
        userList.add(new User(3L,"user3", "pass3", "John Doe789", LocalDate.parse("1985-11-22"), "john3@example.com", "1122334455", 39, true));
        userList.add(new User(4L,"user4", "pass4", "John Doe12345", LocalDate.parse("1988-03-18"), "john4@example.com", "6677889900", 36, true));
        userList.add(new User(5L,"user5", "pass5", "John Doe67890", LocalDate.parse("1995-09-30"), "john5@example.com", "1111155555", 29, false));
    }

    public List<User> getUserList() {
        return userList;
    }

    public Boolean create(UserDTO userDTO){
        User user = new User();
        user.setId(userList.stream().count()+1);
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        user.setEmail(userDTO.getEmail());
        user.setFullName(userDTO.getFullName());
        user.setPhone(userDTO.getPhone());
        user.setAge(userDTO.getAge());
        user.setBirthDay(userDTO.getBirthday());
        user.setStatus(userDTO.getStatus());
        userList.add(user);
        return true;
    }
}
//
