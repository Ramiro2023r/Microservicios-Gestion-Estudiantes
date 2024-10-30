package com.gesti.historialacademicogesti.service;

import com.gesti.historialacademicogesti.dtos.HistorialAcademicoCreateDTO;
import com.gesti.historialacademicogesti.dtos.HistorialAcademicoDTO;
import com.gesti.historialacademicogesti.dtos.HistorialAcademicoUpdateDTO;
import com.gesti.historialacademicogesti.mappers.HistorialAcademicoMapper;
import com.gesti.historialacademicogesti.model.HistorialAcademico;
import com.gesti.historialacademicogesti.repository.HistorialAcademicoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HistorialAcademicoServiceImpl implements HistorialAcademicoService {

    private final HistorialAcademicoRepository historialAcademicoRepository;

    @Override
    public List<HistorialAcademicoDTO> listarHistorialAcademicoPorIdEstudiante(long estudianteId) {
        return HistorialAcademicoMapper.instancia
                .listaHistorialAcademicoAListaHistorialAcademicoDTO(historialAcademicoRepository.findAllByIdEstudiante(estudianteId));
    }

    @Override
    public HistorialAcademicoDTO obtenerHistorialAcademicoPorID(long id) {
        return historialAcademicoRepository.findById(id)
                .map(HistorialAcademicoMapper.instancia::historialAcademicoAHistorialAcademicoDTO)
                .orElseThrow(() -> new RuntimeException("Historial académico no encontrado con ID:" + id));
    }

    @Override
    public HistorialAcademicoDTO registrarHistorialAcademico(HistorialAcademicoCreateDTO historialCreateDTO) {
        HistorialAcademico historia = HistorialAcademicoMapper.instancia.historialAcademicoCreateDTOAHistorialAcademico(historialCreateDTO);
        HistorialAcademico respuestaEntity = historialAcademicoRepository.save(historia);
        return HistorialAcademicoMapper.instancia.historialAcademicoAHistorialAcademicoDTO(respuestaEntity);
    }

    @Override
    public HistorialAcademicoDTO actualizarHistorialAcademico(HistorialAcademicoUpdateDTO historialUpdateDTO) {
        HistorialAcademico historia = HistorialAcademicoMapper.instancia.historialAcademicoUpdateDTOAHistorialAcademico(historialUpdateDTO);
        HistorialAcademico respuestaEntity = historialAcademicoRepository.save(historia);
        return HistorialAcademicoMapper.instancia.historialAcademicoAHistorialAcademicoDTO(respuestaEntity);
    }

    @Override
    public String eliminarHistorialAcademico(long id) {
        if (historialAcademicoRepository.existsById(id)) {
            historialAcademicoRepository.deleteById(id);
            return "Historial Académico con ID " + id + " ha sido eliminado correctamente";
        } else {
            return "No se puede eliminar el Historial Académico. ID no encontrado: " + id;
        }
    }
}

