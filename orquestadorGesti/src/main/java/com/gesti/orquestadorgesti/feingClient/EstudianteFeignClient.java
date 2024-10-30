package com.gesti.orquestadorgesti.feingClient;


import com.gesti.orquestadorgesti.dtos.EstudianteCreateDTO;
import com.gesti.orquestadorgesti.dtos.EstudianteDTO;
import com.gesti.orquestadorgesti.dtos.EstudianteUpdateDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name="estudiantes-api", url ="http://localhost:8081/api")
public interface EstudianteFeignClient {
    @GetMapping("/estudiantes")
    List<EstudianteDTO> listarEstudiantes();

    @GetMapping("/estudiantes/{estudianteId}")
    EstudianteDTO obtenerEstudiantePorId(@PathVariable("estudianteId") long estudianteId);

    @PostMapping("/estudiantes")
    EstudianteDTO registrarEstudiante(EstudianteCreateDTO estudianteCreateDTO);

    @PutMapping("/estudiantes")
    EstudianteDTO actualizarEstudiante(EstudianteUpdateDTO estudianteUpdateDTO);

    @DeleteMapping("/estudiantes/{estudianteId}")
    EstudianteDTO eliminarEstudiante(@PathVariable("estudianteId") long estudianteId);
}
