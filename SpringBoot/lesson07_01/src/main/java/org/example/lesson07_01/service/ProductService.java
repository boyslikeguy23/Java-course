package org.example.lesson07_01.service;

import org.example.lesson07_01.entity.Product;
import org.example.lesson07_01.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public Optional<Product> findById(long id) {
        return productRepository.findById(id);
    }
    public Product saveProduct(Product product) {
        System.out.println(product);
        return productRepository.save(product);
    }
    public void deleteProduct(long id) {
        productRepository.deleteById(id);
    }

}
