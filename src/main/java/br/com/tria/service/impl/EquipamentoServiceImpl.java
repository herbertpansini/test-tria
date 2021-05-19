package br.com.tria.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.tria.repository.EquipamentoRepository;
import br.com.tria.service.EquipamentoService;
import br.com.tria.service.dto.EquipamentoDto;
import br.com.tria.service.dto.EquipamentoFilterDto;
import br.com.tria.service.dto.EquipamentoListDto;
import br.com.tria.service.mapper.EquipamentoMapper;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class EquipamentoServiceImpl implements EquipamentoService {

    private final EquipamentoRepository equipamentoRepository;
    private final EquipamentoMapper EquipamentoMapper;

    @Override
    public EquipamentoDto save(final EquipamentoDto equipamento) {
        return this.EquipamentoMapper.toDto(
                this.equipamentoRepository.save(this.EquipamentoMapper.toEntity(equipamento)));
    }

    @Override
    @Transactional(readOnly = true)
    public Page<EquipamentoListDto> findAllEquipamento(final Pageable pageable) {
        return this.equipamentoRepository.findAllEquipamento(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<EquipamentoListDto> filter(final EquipamentoFilterDto equipamento,
            final Pageable pageable) {
        return this.equipamentoRepository.filter(equipamento, pageable);
    }
}