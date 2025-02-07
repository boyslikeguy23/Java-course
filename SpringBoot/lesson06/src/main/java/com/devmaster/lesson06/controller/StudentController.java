package com.devmaster.lesson06.controller;

import com.devmaster.lesson06.dto.StudentDTO;
import com.devmaster.lesson06.entity.Student;
import com.devmaster.lesson06.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {
    @Autowired
    public StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping
    public String getAllStudents(Model model) {
        List<Student> students = studentService.findAll();
        model.addAttribute("students", students);
        return "students/list";
    }
    @GetMapping("/add-new")
    public String addNewStudent(Model model) {
        model.addAttribute("student", new Student());
        return "students/create";
    }
    @PostMapping("/add-new")
    public String saveNewStudent(@ModelAttribute("student") StudentDTO student) {
        studentService.save(student);
        return "redirect:/students";
    }
    @GetMapping("/view/{id}")
    public String viewStudent(@PathVariable(value = "id") Long id, Model model) {
        Student student = studentService.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid student id " + id));
        model.addAttribute("student", student);
        return "students/view";
    }
    @GetMapping("/edit/{id}")
    public String editStudent(@PathVariable (value = "id") Long id, Model model) {
        Student student = studentService.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid student Id: " + id));
        model.addAttribute("student", student);
        return "students/edit";
    }
    @PutMapping("/update/{id}")
    public String updateStudent(@PathVariable (value = "id") Long id, @ModelAttribute("student") StudentDTO student) {
        studentService.updateStudentById(id, student);
        return "redirect:/students";
    }
    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable (value = "id") Long id) {
        studentService.deleteStudentById(id);
        return "redirect:/students";
    }
}
