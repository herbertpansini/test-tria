package br.com.tria.controller;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tria.service.EquipamentoService;
import br.com.tria.service.dto.EquipamentoDto;
import br.com.tria.service.dto.EquipamentoFilterDto;
import br.com.tria.service.dto.EquipamentoListDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/equipamento")
@RequiredArgsConstructor
public class EquipamentoController {

    private final EquipamentoService equipamentoService;

    @PostMapping
    public ResponseEntity<EquipamentoDto> save(
            @Valid @RequestBody final EquipamentoDto equipamento) {
        return new ResponseEntity<>(this.equipamentoService.save(equipamento), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Page<EquipamentoListDto>> findAllEquipamento(final Pageable pageable) {
        return ResponseEntity.ok(this.equipamentoService.findAllEquipamento(pageable));
    }

    @PostMapping("/filter")
    public ResponseEntity<Page<EquipamentoListDto>> filter(
            @RequestBody final EquipamentoFilterDto equipamento,
            final Pageable pageable) {
        return ResponseEntity.ok(this.equipamentoService.filter(equipamento, pageable));
    }
}