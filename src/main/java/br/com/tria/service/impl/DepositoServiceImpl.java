package br.com.tria.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.tria.repository.DepositoRepository;
import br.com.tria.service.DepositoService;
import br.com.tria.service.dto.DepositoListDto;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class DepositoServiceImpl implements DepositoService {

    private final DepositoRepository depositoRepository;

    @Override
    @Transactional(readOnly = true)
    public List<DepositoListDto> findAllDeposito() {
        return this.depositoRepository.findAllDeposito();
    }
}