package com.jscode.spring.product;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("")
    public List<Product> findAll() {
        return productService.findAll();
    }
}
