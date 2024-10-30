package com.gesti.buscarinstitucion.service;

import com.gesti.buscarinstitucion.dtos.GetInstitucionResponse;

public interface InstitucionServiceSoapClient {

    GetInstitucionResponse getInstitucionPorRuc(String ruc);
    GetInstitucionResponse getInstitucionPorId(long id);
}
