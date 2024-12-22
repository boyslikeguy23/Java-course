package org.example.lesson06.controller;

import org.example.lesson06.dto.StudentDTO;
import org.example.lesson06.entity.Student;
import org.example.lesson06.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
@Controller
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    //Get all
//    @GetMapping
//    public List<Student> getAllStudents(){
//        return studentService.getAllStudents();
//    }
    @GetMapping
    public String getStudents(Model model) {
        List<Student> students = studentService.findAll();
        model.addAttribute("students", students);
        return "students/list";
    }

    //Create
    @GetMapping("/add-new")
    public String addNewStudent(Model model){
        model.addAttribute("student", new Student());
        return "students/student-add";
    }

    @GetMapping("/edit/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") Long id, Model model){
        StudentDTO student = studentService.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid student id: "+ id));
        model.addAttribute("student", student);
        return "students/student-edit";
    }

    @PostMapping
    public String saveStudent(@ModelAttribute("student") StudentDTO student){
        studentService.save(student);
        return "redirect:/students";
    }

    @PostMapping("/update/{id}")
    public String updateStudent(@PathVariable(value = "id") Long id, @ModelAttribute StudentDTO student){
        studentService.updateStudentById(id, student);
        return "redirect:/students";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable(value = "id") Long id){
        studentService.deleteStudent(id);
        return "redirect:/students";
    }


}
