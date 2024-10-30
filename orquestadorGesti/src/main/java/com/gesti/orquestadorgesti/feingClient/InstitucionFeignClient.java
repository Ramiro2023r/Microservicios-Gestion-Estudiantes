package com.gesti.orquestadorgesti.feingClient;

import com.gesti.orquestadorgesti.dtos.GetInstitucionResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="buscarInstitucion-api", url ="http://localhost:8086/api")
public interface InstitucionFeignClient {
    @GetMapping("/institucion/ruc/{ruc}")
    public GetInstitucionResponse getInstitucionPorRuc(@PathVariable String ruc);
    @GetMapping("/institucion/id/{id}")
    public GetInstitucionResponse getInstitucionPorId(@PathVariable long id);


}
