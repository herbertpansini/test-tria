package br.com.tria.service.dto;

import java.io.Serializable;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
public class EquipamentoDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    Long id;

    @NotBlank
    String codigo;

    @NotBlank
    String nome;

    @NotNull
    Double preco;

    @NotBlank
    String modelo;

    @NotNull
    DepositoDto deposito;
}