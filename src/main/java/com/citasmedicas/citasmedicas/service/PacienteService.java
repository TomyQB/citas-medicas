package com.citasmedicas.citasmedicas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citasmedicas.citasmedicas.handler.exception.badRequest.PacienteAlreadyExistException;
import com.citasmedicas.citasmedicas.mapper.paciente.PacienteRequestMapper;
import com.citasmedicas.citasmedicas.model.dto.paciente.PacienteRequestDto;
import com.citasmedicas.citasmedicas.repository.PacienteRepository;

@Service
public class PacienteService {
    
    @Autowired
    private PacienteRequestMapper pacienteRequestMapper;

    @Autowired
    private PacienteRepository pacienteRepository;

    public void guardarPaciente(final PacienteRequestDto pacienteRequestDto) throws PacienteAlreadyExistException {
        if (pacienteRepository.existsByNNS(pacienteRequestDto.getNNS())) {
            throw new PacienteAlreadyExistException();
        }
        pacienteRepository.save(pacienteRequestMapper.dtoToEntity(pacienteRequestDto));
    }
}
