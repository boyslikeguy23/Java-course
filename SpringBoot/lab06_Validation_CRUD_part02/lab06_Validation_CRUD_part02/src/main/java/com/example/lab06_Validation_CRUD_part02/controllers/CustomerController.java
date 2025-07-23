package com.example.lab06_Validation_CRUD_part02.controllers;

import com.example.lab06_Validation_CRUD_part02.dtos.requests.CustomerRequestDTO;
import com.example.lab06_Validation_CRUD_part02.models.Customer;
import com.example.lab06_Validation_CRUD_part02.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    // Define endpoints for CRUD operations here
    @GetMapping("/all")
    public String getCustomers(Model model) {
        List<Customer> customers = customerService.getAllCustomers();
        model.addAttribute("customers", customers);
        return "customer/list";
    }

    @GetMapping("/new")
    public String createCustomerForm(Model model) {
        Customer newCustomer = new Customer();
        newCustomer.setActive(true);
        model.addAttribute("customer", newCustomer);
        return "customer/form";
    }

    @PostMapping("/save/{id}")
    public String saveCustomer(@PathVariable Long id, @ModelAttribute CustomerRequestDTO customerRequestDTO, Model model, BindingResult result) {
        if (customerService.existsByUsername(customerRequestDTO.getUsername()) && id == null) {
            model.addAttribute("error", "Username already exists");
            return "customer/form";
        }
        if (customerService.existsByEmail(customerRequestDTO.getEmail()) && id == null) {
            model.addAttribute("error", "Email already exists");
            return "customer/form";
        }
        if (result.hasErrors()) {
            return "customer/form";
        }
        customerService.saveCustomer(id, customerRequestDTO);
        return "redirect:/customers/all";
    }

    @GetMapping("/edit/{id}")
    public String editCustomerForm(@PathVariable Long id, Model model) throws IllegalAccessException {
        Customer editingCustomer = customerService.getCustomerById(id).orElseThrow(() -> new IllegalAccessException("Invalid customer Id: " + id));
        model.addAttribute("customer", editingCustomer);
        return "customer/form";
    }

    @GetMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
        return "redirect:/customers/all";
    }

}
