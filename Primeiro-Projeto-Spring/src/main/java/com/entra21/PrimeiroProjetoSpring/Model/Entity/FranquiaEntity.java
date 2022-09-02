package com.entra21.PrimeiroProjetoSpring.Model.Entity;

import lombok.Data;

import javax.persistence.*;

@Data //serve  para gerar getter e setter para todos os atributos
@Entity //pra dizer que é um mapeamento do banco
@Table(name= "franquia")//expecifica qual tabela usar
public class FranquiaEntity {

    @Column(name="id") //expecifica qual coluna vamos usar
    @Id //especificar qual e o identificador ( primary kay)
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto serve para criarmos o identity é o auto increment
    private Long id;
    @Column(name= "nome", nullable = false)//nullable diz que não pode ser nulo
    private String nome;

}
