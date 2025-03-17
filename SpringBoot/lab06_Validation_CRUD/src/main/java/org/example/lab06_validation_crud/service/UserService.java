package org.example.lab06_validation_crud.service;

import jakarta.transaction.Transactional;
import org.example.lab06_validation_crud.entity.User;
import org.example.lab06_validation_crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Transactional
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Transactional
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    @Transactional
    public User saveUser(User user) {
        if (user.getId() == null) {
            return userRepository.save(user);
        }
        User user1 = userRepository.findById(user.getId()).get();
        user1.setId(user1.getId());
        user1.setFullName(user.getFullName());
        user1.setPassword(user.getFullName());
        user1.setEmail(user.getEmail());
        user1.setAddress(user.getAddress());
        user1.setPhone(user.getPhone());
        user1.setIsActive(user.getIsActive());
        return userRepository.save(user1);
    }

    @Transactional
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public Boolean existsUserById(Long id) {
        return userRepository.existsById(id);
    }
    public Boolean existsByUsername(String username) {
        return userRepository.existsByUsername(username);
    }
}
