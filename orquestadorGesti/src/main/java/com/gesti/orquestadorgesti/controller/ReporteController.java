package com.gesti.orquestadorgesti.controller;


import com.gesti.orquestadorgesti.service.ReporteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ReporteController {

    private final ReporteService reporteService;


    @GetMapping("/reportes/estudiantes/{estudianteId}")
    public ResponseEntity<String> obtenerReportePorEmpleadoId(@PathVariable("estudianteId") long estudianteId){
        return new ResponseEntity<>(reporteService.obtenerReportePorEstudianteId(estudianteId), HttpStatus.OK);
    }
}
