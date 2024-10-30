package com.gesti.orquestadorgesti.service;



import com.gesti.orquestadorgesti.dtos.HistorialAcademicoCreateDTO;
import com.gesti.orquestadorgesti.dtos.HistorialAcademicoDTO;
import com.gesti.orquestadorgesti.dtos.HistorialAcademicoUpdateDTO;

import java.util.List;

public interface HistorialAcademicoService {
    List<HistorialAcademicoDTO> listarHistorialAcademicoPorIdEstudiante(long estudianteId);
    HistorialAcademicoDTO obtenerHistorialAcademicoPorID(long id);
    HistorialAcademicoDTO registrarHistorialAcademico(HistorialAcademicoCreateDTO historialCreateDTO);
    HistorialAcademicoDTO actualizarHistorialAcademico(HistorialAcademicoUpdateDTO historialUpdateDTO);
    String eliminarHistorialAcademico(long id);
}
