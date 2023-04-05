package com.jscode.spring.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table
@Entity
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
    @JsonIgnore // controller에서 entity를 직접 반환하지 않고 dto를 사용해서 반환하면 @JsonIgnore는 필요 없음
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
