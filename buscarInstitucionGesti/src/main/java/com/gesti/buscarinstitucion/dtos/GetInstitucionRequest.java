package com.gesti.buscarinstitucion.dtos;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "getInstitucionRequest", namespace = "http://example.com/soap")
@Getter
@Setter
public class GetInstitucionRequest {

    @XmlElement(name = "ruc", namespace = "http://example.com/soap", required = true)
    private String ruc; // RUC de la institución



    // Puedes agregar otros campos si es necesario, como el código de la institución.
}
