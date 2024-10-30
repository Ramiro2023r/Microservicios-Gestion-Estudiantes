package com.gesti.institucionesgesti.wsdl;

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

    @XmlElement(namespace = "http://example.com/soap")
    private Institucion institucion; // Instancia de la clase Institucion

}
