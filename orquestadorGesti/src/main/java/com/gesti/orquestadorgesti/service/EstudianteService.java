package com.gesti.orquestadorgesti.service;


import com.gesti.orquestadorgesti.dtos.EstudianteCreateDTO;
import com.gesti.orquestadorgesti.dtos.EstudianteDTO;
import com.gesti.orquestadorgesti.dtos.EstudianteUpdateDTO;

import java.util.List;

public interface EstudianteService {
    List<EstudianteDTO> listarEstudiantes();
    EstudianteDTO obtenerEstudiantePorID(long id);
    EstudianteDTO registrarEstudiante(EstudianteCreateDTO estudianteCreateDTO);
    EstudianteDTO actualizarEstudiante(EstudianteUpdateDTO estudianteUpdateDTO);
    String eliminarEstudiante(long id);
}
