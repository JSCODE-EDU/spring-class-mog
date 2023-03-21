package com.jscode.spring.entity;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;

@Table
@Entity
@ToString
@Getter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private Long price;

    public Product() {

    }
}
