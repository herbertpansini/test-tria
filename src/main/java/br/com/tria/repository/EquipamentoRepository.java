package br.com.tria.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.tria.model.Equipamento;
import br.com.tria.service.dto.EquipamentoFilterDto;
import br.com.tria.service.dto.EquipamentoListDto;

@Repository
public interface EquipamentoRepository extends JpaRepository<Equipamento, Long> {

    @Query("SELECT new br.com.tria.service.dto.EquipamentoListDto( " + "e.id, " + "e.codigo, "
            + "e.nome, " + "e.preco, " + "e.modelo, " + "e.deposito.local) "
            + "FROM Equipamento e "
            + "WHERE (:#{#filter.local} IS NULL OR e.deposito.local = :#{#filter.local})")
    Page<EquipamentoListDto> filter(@Param("filter") EquipamentoFilterDto equipamento,
            Pageable pageable);

    @Query("SELECT new br.com.tria.service.dto.EquipamentoListDto( " + "e.id, " + "e.codigo, "
            + "e.nome, " + "e.preco, " + "e.modelo, " + "e.deposito.local) "
            + "FROM Equipamento e ")
    Page<EquipamentoListDto> findAllEquipamento(Pageable pageable);
}