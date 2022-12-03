package com.citasmedicas.citasmedicas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.citasmedicas.citasmedicas.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

    boolean existsByNNS(final String nns);
    
}
