package org.example.lesson07_01.service;

import org.example.lesson07_01.entity.Category;
import org.example.lesson07_01.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    public CategoryService (CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
    public List<Category> getAllCategories() {
        System.out.println(categoryRepository.findAll());
        return categoryRepository.findAll();
    }
    public Optional<Category> getCategoryById(Long id) {
        return categoryRepository.findById(id);
    }
    public void saveCategory(Category category) {
        categoryRepository.save(category);
    }
    public void deleteCategoryById(Long id) {
        categoryRepository.deleteById(id);
    }
}
