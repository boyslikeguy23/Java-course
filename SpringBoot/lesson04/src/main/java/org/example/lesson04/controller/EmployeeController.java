package org.example.lesson04.controller;

import jakarta.validation.Valid;
import org.example.lesson04.dto.EmployeeDTO;
import org.example.lesson04.entity.Employee;
import org.example.lesson04.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee-list")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employees = employeeService.getAllEmployees();
        if (employees.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable int id) {
        Employee employee = employeeService.getEmployeeById(id);
        if (employee == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(employee);
    }

    @PostMapping("/employee-add")
    public ResponseEntity<String> addEmployee(@RequestBody @Valid EmployeeDTO employee) {
        employeeService.addEmployee(employee);
        return ResponseEntity.ok("Employee added successfully");
    }

    @PutMapping("/employee-edit/{id}")
    public ResponseEntity<String> updateEmployee(@PathVariable int id, @RequestBody @Valid EmployeeDTO employee) {
        employeeService.updateEmployee(id, employee);
        return ResponseEntity.ok("Employee updated successfully");
    }

    @DeleteMapping("/employee-delete/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable int id) {
        boolean deleted = employeeService.deleteEmployee(id);
        if (deleted) {
            return ResponseEntity.ok("Employee deleted successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
