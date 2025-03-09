package org.example.lesson07_01.controller;

import org.example.lesson07_01.entity.Category;
import org.example.lesson07_01.entity.Product;
import org.example.lesson07_01.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public String getAllProducts(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "product/product-list";
    }

    @GetMapping("/create")
    public String createProduct(Model model) {
        model.addAttribute("product", new Product());
        return "product/product-form";
    }

    @PostMapping("/create")
    public String saveProduct(Product product) {
        productService.saveProduct(product);
        return "redirect:/product";
    }

    @GetMapping("/edit/{id}")
    public String editProduct(Model model, @PathVariable Long id) {
        model.addAttribute("product", productService.findById(id).orElse(null));
        return "product/product-form";
    }
    @PostMapping("/update/{id}")
    public String updateProduct(@PathVariable("id") Long id, @ModelAttribute("product") Product product) {
        product.setId(id);
        productService.saveProduct(product);
        return "redirect:/product";
    }
    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") Long id) {
        productService.deleteProduct(id);
        return "redirect:/product";
    }
}
