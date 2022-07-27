package com.nono.guilherme.nonoapi.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;
}
