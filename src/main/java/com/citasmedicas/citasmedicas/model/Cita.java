package com.citasmedicas.citasmedicas.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Date fechaHora;
    private String motivoCita;
    private int attribute11;

    @OneToOne
    @JoinColumn(name = "diagnostico_id")
    private Diagnostico diagnostico;
    
    @ManyToOne
    @JsonIgnore
    private Paciente paciente;
    
    @ManyToOne
    @JsonIgnore
    private Medico medico;
}
