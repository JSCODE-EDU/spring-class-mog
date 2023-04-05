package com.jscode.spring.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Table
@Entity
@ToString
@Getter
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private Long price;

    @ManyToOne
    @JoinColumn(name="store_id")
    private Store store;

    public Product(String name, Long price, Store store) {
        this.name = name;
        this.price = price;
        this.store = store;
    }

    public static Product created(String name, Long price, Store store) {
        return new Product(name, price, store);
    }
}
