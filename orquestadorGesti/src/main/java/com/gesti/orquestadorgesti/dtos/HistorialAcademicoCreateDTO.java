package com.gesti.orquestadorgesti.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class HistorialAcademicoCreateDTO {


    private Long idEstudiante;
    private Long idInstitucion;
    private Double promedioGeneral;
    private Integer creditosTotales;
    private Integer creditosAprobados;
    private String tipoPrograma;
    private String nivelEducativo;
    private String tituloObtenido;
    private String estatusGraduacion;
    private Date fechaGraduacion;
    private String documentoCertificacion;
    private String observaciones;
    private Date fechaInicio;
    private Date fechaFin;
    private Boolean estado;
}
