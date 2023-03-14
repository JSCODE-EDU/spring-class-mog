package com.jscode.spring.product;

import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class ProductRepository {
    private final List<Product> products = List.of(
            new Product("키보드", 50000L),
            new Product("마우스", 10000L),
            new Product("모니터", 200000L)
        );

    // 전체 상품을 조회하는 메소드
    public List<Product> findAll() {
        return products;
    }

    // 특정 상품을 조회하는 메소드
    public Product findOne(Integer id) {
        return products.get(id);
    }
}
