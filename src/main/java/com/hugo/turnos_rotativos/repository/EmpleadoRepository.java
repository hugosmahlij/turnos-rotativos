package com.hugo.turnos_rotativos.repository;

import com.hugo.turnos_rotativos.dto.request.EmpleadoDTORequest;
import com.hugo.turnos_rotativos.entity.Empleado;

public interface EmpleadoRepository {

    Empleado crearEmpleado(EmpleadoDTORequest empleadoDTORequest);
}
