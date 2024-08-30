package com.hugo.turnos_rotativos.service;

import com.hugo.turnos_rotativos.dto.request.EmpleadoDTORequest;
import com.hugo.turnos_rotativos.dto.response.EmpleadoDTOResponse;

public interface EmpleadoService {

    EmpleadoDTOResponse agregarEmpleado(EmpleadoDTORequest empleadoDTORequest);
}
