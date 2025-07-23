package com.example.lab06_Validation_CRUD_part02.services;

import com.example.lab06_Validation_CRUD_part02.dtos.requests.CustomerRequestDTO;
import com.example.lab06_Validation_CRUD_part02.models.Customer;
import com.example.lab06_Validation_CRUD_part02.repositories.CustomerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Transactional
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Optional<Customer> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    @Transactional
    public void saveCustomer(Long id, CustomerRequestDTO customerRequestDTO) {
        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));

        customer.setUsername(customerRequestDTO.getUsername());
        customer.setPassword(customerRequestDTO.getPassword());
        customer.setFullName(customerRequestDTO.getFullName());
        customer.setAddress(customerRequestDTO.getAddress());
        customer.setPhone(customerRequestDTO.getPhone());
        customer.setEmail(customerRequestDTO.getEmail());
        customer.setBirthDay(customerRequestDTO.getBirthDay());
        customer.setActive(customerRequestDTO.isActive());
        customerRepository.save(customer);
    }

    @Transactional
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }

    public boolean existsByUsername(String username) {
        return customerRepository.existsByUsername(username);
    }

    public boolean existsByEmail(String email) {
        return customerRepository.existsByEmail(email);
    }

    public boolean existsByPhone(String phone) {
        return customerRepository.existsByPhone(phone);
    }

    public boolean existsById(Long id) {
        return customerRepository.existsById(id);
    }
}
