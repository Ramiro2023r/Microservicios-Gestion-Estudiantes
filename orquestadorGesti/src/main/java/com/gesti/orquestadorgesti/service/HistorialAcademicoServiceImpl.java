package com.gesti.orquestadorgesti.service;


import com.gesti.orquestadorgesti.dtos.HistorialAcademicoCreateDTO;
import com.gesti.orquestadorgesti.dtos.HistorialAcademicoDTO;
import com.gesti.orquestadorgesti.dtos.HistorialAcademicoUpdateDTO;
import com.gesti.orquestadorgesti.feingClient.HistorialAcademicoFeignClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HistorialAcademicoServiceImpl implements HistorialAcademicoService{

    private final HistorialAcademicoFeignClient historialAcademicoFeignClient;
    @Override
    public List<HistorialAcademicoDTO> listarHistorialAcademicoPorIdEstudiante(long estudianteId) {
        return historialAcademicoFeignClient.listarHistorialAcademicoPorIdEmpleado(estudianteId);
    }

    @Override
    public HistorialAcademicoDTO obtenerHistorialAcademicoPorID(long id) {
        return historialAcademicoFeignClient.obtenerHistorialAcademicoPorId(id);
    }

    @Override
    public HistorialAcademicoDTO registrarHistorialAcademico(HistorialAcademicoCreateDTO historialCreateDTO) {
        return historialAcademicoFeignClient.registrarHistorialAcademico(historialCreateDTO);
    }

    @Override
    public HistorialAcademicoDTO actualizarHistorialAcademico(HistorialAcademicoUpdateDTO historialUpdateDTO) {
        return historialAcademicoFeignClient.actualizarHistorialAcademico(historialUpdateDTO);
    }

    @Override
    public String eliminarHistorialAcademico(long id) {
        historialAcademicoFeignClient.eliminarHistorialAcademico(id);
        return "historial academico eliminado exitosamente.";
    }
}
