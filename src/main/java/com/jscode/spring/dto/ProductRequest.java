package com.jscode.spring.dto;

public class ProductRequest {
    private final String name;
    private final Long price;
    private final Long storeId;

    public ProductRequest(String name, Long price, Long storeId) {
        this.name = name;
        this.price = price;
        this.storeId = storeId;
    }
    public String getName() {
        return name;
    }

    public Long getPrice() {
        return price;
    }

    public Long getStoreId() {
        return storeId;
    }
}
