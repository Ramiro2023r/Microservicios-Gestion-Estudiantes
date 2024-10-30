package com.gesti.estudiantesgesti.service;

import com.gesti.estudiantesgesti.dtos.EstudianteCreateDTO;
import com.gesti.estudiantesgesti.dtos.EstudianteDTO;
import com.gesti.estudiantesgesti.dtos.EstudianteUpdateDTO;

import java.util.List;

public interface EstudianteService {
    List<EstudianteDTO> listarEstudiantes();
    EstudianteDTO obtenerEstudiantePorID(long id);
    EstudianteDTO registrarEstudiante(EstudianteCreateDTO estudianteCreateDTO);
    EstudianteDTO actualizarEstudiante(EstudianteUpdateDTO estudianteUpdateDTO);
    String eliminarEstudiante(long id);
}
