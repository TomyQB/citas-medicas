package com.citasmedicas.citasmedicas.handler.exception.notFound;

public class PacienteNotFoundException extends Exception {
    
    public static final String DESCRIPTION = "Error al guardar el paciente, ya existe un paciente con ese NNS";

    public PacienteNotFoundException() {
        super(DESCRIPTION);
    }

    public PacienteNotFoundException(String detail) {
        super(DESCRIPTION + ": " + detail);
    }
}
