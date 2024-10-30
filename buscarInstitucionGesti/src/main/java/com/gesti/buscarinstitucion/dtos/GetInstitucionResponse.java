package com.gesti.buscarinstitucion.dtos;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "getInstitucionResponse", namespace = "http://example.com/soap")
@Getter
@Setter
public class GetInstitucionResponse {

    @XmlElement(name = "institucion", namespace = "http://example.com/soap")
    private Institucion institucion; // Instancia de la clase Institucion

}
