package com.entra21.PrimeiroProjetoSpring.Model.Entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalTime;

@Data
@Entity
@Table(name ="livro")
@PrimaryKeyJoinColumn(name ="id_item", referencedColumnName = "id")

public class LivroEntity  extends ItemEntity{
 /*   @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;*/

    @Column(name = "diretor")
    private String diretor;

    @Column(name = "duracao")
    private LocalTime duracao;

    @Column(name = "ano_lancamento")
    private Integer anoLancamento;


}
