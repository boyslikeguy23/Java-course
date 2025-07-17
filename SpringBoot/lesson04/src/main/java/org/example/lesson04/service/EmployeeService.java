package org.example.lesson04.service;

import org.example.lesson04.dto.EmployeeDTO;
import org.example.lesson04.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private final List<Employee> employees = new ArrayList<>();

    public EmployeeService() {
        employees.add(new Employee(1, "Nguyen Van A", 30, 5000));
        employees.add(new Employee(2, "Tran Thi B", 25, 6000));
        employees.add(new Employee(3, "Le Van C", 28, 5500));
        employees.add(new Employee(4, "Pham Thi D", 35, 7000));
        employees.add(new Employee(5, "Hoang Thi E", 37, 10000));
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null; // or throw an exception if preferred
    }
    public void addEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setFullName(employeeDTO.getFullName());
        employee.setAge(employeeDTO.getAge());
        employee.setSalary(employeeDTO.getSalary());
        employee.setId(employees.size() + 1); // Auto-increment ID
        employees.add(employee);
    }

    public void updateEmployee(int id, EmployeeDTO employeeDTO) {
        Employee employee = getEmployeeById(id);
        if (employee != null) {
            employee.setFullName(employeeDTO.getFullName());
            employee.setAge(employeeDTO.getAge());
            employee.setSalary(employeeDTO.getSalary());
        }
    }
    public boolean deleteEmployee(int id) {
        return employees.removeIf(employee -> employee.getId() == id);
    }
}
