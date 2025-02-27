package org.example.lesson07_01.controller;

import org.example.lesson07_01.entity.Category;
import org.example.lesson07_01.service.CategoryService;
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
        model.addAttribute("categories", new Category());
        return "category/category-form";
    }

    @PostMapping("/create")
    public String createCategory(@ModelAttribute("categories") Category category) {
        categoryService.saveCategory(category);
        return "redirect:/category";
    }

    @PostMapping("/create/{id}")
    public String updateCategory(@PathVariable("id") Long id, @ModelAttribute("categories") Category category) {
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
