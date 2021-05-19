package br.com.tria.service.mapper;

import org.mapstruct.Mapper;

import br.com.tria.model.Equipamento;
import br.com.tria.service.dto.EquipamentoDto;

@Mapper(componentModel = "spring", uses = {DepositoMapper.class})
public interface EquipamentoMapper extends EntityMapper<EquipamentoDto, Equipamento> {

}
