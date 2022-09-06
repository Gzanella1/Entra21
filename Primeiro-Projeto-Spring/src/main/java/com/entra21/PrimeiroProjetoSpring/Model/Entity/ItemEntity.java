package com.entra21.PrimeiroProjetoSpring.Model.Entity;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
//@MappedSuperclass  //usar quando tem as mesma colunas em outras tabelas
@Table(name= "item")
public abstract class ItemEntity {

    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "valor_venda")
    private Double valorVenda;

    @Column(name = "valor_locacao")
    private Double valorLocacao;

    @Column(name = "emprestado")
    private  boolean emprestado;

    @ManyToOne
    @JoinColumn(name = "id_franquia", referencedColumnName = "id")
    private FranquiaEntity franquia;

    @OneToMany(mappedBy ="item")
    private Set<AvaliacaoEntity> avaliacoes;

    @ManyToMany
    @JoinTable(
            name="genero_item",
            joinColumns= @JoinColumn(name = "id_item"),
            inverseJoinColumns=@JoinColumn(name= "id_genero")
    )
    private Set<GeneroEntity>generos;

}
