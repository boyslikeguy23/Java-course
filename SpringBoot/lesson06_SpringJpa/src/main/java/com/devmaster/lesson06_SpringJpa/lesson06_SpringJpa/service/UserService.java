package com.devmaster.lesson06_SpringJpa.lesson06_SpringJpa.service;

import com.devmaster.lesson06_SpringJpa.lesson06_SpringJpa.entity.User;
import com.devmaster.lesson06_SpringJpa.lesson06_SpringJpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
//     public UserService(UserRepository userRepository) {
//         this.userRepository = userRepository;
//     }

     public User createUser(User user) {
         return userRepository.save(user);
     }
     public List<User> getAllUsers() {
         return userRepository.findAll();
     }
     public User updateUser(User user) {
         return userRepository.save(user);
     }
     public void deleteUser(Long id) {
         userRepository.deleteById(id);
     }
}
