package br.com.tria.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Table(name = "deposito")
@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Deposito implements Serializable {

    static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(length = 50, nullable = false)
    String nome;

    @Column(length = 255)
    String descricao;

    @Column(length = 20, nullable = false)
    String local;
}