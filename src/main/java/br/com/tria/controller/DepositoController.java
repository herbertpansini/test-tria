package br.com.tria.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tria.service.DepositoService;
import br.com.tria.service.dto.DepositoListDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/deposito")
@RequiredArgsConstructor
public class DepositoController {

    private final DepositoService depositoService;

    @GetMapping
    public ResponseEntity<List<DepositoListDto>> findAllDeposito() {
        return ResponseEntity.ok(this.depositoService.findAllDeposito());
    }
}
