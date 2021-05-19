package br.com.tria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.tria.model.Deposito;
import br.com.tria.service.dto.DepositoListDto;

@Repository
public interface DepositoRepository extends JpaRepository<Deposito, Long> {

    @Query("SELECT new br.com.tria.service.dto.DepositoListDto( " + "d.id, " + "d.local) "
            + "FROM Deposito d")
    List<DepositoListDto> findAllDeposito();
}