package com.hugo.turnos_rotativos.service.impl;

import com.hugo.turnos_rotativos.dto.request.EmpleadoDTORequest;
import com.hugo.turnos_rotativos.dto.response.EmpleadoDTOResponse;
import com.hugo.turnos_rotativos.entity.Empleado;
import com.hugo.turnos_rotativos.repository.EmpleadoRepository;
import com.hugo.turnos_rotativos.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    EmpleadoRepository repository;

    @Override
    public EmpleadoDTOResponse agregarEmpleado(EmpleadoDTORequest empleadoDTORequest) {
        Empleado empleado = repository.crearEmpleado(empleadoDTORequest);
        return empleado.toDTO();
    }
}
