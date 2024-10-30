package com.gesti.orquestadorgesti.service;


import com.gesti.orquestadorgesti.dtos.EstudianteCreateDTO;
import com.gesti.orquestadorgesti.dtos.EstudianteDTO;
import com.gesti.orquestadorgesti.dtos.EstudianteUpdateDTO;
import com.gesti.orquestadorgesti.feingClient.EstudianteFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EstudianteServiceImpl implements EstudianteService {
    private final EstudianteFeignClient estudianteFeignClient;
    @Override
    public List<EstudianteDTO> listarEstudiantes() {
        return estudianteFeignClient.listarEstudiantes();
    }

    @Override
    public EstudianteDTO obtenerEstudiantePorID(long id) {
        return estudianteFeignClient.obtenerEstudiantePorId(id);
    }

    @Override
    public EstudianteDTO registrarEstudiante(EstudianteCreateDTO estudianteCreateDTO) {
        return estudianteFeignClient.registrarEstudiante(estudianteCreateDTO);
    }

    @Override
    public EstudianteDTO actualizarEstudiante(EstudianteUpdateDTO estudianteUpdateDTO) {
        return estudianteFeignClient.actualizarEstudiante(estudianteUpdateDTO);
    }

    @Override
    public String eliminarEstudiante(long id) {
        estudianteFeignClient.eliminarEstudiante(id);
        return "Estudiante eliminado exitosamente.";
    }
}
