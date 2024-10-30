package com.gesti.historialacademicogesti.model;

import jakarta.persistence.*;

import lombok.Getter;

import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "historial_academico")
@Getter
@Setter
public class HistorialAcademico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_historial")
    private long id;

    @Column(name = "id_estudiante")
    private long idEstudiante;

    @Column(name = "id_institucion")
    private long idInstitucion;

    @Column(name = "promedio_general", nullable = false)
    private Double promedioGeneral;

    @Column(name = "creditos_totales", nullable = false)
    private Integer creditosTotales;

    @Column(name = "creditos_aprobados", nullable = false)
    private Integer creditosAprobados;

    @Column(name = "tipo_programa", nullable = false)
    private String tipoPrograma;

    @Column(name = "nivel_educativo", nullable = false)
    private String nivelEducativo;

    @Column(name = "titulo_obtenido")
    private String tituloObtenido;

    @Column(name = "estatus_graduacion", nullable = false)
    private String estatusGraduacion;

    @Column(name = "fecha_graduacion")
    @Temporal(TemporalType.DATE)
    private Date fechaGraduacion;

    @Column(name = "documento_certificacion")
    private String documentoCertificacion;

    @Column(name = "observaciones", length = 500)
    private String observaciones;

    @Column(name = "fecha_inicio", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;

    @Column(name = "fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;

    @Column(name = "estado", nullable = false)
    private Boolean estado;
}
