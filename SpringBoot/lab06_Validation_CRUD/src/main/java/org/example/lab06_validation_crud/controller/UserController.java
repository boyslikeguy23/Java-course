package org.example.lab06_validation_crud.controller;

import org.example.lab06_validation_crud.entity.User;
import org.example.lab06_validation_crud.repository.UserRepository;
import org.example.lab06_validation_crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping
    public String getUsers(Model model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "user/list";
    }
    @GetMapping("/new")
    public String createUserForm(Model model) {
        User user = new User();
        user.setIsActive(true);
        model.addAttribute("user", user);
        return "user/form";
    }

    @PostMapping("/save")
    public String saveUser(@Validated @ModelAttribute("user") User user, BindingResult result, Model model) {
        if (userService.existsByUsername(user.getUsername()) && user.getId()==null) {
            result.rejectValue("userName", "error.user", "Username already exists");
            return "user/form"; //Quay lai form neu co loi
        }
        if (result.hasErrors()) {
            return "user/form";
        }
        userService.saveUser(user);
        return "redirect:/users";
    }

    @GetMapping("/edit/{id}")
    public String editUserForm(@PathVariable("id") Long id, Model model) throws IllegalAccessException {
        User user = userService.getUserById(id).orElseThrow(() -> new IllegalAccessException("Invalid user Id: " + id));
        model.addAttribute("user", user);
        return "user/form";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
        return "redirect:/users";
    }
}
