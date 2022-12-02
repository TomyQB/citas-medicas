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
public class Paciente extends Usuario implements Serializable {
    
    private String NNS;
    private String numTarjeta;
    private String telefono;
    private String direccion;

    @OneToMany(mappedBy = "paciente")
    private List<Cita> citas;

    @ManyToMany(mappedBy = "pacientes")
    private List<Medico> medicos;
}
