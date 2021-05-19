package br.com.tria.service.mapper;

import br.com.tria.model.Equipamento;
import br.com.tria.service.dto.EquipamentoDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-05-19T16:02:08-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 14.0.2 (Private Build)"
)
@Component
public class EquipamentoMapperImpl implements EquipamentoMapper {

    @Autowired
    private DepositoMapper depositoMapper;

    @Override
    public Equipamento toEntity(EquipamentoDto dto) {
        if ( dto == null ) {
            return null;
        }

        Equipamento equipamento = new Equipamento();

        equipamento.setId( dto.getId() );
        equipamento.setCodigo( dto.getCodigo() );
        equipamento.setNome( dto.getNome() );
        equipamento.setPreco( dto.getPreco() );
        equipamento.setModelo( dto.getModelo() );
        equipamento.setDeposito( depositoMapper.toEntity( dto.getDeposito() ) );

        return equipamento;
    }

    @Override
    public EquipamentoDto toDto(Equipamento entity) {
        if ( entity == null ) {
            return null;
        }

        EquipamentoDto equipamentoDto = new EquipamentoDto();

        equipamentoDto.setId( entity.getId() );
        equipamentoDto.setCodigo( entity.getCodigo() );
        equipamentoDto.setNome( entity.getNome() );
        equipamentoDto.setPreco( entity.getPreco() );
        equipamentoDto.setModelo( entity.getModelo() );
        equipamentoDto.setDeposito( depositoMapper.toDto( entity.getDeposito() ) );

        return equipamentoDto;
    }

    @Override
    public List<Equipamento> toEntity(List<EquipamentoDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Equipamento> list = new ArrayList<Equipamento>( dtoList.size() );
        for ( EquipamentoDto equipamentoDto : dtoList ) {
            list.add( toEntity( equipamentoDto ) );
        }

        return list;
    }

    @Override
    public List<EquipamentoDto> toDto(List<Equipamento> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<EquipamentoDto> list = new ArrayList<EquipamentoDto>( entityList.size() );
        for ( Equipamento equipamento : entityList ) {
            list.add( toDto( equipamento ) );
        }

        return list;
    }
}
