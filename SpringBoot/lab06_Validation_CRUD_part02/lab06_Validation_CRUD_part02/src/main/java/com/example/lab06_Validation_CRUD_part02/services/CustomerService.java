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
    public Customer saveCustomer(CustomerRequestDTO customerRequestDTO) {
        if (customerRequestDTO.getId() == null) {
            Customer customer = new Customer();
            customer.setUsername(customerRequestDTO.getUsername());
            customer.setPassword(customerRequestDTO.getPassword());
            customer.setFullName(customerRequestDTO.getFullName());
            customer.setAddress(customerRequestDTO.getAddress());
            customer.setPhone(customerRequestDTO.getPhone());
            customer.setEmail(customerRequestDTO.getEmail());
            customer.setBirthDay(customerRequestDTO.getBirthDay());
            customer.setActive(customerRequestDTO.isActive());
            return customerRepository.save(customer);
        }
        Customer existingCustomer = customerRepository.findById(customerRequestDTO.getId()).get();
        existingCustomer.setId(customerRequestDTO.getId());
        existingCustomer.setUsername(customerRequestDTO.getUsername());
        existingCustomer.setPassword(customerRequestDTO.getPassword());
        existingCustomer.setFullName(customerRequestDTO.getFullName());
        existingCustomer.setAddress(customerRequestDTO.getAddress());
        existingCustomer.setPhone(customerRequestDTO.getPhone());
        existingCustomer.setEmail(customerRequestDTO.getEmail());
        existingCustomer.setBirthDay(customerRequestDTO.getBirthDay());
        existingCustomer.setActive(customerRequestDTO.isActive());
        return customerRepository.save(existingCustomer);
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
