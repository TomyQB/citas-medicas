package com.citasmedicas.citasmedicas.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@Entity
public class Medico extends Usuario implements Serializable {
    
    private String numColegiado;

    @OneToMany(mappedBy = "medico")
    private List<Cita> citas;

    @ManyToMany
    private List<Paciente> pacientes;
}
