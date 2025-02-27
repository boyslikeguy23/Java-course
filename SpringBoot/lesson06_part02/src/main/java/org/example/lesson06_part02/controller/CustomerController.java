package org.example.lesson06_part02.controller;


import org.example.lesson06_part02.dto.CustomerDTO;
import org.example.lesson06_part02.entity.Customer;
import org.example.lesson06_part02.repository.CustomerRepository;
import org.example.lesson06_part02.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    public CustomerService customerService;
    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;

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
    public String saveNewCustomer(@ModelAttribute("customer") CustomerDTO customer) {
        customerService.save(customer);
        return "redirect:/customers";
    }
    @GetMapping("/view/{id}")
    public String viewCustomer(@PathVariable(value = "id") Long id, Model model) {
        Customer customer = customerService.findById(id).orElseThrow(() -> new IllegalArgumentException("Customer not found id " + id));
        model.addAttribute("customer", customer);
        return "customers/view";
    }
    @GetMapping("/edit/{id}")
    public String editCustomer(@PathVariable(value = "id") Long id, Model model) {
        Customer customer = customerService.findById(id).orElseThrow(() -> new IllegalArgumentException("Customer not found id " + id));
        model.addAttribute("customer", customer);
        return "customers/edit";
    }
    @PostMapping("/update/{id}")
    public String updateCustomer(@ModelAttribute("customer") CustomerDTO customer, @PathVariable(value = "id") Long id) {
        customerService.update(id, customer);
        return "redirect:/customers/view/" + id;
    }
    @GetMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable(value = "id") Long id) {
        customerService.deleteCustomerById(id);
        return "redirect:/customers";
    }
}
