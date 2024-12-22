package com.example.devmaster.lesson4.service;

import com.example.devmaster.lesson4.dto.UsersDTO;
import com.example.devmaster.lesson4.entity.User;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class UsersService {
    List<User> userList = new ArrayList<>();

    public UsersService(){
        userList.add(new User(1L, "user1", "pass1", "John Doe", LocalDate.parse("1990-01-01"), "john@example.com", "1234567890", 34, true));
        userList.add(new User(2L, "user2", "pass2", "Jane Smith", LocalDate.parse("1992-05-15"), "jane@example.com", "0987654321", 32, false));
        userList.add(new User(3L, "user3", "pass3", "Alice Johnson", LocalDate.parse("1985-11-22"), "alice@example.com", "1122334455", 39, true));
        userList.add(new User(4L, "user4", "pass4", "Bob Brown", LocalDate.parse("1988-03-18"), "bob@example.com", "6677889900", 36, true));
        userList.add(new User(5L, "user5", "pass5", "Charlie White", LocalDate.parse("1995-09-30"), "charlie@example.com", "4433221100", 29, false));
    }

    public List<User> findAll(){
        return userList;
    }
    public Boolean create(UsersDTO usersDTO){
        try{
            User user = new User();
            user.setId(userList.stream().count()+1);
            user.setUsername(usersDTO.getUsername());
            user.setPassword(usersDTO.getPassword());
            user.setEmail(usersDTO.getEmail());
            user.setPassword(usersDTO.getPassword());
            user.setFullName(usersDTO.getFullName());
            user.setPhone(usersDTO.getPhone());
            user.setAge(usersDTO.getAge());
            user.setBirthDay(usersDTO.getBirthDay());
            user.setStatus(usersDTO.getStatus());
            userList.add(user);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
