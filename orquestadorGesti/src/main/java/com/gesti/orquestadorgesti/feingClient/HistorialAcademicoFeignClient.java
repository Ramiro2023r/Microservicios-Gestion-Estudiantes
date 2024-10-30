package com.gesti.orquestadorgesti.feingClient;

import com.gesti.orquestadorgesti.dtos.HistorialAcademicoCreateDTO;
import com.gesti.orquestadorgesti.dtos.HistorialAcademicoDTO;
import com.gesti.orquestadorgesti.dtos.HistorialAcademicoUpdateDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name="historial-academico-api", url ="http://localhost:8082/api")
public interface HistorialAcademicoFeignClient {

    @GetMapping("/historiales/estudiantes/{estudianteId}")
    List<HistorialAcademicoDTO> listarHistorialAcademicoPorIdEmpleado(@PathVariable("estudianteId") long estudianteId);

    @GetMapping("/historiales/{historialId}")
    HistorialAcademicoDTO obtenerHistorialAcademicoPorId(@PathVariable("historialId") long historialId);
    @PostMapping("/historiales")
    HistorialAcademicoDTO registrarHistorialAcademico(@RequestBody HistorialAcademicoCreateDTO historialAcademicoCreateDTO);

    @PutMapping("/historiales")
    HistorialAcademicoDTO actualizarHistorialAcademico(@RequestBody HistorialAcademicoUpdateDTO historialAcademicoUpdateDTO);

    @DeleteMapping("/historiales/{historialId}")
    String eliminarHistorialAcademico(@PathVariable("historialId") long historialId);

}
