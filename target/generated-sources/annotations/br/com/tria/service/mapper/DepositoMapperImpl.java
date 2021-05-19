package br.com.tria.service.mapper;

import br.com.tria.model.Deposito;
import br.com.tria.service.dto.DepositoDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-05-19T16:02:08-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 14.0.2 (Private Build)"
)
@Component
public class DepositoMapperImpl implements DepositoMapper {

    @Override
    public Deposito toEntity(DepositoDto dto) {
        if ( dto == null ) {
            return null;
        }

        Deposito deposito = new Deposito();

        deposito.setId( dto.getId() );
        deposito.setNome( dto.getNome() );
        deposito.setDescricao( dto.getDescricao() );
        deposito.setLocal( dto.getLocal() );

        return deposito;
    }

    @Override
    public DepositoDto toDto(Deposito entity) {
        if ( entity == null ) {
            return null;
        }

        DepositoDto depositoDto = new DepositoDto();

        depositoDto.setId( entity.getId() );
        depositoDto.setNome( entity.getNome() );
        depositoDto.setDescricao( entity.getDescricao() );
        depositoDto.setLocal( entity.getLocal() );

        return depositoDto;
    }

    @Override
    public List<Deposito> toEntity(List<DepositoDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Deposito> list = new ArrayList<Deposito>( dtoList.size() );
        for ( DepositoDto depositoDto : dtoList ) {
            list.add( toEntity( depositoDto ) );
        }

        return list;
    }

    @Override
    public List<DepositoDto> toDto(List<Deposito> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<DepositoDto> list = new ArrayList<DepositoDto>( entityList.size() );
        for ( Deposito deposito : entityList ) {
            list.add( toDto( deposito ) );
        }

        return list;
    }
}
