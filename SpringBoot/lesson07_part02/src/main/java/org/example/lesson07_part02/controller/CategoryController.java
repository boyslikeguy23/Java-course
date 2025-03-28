package org.example.lesson07_part02.controller;

import org.example.lesson07_part02.entity.Category;
import org.example.lesson07_part02.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public String getCategory(Model model) {
        model.addAttribute("categories", categoryService.getAllCategories());
        return "category/category-list";
    }

    @GetMapping("/create")
    public String createCategory(Model model) {
        model.addAttribute("category", new Category());
        return "category/category-form";
    }
    @GetMapping("/edit/{id}")
    public String editCategory(Model model, @PathVariable("id") Long id) {
        model.addAttribute("category", categoryService.getCategoryById(id).orElse(null));
        return "category/category-form";
    }
    @PostMapping("/create")
    public String saveCategory(@ModelAttribute("category") Category category) {
        categoryService.saveCategory(category);
        return "redirect:/category";
    }
    @PostMapping("/create/{id}")
    public String updateCategory(@PathVariable("id") Long id, @ModelAttribute("category") Category category) {
        category.setId(id);
        categoryService.saveCategory(category);
        return "redirect:/category";
    }
    @GetMapping("/delete/{id}")
    public String deleteCategory(@PathVariable("id") Long id) {
        categoryService.deleteCategoryById(id);
        return "redirect:/category";
    }
}
