package br.com.tria.service;

import java.util.List;

import br.com.tria.service.dto.DepositoListDto;

public interface DepositoService {

    List<DepositoListDto> findAllDeposito();
}
