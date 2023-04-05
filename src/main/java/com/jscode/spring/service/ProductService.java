package com.jscode.spring.service;

import com.jscode.spring.dto.ProductRequest;
import com.jscode.spring.entity.Product;
import com.jscode.spring.entity.Store;
import com.jscode.spring.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    private final StoreService storeService;

    public ProductService(ProductRepository productRepository, StoreService storeService) {
        this.productRepository = productRepository;
        this.storeService = storeService;
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Optional<Product> findOneById(Long id) {
        return productRepository.findById(id);
    }

    public Optional<Product> findOneByName(String name) {
        return productRepository.findByName(name);
    }

    public void save(ProductRequest productRequest) {
        Store store = storeService.findById(productRequest.getStoreId())
                .orElse(storeService.save(Store.created(generateStoreName(productRequest.getName()))));

        Product product = Product.created(productRequest.getName(),
                productRequest.getPrice(),
                store);

        productRepository.save(product);
    }

    private String generateStoreName(String productName) {
        return productName + " 판매 상점";
    }
}
