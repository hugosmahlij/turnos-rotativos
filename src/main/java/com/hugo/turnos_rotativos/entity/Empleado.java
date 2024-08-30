package com.hugo.turnos_rotativos.entity;


import com.hugo.turnos_rotativos.dto.response.EmpleadoDTOResponse;
import jakarta.persistence.*;
import org.springframework.data.annotation.*;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Entity
@Table(name="empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = true)
    private Integer nroDocumento;
    @Column(length = 30, nullable = false)
    private String nombre;
    @Column(length = 30, nullable = false)
    private String apellido;
    @Column(length = 30, nullable = false)
    private String email;
    @Column(nullable = false)
    private Date fechaNacimiento;
    @Column(nullable = false)
    private Date fechaIngreso;

    public EmpleadoDTOResponse toDTO(){
        return new EmpleadoDTOResponse(
                id,
                nroDocumento,
                nombre,
                apellido,
                email,
                fechaNacimiento,
                fechaIngreso
        );
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(Integer nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}
