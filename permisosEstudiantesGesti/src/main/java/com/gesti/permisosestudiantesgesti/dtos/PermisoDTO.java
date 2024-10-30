package com.gesti.permisosestudiantesgesti.dtos;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Getter
@Setter
public class PermisoDTO {


    private Long id;
    private Long idEstudiante;
    private String tipo; // Ej: "Salida", "Justificación", etc.
    private Date fechaInicio;
    private Date fechaFin;
    private String motivo;
    private String estado; // Ej: "Aprobado", "Pendiente", "Rechazado"
}
