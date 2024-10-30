package com.gesti.permisosestudiantesgesti.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class PermisoCreateDTO {


    private Long idEstudiante;
    private String tipo; // Ej: "Salida", "Justificación", etc.
    private Date fechaInicio;
    private Date fechaFin;
    private String motivo;
    private String estado; // Ej: "Aprobado", "Pendiente", "Rechazado"
}
