package com.jscode.spring.service;

import com.jscode.spring.dto.Product;
import com.jscode.spring.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }
    public Product findOneById(int id) {
        return productRepository.findOneById(id);
    }

    public Product findOneByName(String name) {
        return productRepository.findOneByName(name);
    }

    public void save(Product product) {
        productRepository.save(product);
    }
}
