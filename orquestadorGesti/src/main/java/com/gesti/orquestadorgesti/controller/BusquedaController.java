package com.gesti.orquestadorgesti.controller;


import com.gesti.orquestadorgesti.dtos.EstudianteBusquedaDTO;
import com.gesti.orquestadorgesti.service.BusquedaService;
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
public class BusquedaController {
    private final BusquedaService busquedaService;


    @GetMapping("/busquedas/estudiantes/{estudianteId}")
    public ResponseEntity<EstudianteBusquedaDTO> buscarEstudiantePorId(@PathVariable("estudianteId") long estudianteId){
        return new ResponseEntity<>(busquedaService.busquedaEstudiantePorID(estudianteId), HttpStatus.OK);
    }
}
