package com.gesti.permisosestudiantesgesti.controller;

import com.gesti.permisosestudiantesgesti.dtos.PermisoCreateDTO;
import com.gesti.permisosestudiantesgesti.dtos.PermisoDTO;
import com.gesti.permisosestudiantesgesti.dtos.PermisoUpdateDTO;
import com.gesti.permisosestudiantesgesti.service.PermisoService;
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

    @GetMapping("/permisos/estudiantes/{estudianteId}")
    public ResponseEntity<List<PermisoDTO>> listarPermisosPorIdEstudiante(@PathVariable("estudianteId") long estudianteId) {
        return new ResponseEntity<>(permisoService.listarPermisosPorIdEstudiante(estudianteId), HttpStatus.OK);
    }

    @GetMapping("/permisos/{permisoId}")
    public ResponseEntity<PermisoDTO> obtenerPermisoPorID(@PathVariable("permisoId") long permisoId) {
        return new ResponseEntity<>(permisoService.obtenerPermisoPorID(permisoId), HttpStatus.OK);
    }

    @PostMapping("permisos")
    public ResponseEntity<PermisoDTO> registrarPermiso(@RequestBody PermisoCreateDTO permisoCreateDTO) {
        return new ResponseEntity<>(permisoService.registrarPermiso(permisoCreateDTO), HttpStatus.CREATED);
    }

    @PutMapping("permisos")
    public ResponseEntity<PermisoDTO> actualizarPermiso(@RequestBody PermisoUpdateDTO permisoUpdateDTO) {
        return new ResponseEntity<>(permisoService.actualizarPermiso(permisoUpdateDTO), HttpStatus.OK);
    }

    @DeleteMapping("/permisos/{permisoId}")
    public ResponseEntity<String> eliminarPermiso(@PathVariable("permisoId") long permisoId) {
        return new ResponseEntity<>(permisoService.eliminarPermiso(permisoId), HttpStatus.OK);
    }
}
