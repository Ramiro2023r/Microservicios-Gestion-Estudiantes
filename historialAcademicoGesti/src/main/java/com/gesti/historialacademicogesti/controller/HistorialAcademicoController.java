package com.gesti.historialacademicogesti.controller;

import com.gesti.historialacademicogesti.dtos.HistorialAcademicoCreateDTO;
import com.gesti.historialacademicogesti.dtos.HistorialAcademicoDTO;
import com.gesti.historialacademicogesti.dtos.HistorialAcademicoUpdateDTO;
import com.gesti.historialacademicogesti.service.HistorialAcademicoService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class HistorialAcademicoController {

    private final HistorialAcademicoService historialAcademicoService;

    @Operation(summary = "Endpoint que permite listar los Historial Academico por Id Estudiante",
            description = "Endpoint que permite listar los Historial Academico por Id Estudiante")

    @GetMapping("/historiales/estudiantes/{estudianteId}")
    public ResponseEntity<List<HistorialAcademicoDTO>> listarHistorialAcademicoPorIdEstudiante(@PathVariable("estudianteId") long estudianteId) {
        return new ResponseEntity<>(historialAcademicoService.listarHistorialAcademicoPorIdEstudiante(estudianteId), HttpStatus.OK);
    }
    @Operation(summary = "Endpoint que permite obtener un Historial Academico por Id ",
            description = "Endpoint que permite obtener un Historial Academico por Id ")
    @GetMapping("/historiales/{historialId}")
    public ResponseEntity<HistorialAcademicoDTO> obtenerHistorialAcademicoPorId(@PathVariable("historialId") long historialId) {
        return new ResponseEntity<>(historialAcademicoService.obtenerHistorialAcademicoPorID(historialId), HttpStatus.OK);
    }

    @Operation(summary = "Endpoint que permite registrar un Historial Academico  ",
            description = "Endpoint que permite registrar un Historial Academico  ")
    @PostMapping("historiales")
    public ResponseEntity<HistorialAcademicoDTO> registrarHistorialAcademico(@RequestBody HistorialAcademicoCreateDTO historialAcademicoCreateDTO) {
        return new ResponseEntity<>(historialAcademicoService.registrarHistorialAcademico(historialAcademicoCreateDTO), HttpStatus.OK);
    }

    @Operation(summary = "Endpoint que permite actualizar los Historial Academico por Id ",
            description = "Endpoint que permite actualizar los Historial Academico por Id ")

    @PutMapping("historiales")
    public ResponseEntity<HistorialAcademicoDTO> actualizarHistorialAcademico(@RequestBody HistorialAcademicoUpdateDTO historialAcademicoUpdateDTO) {
        return new ResponseEntity<>(historialAcademicoService.actualizarHistorialAcademico(historialAcademicoUpdateDTO), HttpStatus.OK);
    }
    @Operation(summary = "Endpoint que permite eliminar los Historial Academico por Id ",
            description = "Endpoint que permite eliminar los Historial Academico por Id ")
    @DeleteMapping("/historiales/{historialId}")
    public ResponseEntity<String> eliminarHistorialAcademico(@PathVariable("historialId") long historialId) {
        return new ResponseEntity<>(historialAcademicoService.eliminarHistorialAcademico(historialId), HttpStatus.OK);
    }
}
