package com.example.lab06_Validation_CRUD_part02.controllers;

import com.example.lab06_Validation_CRUD_part02.dtos.requests.CustomerRequestDTO;
import com.example.lab06_Validation_CRUD_part02.models.Customer;
import com.example.lab06_Validation_CRUD_part02.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
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
        return "customers/list";
    }

    @GetMapping("/new")
    public String createCustomerForm(Model model) {
        CustomerRequestDTO newCustomer = new CustomerRequestDTO();
        newCustomer.setActive(true);
        model.addAttribute("customer", newCustomer);
        return "customers/form";
    }

    @PostMapping("/save")
    public String saveCustomer(@Validated @ModelAttribute CustomerRequestDTO customerRequestDTO, BindingResult result, Model model) {
        System.out.println("ID nhận được từ form: " + customerRequestDTO.getId()); // Thêm dòng này để debug

        if (customerService.existsByUsername(customerRequestDTO.getUsername()) && customerRequestDTO.getId() == null) {
            model.addAttribute("error", "Username already exists");
            return "customers/form";
        }
        if (customerService.existsByEmail(customerRequestDTO.getEmail()) && customerRequestDTO.getId() == null) {
            model.addAttribute("error", "Email already exists");
            return "customers/form";
        }
        if (result.hasErrors()) {
            return "customers/form";
        }
        customerService.saveCustomer(customerRequestDTO);
        return "redirect:/customers/all";
    }

    @GetMapping("/edit/{id}")
    public String editCustomerForm(@PathVariable Long id, Model model) throws IllegalAccessException {
        Customer customer = customerService.getCustomerById(id)
                .orElseThrow(() -> new IllegalAccessException("Invalid customer Id: " + id));

        // Chuyển từ entity sang DTO
        CustomerRequestDTO dto = new CustomerRequestDTO();
        dto.setId(customer.getId());
        dto.setUsername(customer.getUsername());
        dto.setPassword(customer.getPassword()); // Nếu không mã hoá thì có thể bỏ
        dto.setFullName(customer.getFullName());
        dto.setAddress(customer.getAddress());
        dto.setPhone(customer.getPhone());
        dto.setEmail(customer.getEmail());
        dto.setBirthDay(customer.getBirthDay());
        dto.setActive(customer.isActive());

        model.addAttribute("customer", dto);
        return "customers/form";
    }

    @GetMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
        return "redirect:/customers/all";
    }

}
