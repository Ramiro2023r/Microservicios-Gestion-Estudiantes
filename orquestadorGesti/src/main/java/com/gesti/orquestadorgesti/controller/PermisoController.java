package com.gesti.orquestadorgesti.controller;


import com.gesti.orquestadorgesti.dtos.PermisoCreateDTO;
import com.gesti.orquestadorgesti.dtos.PermisoDTO;
import com.gesti.orquestadorgesti.dtos.PermisoUpdateDTO;
import com.gesti.orquestadorgesti.service.PermisoService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
@AllArgsConstructor
public class PermisoController {

    private final PermisoService permisoService;
    @Operation(summary = "Endpoint que permite listar los permisos por  Id Estudiante",
            description = "Endpoint que permite listar los permisos por  Id Estudiante")
    @GetMapping("/permisos/estudiantes/{estudianteId}")
    public ResponseEntity<List<PermisoDTO>> listarPermisosPorIdEstudiante(@PathVariable("estudianteId") long estudianteId) {
        return new ResponseEntity<>(permisoService.listarPermisosPorIdEstudiante(estudianteId), HttpStatus.OK);
    }

    @Operation(summary = "Endpoint que permite listar los permiso por  IdPermiso ",
            description = "Endpoint que permite listar los permiso por  IdPermiso ")
    @GetMapping("/permisos/{permisoId}")
    public ResponseEntity<PermisoDTO> obtenerPermisoPorID(@PathVariable("permisoId") long permisoId) {
        return new ResponseEntity<>(permisoService.obtenerPermisoPorID(permisoId), HttpStatus.OK);
    }
    @Operation(summary = "Endpoint que permite registar los permisos ",
            description = "Endpoint que permite registar los permisos")
    @PostMapping("permisos")
    public ResponseEntity<PermisoDTO> registrarPermiso(@RequestBody PermisoCreateDTO permisoCreateDTO) {
        return new ResponseEntity<>(permisoService.registrarPermiso(permisoCreateDTO), HttpStatus.CREATED);
    }
    @Operation(summary = "Endpoint que permite actualizar los permisos ",
            description = "Endpoint que permite actualizar los permisos")
    @PutMapping("permisos")
    public ResponseEntity<PermisoDTO> actualizarPermiso(@RequestBody PermisoUpdateDTO permisoUpdateDTO) {
        return new ResponseEntity<>(permisoService.actualizarPermiso(permisoUpdateDTO), HttpStatus.OK);
    }
    @Operation(summary = "Endpoint que permite Eliminar los permisos ",
            description = "Endpoint que permite Eliminar los permisos")
    @DeleteMapping("/permisos/{permisoId}")
    public ResponseEntity<String> eliminarPermiso(@PathVariable("permisoId") long permisoId) {
        return new ResponseEntity<>(permisoService.eliminarPermiso(permisoId), HttpStatus.OK);
    }
}
