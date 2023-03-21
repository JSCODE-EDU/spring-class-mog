package com.jscode.spring.controller;

import com.jscode.spring.dto.Product;
import com.jscode.spring.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("api/products")
    public List<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping(value = "api/products", params = "id")
    public Product findOneById(@RequestParam int id) {
        return productService.findOneById(id);
    }

    @GetMapping(value = "api/products", params = "name")
    public Product findOneByName(@RequestParam String name) {
        return productService.findOneByName(name);
    }

    @PostMapping("api/products")
    public String saveProduct(@RequestBody Product product) {
        productService.save(product);
        return "정상 저장됐습니다.";
    }
}
