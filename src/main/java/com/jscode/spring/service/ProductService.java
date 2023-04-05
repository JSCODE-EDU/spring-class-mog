package com.jscode.spring.service;

import com.jscode.spring.dto.Product;
import com.jscode.spring.repository.ProductJpaRepository;
import com.jscode.spring.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductJpaRepository productJpaRepository;

    public ProductService(ProductRepository productRepository, ProductJpaRepository productJpaRepository) {
        this.productRepository = productRepository;
        this.productJpaRepository = productJpaRepository;
    }

    public List<com.jscode.spring.entity.Product> findAll() {
        return productJpaRepository.findAll();
    }

    public Product findOneById(int id) {
        return productRepository.findOneById(id);
    }

    public Product findOneByName(String name) {
        return productRepository.findOneByName(name);
    }

    public void save(com.jscode.spring.entity.Product product) {
        productJpaRepository.save(product);
    }
}
