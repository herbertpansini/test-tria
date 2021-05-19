package br.com.tria.service.dto;

import java.io.Serializable;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EquipamentoListDto implements Serializable {

    private static final long serialVersionUID = 1L;

    Long id;

    String codigo;

    String nome;

    Double preco;

    String modelo;

    String local;
}