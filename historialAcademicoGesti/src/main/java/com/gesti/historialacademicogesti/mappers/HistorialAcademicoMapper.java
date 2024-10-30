package com.gesti.historialacademicogesti.mappers;

import com.gesti.historialacademicogesti.dtos.HistorialAcademicoCreateDTO;
import com.gesti.historialacademicogesti.dtos.HistorialAcademicoDTO;
import com.gesti.historialacademicogesti.dtos.HistorialAcademicoUpdateDTO;
import com.gesti.historialacademicogesti.model.HistorialAcademico;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface HistorialAcademicoMapper {

    HistorialAcademicoMapper instancia = Mappers.getMapper(HistorialAcademicoMapper.class);

    // Mapear lista de HistorialAcademico a lista de HistorialAcademicoDTO
    List<HistorialAcademicoDTO> listaHistorialAcademicoAListaHistorialAcademicoDTO(List<HistorialAcademico> lista);

    // Mapear entidad HistorialAcademico a DTO HistorialAcademico
    HistorialAcademicoDTO historialAcademicoAHistorialAcademicoDTO(HistorialAcademico historial);

    // Mapear DTO de creación a entidad HistorialAcademico
    HistorialAcademico historialAcademicoCreateDTOAHistorialAcademico(HistorialAcademicoCreateDTO historialCreateDTO);

    // Mapear DTO de actualización a entidad HistorialAcademico
    HistorialAcademico historialAcademicoUpdateDTOAHistorialAcademico(HistorialAcademicoUpdateDTO historialUpdateDTO);
}
