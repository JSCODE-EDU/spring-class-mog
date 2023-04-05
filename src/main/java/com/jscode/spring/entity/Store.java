package com.jscode.spring.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table
@Entity
@ToString
@Getter
@NoArgsConstructor
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String address;

    @Column
    private String phone;

    @OneToMany(mappedBy = "store")
    private List<Product> products = new ArrayList<>();

    public Store(String name) {
        this.name = name;
    }

    public static Store created(String name) {
        return new Store(name);
    }
}
