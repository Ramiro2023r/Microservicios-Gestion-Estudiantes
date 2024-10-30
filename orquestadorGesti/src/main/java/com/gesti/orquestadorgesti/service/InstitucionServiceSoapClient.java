package com.gesti.orquestadorgesti.service;


import com.gesti.orquestadorgesti.dtos.GetInstitucionResponse;

public interface InstitucionServiceSoapClient {

    GetInstitucionResponse getInstitucionPorRuc(String ruc);
    GetInstitucionResponse getInstitucionPoId(long id);
}
