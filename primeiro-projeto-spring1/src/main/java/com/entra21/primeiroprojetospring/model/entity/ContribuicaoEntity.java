package com.entra21.primeiroprojetospring.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "contribuicao")
public class ContribuicaoEntity {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "valor")
    private double valor;

    //data

    @OneToMany
    @JoinColumn(name = "id_pessoa",referencedColumnName = "id")
    private PessoaEntity idPessoa;

    @OneToMany
    @JoinColumn(name = "id_organizacao", referencedColumnName = "id")
    private OrganizacaoEntity idOrganizacao;

}
