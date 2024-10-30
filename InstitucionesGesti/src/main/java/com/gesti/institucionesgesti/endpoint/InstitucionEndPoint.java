package com.gesti.institucionesgesti.endpoint;

import com.gesti.institucionesgesti.model.Institucion;
import com.gesti.institucionesgesti.service.InstitucionService; // Asegúrate de tener este servicio
import com.gesti.institucionesgesti.wsdl.GetInstitucionIdRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import com.gesti.institucionesgesti.wsdl.GetInstitucionRequest;
import com.gesti.institucionesgesti.wsdl.GetInstitucionResponse;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.Optional;

@Endpoint
@RequiredArgsConstructor
public class InstitucionEndPoint {

    private static final String NAMESPACE_URI = "http://example.com/soap"; // Cambia esto según tu configuración

    private final InstitucionService institucionService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getInstitucionRequest")
    @ResponsePayload
    public GetInstitucionResponse getInstitucion(@RequestPayload GetInstitucionRequest request) {
        GetInstitucionResponse response = new GetInstitucionResponse();
        Optional<Institucion> institucionOpt = institucionService.buscarPorRuc(request.getRuc());

        institucionOpt.ifPresent(institucion -> {
            com.gesti.institucionesgesti.wsdl.Institucion soapInstitucion = new com.gesti.institucionesgesti.wsdl.Institucion();
            soapInstitucion.setRuc(institucion.getRuc());
            soapInstitucion.setCodigo(institucion.getCodigo());
            soapInstitucion.setNombre(institucion.getNombre());
            soapInstitucion.setDireccion(institucion.getDireccion());
            soapInstitucion.setTelefono(institucion.getTelefono());
            soapInstitucion.setTipo(institucion.getTipo());
            soapInstitucion.setEmail(institucion.getEmail());
            soapInstitucion.setAnioFundacion(institucion.getAnioFundacion());
            soapInstitucion.setSitioWeb(institucion.getSitioWeb());
            soapInstitucion.setEncargado(institucion.getEncargado());
            soapInstitucion.setNivelEducativo(institucion.getNivelEducativo());
            soapInstitucion.setPais(institucion.getPais());
            soapInstitucion.setEstado(institucion.getEstado());
            response.setInstitucion(soapInstitucion);
        });

        return response;
    }




    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getInstitucionIdRequest")
    @ResponsePayload
    public GetInstitucionResponse getInstitucionPorId(@RequestPayload GetInstitucionIdRequest request) {
        GetInstitucionResponse response = new GetInstitucionResponse();
        Optional<Institucion> institucionOpt = institucionService.buscarPorId(request.getId());

        institucionOpt.ifPresent(institucion -> {
            com.gesti.institucionesgesti.wsdl.Institucion soapInstitucion = new com.gesti.institucionesgesti.wsdl.Institucion();
            soapInstitucion.setRuc(institucion.getRuc());
            soapInstitucion.setCodigo(institucion.getCodigo());
            soapInstitucion.setNombre(institucion.getNombre());
            soapInstitucion.setDireccion(institucion.getDireccion());
            soapInstitucion.setTelefono(institucion.getTelefono());
            soapInstitucion.setTipo(institucion.getTipo());
            soapInstitucion.setEmail(institucion.getEmail());
            soapInstitucion.setAnioFundacion(institucion.getAnioFundacion());
            soapInstitucion.setSitioWeb(institucion.getSitioWeb());
            soapInstitucion.setEncargado(institucion.getEncargado());
            soapInstitucion.setNivelEducativo(institucion.getNivelEducativo());
            soapInstitucion.setPais(institucion.getPais());
            soapInstitucion.setEstado(institucion.getEstado());
            response.setInstitucion(soapInstitucion);
        });

        return response;
    }
}
