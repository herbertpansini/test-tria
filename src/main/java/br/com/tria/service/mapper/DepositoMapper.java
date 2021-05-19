package br.com.tria.service.mapper;

import org.mapstruct.Mapper;

import br.com.tria.model.Deposito;
import br.com.tria.service.dto.DepositoDto;

@Mapper(componentModel = "spring")
public interface DepositoMapper extends EntityMapper<DepositoDto, Deposito> {

}