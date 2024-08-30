package com.hugo.turnos_rotativos.dto.response;

import jakarta.validation.constraints.NotBlank;
import org.springframework.lang.NonNull;

import java.util.Date;

public record EmpleadoDTOResponse(
        @NonNull
        Long id,
        Integer nroDocumento,
        @NotBlank
        String nombre,
        @NotBlank
        String apellido,
        @NotBlank
        String email,
        @NonNull
        Date fechaNacimiento,
        @NonNull
        Date fechaIngreso
) {
}
