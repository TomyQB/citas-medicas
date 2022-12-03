package com.citasmedicas.citasmedicas.handler.exception.badRequest;

public class PacienteAlreadyExistException extends Exception {
    
    public static final String DESCRIPTION = "Error al guardar el paciente, ya existe un paciente con ese NNS";

    public PacienteAlreadyExistException() {
        super(DESCRIPTION);
    }

    public PacienteAlreadyExistException(String detail) {
        super(DESCRIPTION + ": " + detail);
    }
}
