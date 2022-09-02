package com.entra21.PrimeiroProjetoSpring.Model.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="genero")
public class GeneroEntity {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "noome", nullable = false)
    private String nome;

}
