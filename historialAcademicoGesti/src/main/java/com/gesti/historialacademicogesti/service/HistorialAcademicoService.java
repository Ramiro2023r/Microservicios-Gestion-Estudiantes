package com.gesti.historialacademicogesti.service;

import com.gesti.historialacademicogesti.dtos.HistorialAcademicoCreateDTO;
import com.gesti.historialacademicogesti.dtos.HistorialAcademicoDTO;
import com.gesti.historialacademicogesti.dtos.HistorialAcademicoUpdateDTO;

import java.util.List;

public interface HistorialAcademicoService {
    List<HistorialAcademicoDTO> listarHistorialAcademicoPorIdEstudiante(long estudianteId);
    HistorialAcademicoDTO obtenerHistorialAcademicoPorID(long id);
    HistorialAcademicoDTO registrarHistorialAcademico(HistorialAcademicoCreateDTO historialCreateDTO);
    HistorialAcademicoDTO actualizarHistorialAcademico(HistorialAcademicoUpdateDTO historialUpdateDTO);
    String eliminarHistorialAcademico(long id);
}
