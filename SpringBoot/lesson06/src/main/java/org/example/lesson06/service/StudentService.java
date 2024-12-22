package org.example.lesson06.service;

import lombok.NoArgsConstructor;
import org.example.lesson06.dto.StudentDTO;
import org.example.lesson06.entity.Student;
import org.example.lesson06.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@NoArgsConstructor
public class StudentService {
    private static final Logger log = LoggerFactory.getLogger(StudentService.class);
    @Autowired
    private StudentRepository studentRepository;

    //List All
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    //Get Object Student
    public Optional<StudentDTO> findById(Long id) {
        Student student = studentRepository.findById(id).orElse(null);
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(id);
        studentDTO.setName(student.getName());
        studentDTO.setAge(student.getAge());
        studentDTO.setEmail(student.getEmail());
        return Optional.of(studentDTO);
    }
    /**
     * Save
     */
    public Boolean save(StudentDTO studentDTO) {
        Student student = new Student();
        student.setName(studentDTO.getName());
        student.setAge(studentDTO.getAge());
        student.setEmail(studentDTO.getEmail());
        try{
            studentRepository.save(student);
            return true;
        }catch(Exception e){
            log.error(e.getMessage());
            return false;
        }
    }

    //Update data when edit
    public Student updateStudentById(Long id, StudentDTO studentDTO) {
        return studentRepository.findById(id)
                .map(student -> {
                    student.setName(studentDTO.getName());
                    student.setAge(studentDTO.getAge());
                    student.setEmail(studentDTO.getEmail());
                    return studentRepository.save(student);
                }).orElseThrow(()->new IllegalArgumentException("Invalid student id "+id));
    }

    public void  deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
