package org.example.lesson06_part02.service;


import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.lesson06_part02.dto.CustomerDTO;
import org.example.lesson06_part02.entity.Customer;
import org.example.lesson06_part02.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@NoArgsConstructor
public class CustomerService {
    private CustomerRepository customerRepository;
    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
    public Optional<Customer> findById(Long id) {
        Customer customer = customerRepository.findById(id).orElse(null);
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setId(customer.getId());
        customerDTO.setUsername(customer.getUsername());
        customerDTO.setPassword(customer.getPassword());
        customerDTO.setAddress(customer.getAddress());
        customerDTO.setPhone(customer.getPhone());
        customerDTO.setEmail(customer.getEmail());
        customerDTO.setBirthDay(customer.getBirthDay());
        customerDTO.setActive(customer.isActive());
        return Optional.of(customer);
    }
    public Boolean save(CustomerDTO customerDTO) {
        Customer customer = new Customer();
        customer.setUsername(customerDTO.getUsername());
        customer.setPassword(customerDTO.getPassword());
        customer.setAddress(customerDTO.getAddress());
        customer.setPhone(customerDTO.getPhone());
        customer.setEmail(customerDTO.getEmail());
        customer.setBirthDay(customerDTO.getBirthDay());
        customer.setActive(customerDTO.isActive());
        try{
            customerRepository.save(customer);
            return true;
        }catch (Exception e){
            return false;
        }
    }
    public Customer update(Long id, CustomerDTO updatedCustomerDTO) {
        return customerRepository.findById(id).map(customer ->{
            customer.setUsername(updatedCustomerDTO.getUsername());
            customer.setPassword(updatedCustomerDTO.getPassword());
            customer.setAddress(updatedCustomerDTO.getAddress());
            customer.setPhone(updatedCustomerDTO.getPhone());
            customer.setEmail(updatedCustomerDTO.getEmail());
            customer.setBirthDay(updatedCustomerDTO.getBirthDay());
            customer.setActive(updatedCustomerDTO.isActive());
            return customerRepository.save(customer);
        }).orElseThrow(() -> new IllegalArgumentException("Invalid ID: " + id));
    }
    public void deleteCustomerById(Long id) {
        customerRepository.deleteById(id);
    }
}
