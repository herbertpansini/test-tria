package br.com.tria.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.tria.service.dto.EquipamentoDto;
import br.com.tria.service.dto.EquipamentoFilterDto;
import br.com.tria.service.dto.EquipamentoListDto;

public interface EquipamentoService {

    EquipamentoDto save(EquipamentoDto equipamento);

    Page<EquipamentoListDto> filter(EquipamentoFilterDto equipamento, Pageable pageable);

    Page<EquipamentoListDto> findAllEquipamento(Pageable pageable);
}