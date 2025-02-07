package org.example.lesson06_part02.controller;


import org.example.lesson06_part02.entity.Customer;
import org.example.lesson06_part02.repository.CustomerRepository;
import org.example.lesson06_part02.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    private final CustomerRepository customerRepository;
    public CustomerService customerService;
    @Autowired
    public CustomerController(CustomerService customerService, CustomerRepository customerRepository) {
        this.customerService = customerService;
        this.customerRepository = customerRepository;
    }
    @GetMapping
    public String getAllCustomers(Model model) {
        List<Customer> customers = customerService.findAll();
        model.addAttribute("customers", customers);
        return "customers/list";
    }
    @GetMapping("/add-new")
    public String addNewCustomer(Model model) {
        model.addAttribute("customer", new Customer());
        return "customers/create";
    }
    @PostMapping("/add-new")
    public String saveNewCustomer(@ModelAttribute("customer") Customer customer) {
        customerRepository.save(customer);
        return "redirect:/customers";
    }
}
