package com.gesti.estudiantesgesti.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class EstudianteUpdateDTO {

    private long id;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private String direccion;
    private Date fechaNacimiento;
    private Date fechaInscripcion;
    private Boolean estado;
}
