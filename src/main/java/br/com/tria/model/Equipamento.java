package br.com.tria.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Table(name = "equipamento")
@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Equipamento implements Serializable {

    static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(length = 20, nullable = false)
    String codigo;

    @Column(length = 50, nullable = false)
    String nome;

    @Column(nullable = false)
    Double preco;

    @Column(length = 20, nullable = false)
    String modelo;

    @ManyToOne
    @JoinColumn(name = "id.deposito", nullable = false)
    Deposito deposito;
}