package com.jscode.spring.controller;

import com.jscode.spring.entity.Product;
import com.jscode.spring.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("api/products")
    public List<com.jscode.spring.entity.Product> findAll() {
        return productService.findAll();
    }

    @GetMapping(value = "api/products", params = "id")
    public Optional<Product> findOneById(@RequestParam Long id) {
        return productService.findOneById(id);
    }

    @GetMapping(value = "api/products", params = "name")
    public Optional<Product> findOneByName(@RequestParam String name) {
        return productService.findOneByName(name);
    }

    @PostMapping("api/products")
    public String saveProduct(@RequestBody com.jscode.spring.entity.Product product) {
        productService.save(product);
        return "정상 저장됐습니다.";
    }
}
