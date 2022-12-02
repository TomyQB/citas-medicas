package com.citasmedicas.citasmedicas.model.dto.paciente;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PacienteRequestDto {
    
    private String nombre;
    private String apellidos;
    private String usuario;
    private String clave;
    private String NNS;
    private String numTarjeta;
    private String telefono;
    private String direccion;
}
