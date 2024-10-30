package com.gesti.buscarinstitucion.controller;


import com.gesti.buscarinstitucion.dtos.GetInstitucionResponse;
import com.gesti.buscarinstitucion.service.InstitucionServiceSoapClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/institucion")
@RequiredArgsConstructor
public class InstitucionRestController {

    private final InstitucionServiceSoapClient institucionServiceSoapClient;

    @GetMapping("/ruc/{ruc}")
    public GetInstitucionResponse getInstitucion(@PathVariable String ruc) {
        return institucionServiceSoapClient.getInstitucionPorRuc(ruc);
    }


    @GetMapping("/id/{id}")
    public GetInstitucionResponse getEmpresaPorId(@PathVariable long id) {
        return institucionServiceSoapClient.getInstitucionPorId(id);
    }


}
