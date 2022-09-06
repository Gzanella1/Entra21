package com.entra21.PrimeiroProjetoSpring.Model.Entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalTime;

@Data
@Entity
@Table(name ="dvd")
@PrimaryKeyJoinColumn(name ="id_item", referencedColumnName = "id")
public class DVDEntity extends ItemEntity{
    /*@Column(name = "id")
    private Long id;*/

    @Column(name = "diretor")
    private String diretor;

    @Column(name = "duracao")
    private LocalTime duracap;

    @Column(name = "ano_lancamento")
    private Integer anoLancamento;


}
