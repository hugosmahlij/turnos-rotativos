package com.hugo.turnos_rotativos.controller;
import com.hugo.turnos_rotativos.dto.request.EmpleadoDTORequest;
import com.hugo.turnos_rotativos.dto.response.EmpleadoDTOResponse;
import com.hugo.turnos_rotativos.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;

    @PostMapping
    public ResponseEntity<EmpleadoDTOResponse> agregarEmpleado(@RequestBody EmpleadoDTORequest empleadoDTO) {
         EmpleadoDTOResponse response = empleadoService.agregarEmpleado(empleadoDTO);
         return ResponseEntity.created(URI.create("/empleado")).body(response);
    }

}
