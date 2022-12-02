package com.citasmedicas.citasmedicas.mapper.paciente;

import java.util.List;

import org.springframework.stereotype.Service;

import com.citasmedicas.citasmedicas.mapper.IMapper;
import com.citasmedicas.citasmedicas.model.Paciente;
import com.citasmedicas.citasmedicas.model.dto.paciente.PacienteRequestDto;

@Service
public class PacienteRequestMapper implements IMapper<Paciente, PacienteRequestDto>{

    @Override
    public Paciente dtoToEntity(PacienteRequestDto dto) {
        return Paciente.builder()
        .nombre(dto.getNombre())
        .apellidos(dto.getApellidos())
        .usuario(dto.getUsuario())
        .clave(dto.getClave())
        .NNS(dto.getNNS())
        .numTarjeta(dto.getNumTarjeta())
        .telefono(dto.getTelefono())
        .direccion(dto.getDireccion())
        .build();
    }

    @Override
    public PacienteRequestDto entityToDto(Paciente entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Paciente> dtosToEntities(List<PacienteRequestDto> dtos) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<PacienteRequestDto> entitiesToDtos(List<Paciente> entities) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
