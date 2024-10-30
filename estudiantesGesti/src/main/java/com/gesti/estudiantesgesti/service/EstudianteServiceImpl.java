package com.gesti.estudiantesgesti.service;

import com.gesti.estudiantesgesti.dtos.EstudianteCreateDTO;
import com.gesti.estudiantesgesti.dtos.EstudianteDTO;
import com.gesti.estudiantesgesti.dtos.EstudianteUpdateDTO;
import com.gesti.estudiantesgesti.mappers.EstudianteMapper;
import com.gesti.estudiantesgesti.model.Estudiante;
import com.gesti.estudiantesgesti.repository.EstudianteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EstudianteServiceImpl implements EstudianteService {

    private final EstudianteRepository estudianteRepository;

    @Override
    public List<EstudianteDTO> listarEstudiantes() {
        return EstudianteMapper.instancia.listaEstudianteAListaEstudianteDTO(estudianteRepository.findAll());
    }

    @Override
    public EstudianteDTO obtenerEstudiantePorID(long id) {
        return estudianteRepository.findById(id)
                .map(EstudianteMapper.instancia::estudianteAEstudianteDTO)
                .orElseThrow(() -> new RuntimeException("Estudiante no encontrado con ID: " + id));
    }

    @Override
    public EstudianteDTO registrarEstudiante(EstudianteCreateDTO estudianteCreateDTO) {
        Estudiante estudiante = EstudianteMapper.instancia.estudianteCreateAEstudiante(estudianteCreateDTO);
        Estudiante respuesta = estudianteRepository.save(estudiante);
        return EstudianteMapper.instancia.estudianteAEstudianteDTO(respuesta);
    }

    @Override
    public EstudianteDTO actualizarEstudiante(EstudianteUpdateDTO estudianteUpdateDTO) {
        Estudiante estudiante = EstudianteMapper.instancia.estudianteUpdateAEstudiante(estudianteUpdateDTO);
        Estudiante respuesta = estudianteRepository.save(estudiante);
        return EstudianteMapper.instancia.estudianteAEstudianteDTO(respuesta);
    }

    @Override
    public String eliminarEstudiante(long id) {
        if (estudianteRepository.existsById(id)) {
            estudianteRepository.deleteById(id);
            return "Estudiante con ID " + id + " ha sido eliminado correctamente";
        } else {
            return "No se puede eliminar el estudiante. ID no encontrado: " + id;
        }
    }
}
