package com.gesti.orquestadorgesti.controller;


import com.gesti.orquestadorgesti.dtos.GetInstitucionResponse;
import com.gesti.orquestadorgesti.service.InstitucionServiceSoapClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/institucion")
@RequiredArgsConstructor
public class InstitucionController {
    private final InstitucionServiceSoapClient institucionServiceSoapClient;


    @GetMapping("/ruc/{ruc}")
    public GetInstitucionResponse getInstitucionPorRuc(@PathVariable String ruc) {
        return institucionServiceSoapClient.getInstitucionPorRuc(ruc);
    }
    @GetMapping("/id/{id}")
    public GetInstitucionResponse getInstitucionPorId(@PathVariable long id) {
        return institucionServiceSoapClient.getInstitucionPoId(id);
    }
}
