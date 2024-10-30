package com.gesti.orquestadorgesti.service;


import com.gesti.orquestadorgesti.dtos.GetInstitucionResponse;
import com.gesti.orquestadorgesti.feingClient.InstitucionFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InstitucionServiceSoapClientImpl implements InstitucionServiceSoapClient {

    private final InstitucionFeignClient institucionFeignClient;
    @Override
    public GetInstitucionResponse getInstitucionPorRuc(String ruc) {
        return institucionFeignClient.getInstitucionPorRuc(ruc);
    }

    @Override
    public GetInstitucionResponse getInstitucionPoId(long id) {
        return institucionFeignClient.getInstitucionPorId(id);
    }
}
