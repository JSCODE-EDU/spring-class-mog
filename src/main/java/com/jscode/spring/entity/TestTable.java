package com.jscode.spring.entity;

import javax.persistence.*;

@Table
@Entity
public class TestTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //MySQL의 AUTO_INCREMENT를 사용
    private Long id;

    @Column
    private String name;

    public TestTable() {
    }
}
