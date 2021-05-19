package br.com.tria.service.dto;

import java.io.Serializable;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

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
public class DepositoDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    Long id;

    @NotBlank
    String nome;

    String descricao;

    @NotBlank
    String local;
}