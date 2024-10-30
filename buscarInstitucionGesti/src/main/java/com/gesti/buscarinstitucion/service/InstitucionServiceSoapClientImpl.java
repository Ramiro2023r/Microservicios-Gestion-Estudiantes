package com.gesti.buscarinstitucion.service;

import com.gesti.buscarinstitucion.dtos.GetInstitucionIdRequest;
import com.gesti.buscarinstitucion.dtos.GetInstitucionRequest;
import com.gesti.buscarinstitucion.dtos.GetInstitucionResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
@Service
@RequiredArgsConstructor
public class InstitucionServiceSoapClientImpl implements InstitucionServiceSoapClient {
    private final WebServiceTemplate webServiceTemplate;

    @Value("${soap.endpoint.url}")
    private String soapEndpointUrl;

    @Override
    public GetInstitucionResponse getInstitucionPorRuc(String ruc) {
        GetInstitucionRequest request = new GetInstitucionRequest();
        request.setRuc(ruc);

        // Enviamos la solicitud y recibimos la respuesta desde el servicio SOAP
        return (GetInstitucionResponse) webServiceTemplate.marshalSendAndReceive(soapEndpointUrl, request);
    }

    @Override
    public GetInstitucionResponse getInstitucionPorId(long id) {
        GetInstitucionIdRequest request = new GetInstitucionIdRequest();
        request.setId(id);
        return (GetInstitucionResponse) webServiceTemplate.marshalSendAndReceive(soapEndpointUrl, request);
    }
}
