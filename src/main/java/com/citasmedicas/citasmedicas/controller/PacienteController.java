package com.citasmedicas.citasmedicas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.citasmedicas.citasmedicas.handler.exception.badRequest.PacienteAlreadyExistException;
import com.citasmedicas.citasmedicas.model.dto.paciente.PacienteRequestDto;
import com.citasmedicas.citasmedicas.service.PacienteService;

@RestController
@CrossOrigin
public class PacienteController {

    private static final String PACIENTE_URL = "/paciente";
    private static final String GUARDAR_PACIENTE_URL = PACIENTE_URL + "/guardar";

    @Autowired
    private PacienteService pacienteService;

    @PostMapping(GUARDAR_PACIENTE_URL)
    public ResponseEntity guardarPaciente(@RequestBody final PacienteRequestDto pacienteRequestDto) throws PacienteAlreadyExistException {
        pacienteService.guardarPaciente(pacienteRequestDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
