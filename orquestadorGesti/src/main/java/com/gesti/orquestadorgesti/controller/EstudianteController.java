package com.gesti.orquestadorgesti.controller;


import com.gesti.orquestadorgesti.dtos.EstudianteCreateDTO;
import com.gesti.orquestadorgesti.dtos.EstudianteDTO;
import com.gesti.orquestadorgesti.dtos.EstudianteUpdateDTO;
import com.gesti.orquestadorgesti.service.EstudianteService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class EstudianteController {
    private final EstudianteService estudianteService;
    @Operation(summary = "Endpoint que permite listar los estudiantes",
            description = "Endpoint que permite listar los estudiantes")

    @GetMapping("estudiantes")
    public ResponseEntity<List<EstudianteDTO>> listarEstudiantes() {
        return new ResponseEntity<>(estudianteService.listarEstudiantes(), HttpStatus.OK);
    }
    @Operation(summary = "Endpoint que permite listar los estudiantes por ID",
            description = "Endpoint que permite listar los estudiantes por ID")
    @GetMapping("estudiantes/{estudianteId}")
    public ResponseEntity<EstudianteDTO> obtenerEstudiantePorId(@PathVariable("estudianteId") long estudianteId) {
        return new ResponseEntity<>(estudianteService.obtenerEstudiantePorID(estudianteId), HttpStatus.OK);
    }
    @Operation(summary = "Endpoint que permite registar los estudiantes",
            description = "Endpoint que permite registrar los estudiantes")
    @PostMapping("estudiantes")
    public ResponseEntity<EstudianteDTO> registrarEstudiante(@RequestBody EstudianteCreateDTO estudianteCreateDTO) {
        return new ResponseEntity<>(estudianteService.registrarEstudiante(estudianteCreateDTO), HttpStatus.CREATED);
    }
    @Operation(summary = "Endpoint que permite actualizar los estudiantes",
            description = "Endpoint que permite actualizar los estudiantes")
    @PutMapping("estudiantes")
    public ResponseEntity<EstudianteDTO> actualizarEstudiante(@RequestBody EstudianteUpdateDTO estudianteUpdateDTO) {
        return new ResponseEntity<>(estudianteService.actualizarEstudiante(estudianteUpdateDTO), HttpStatus.OK);
    }
    @Operation(summary = "Endpoint que permite eliminar los estudiantes",
            description = "Endpoint que permite eliminar los estudiantes")
    @DeleteMapping("estudiantes/{estudianteId}")
    public ResponseEntity<String> eliminarEstudiante(@PathVariable("estudianteId") long estudianteId) {
        return new ResponseEntity<>(estudianteService.eliminarEstudiante(estudianteId), HttpStatus.OK);
    }
}
