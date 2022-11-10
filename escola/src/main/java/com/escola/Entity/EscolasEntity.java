package com.escola.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "contribuicao")
public class EscolasEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "telefone")
    private Number telefone;
/*
    @ManyToMany
    @Column(name ="idp")
    @JoinColumn(name = "id_pessoa",referencedColumnName = "id")
    private Long idp;


/}
 */
}