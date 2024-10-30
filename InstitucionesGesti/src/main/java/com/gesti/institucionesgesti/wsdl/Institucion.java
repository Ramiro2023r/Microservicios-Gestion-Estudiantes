package com.gesti.institucionesgesti.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "institucion", namespace = "http://example.com/soap")
@Setter
@Getter
public class Institucion {

    @XmlElement(namespace = "http://example.com/soap", required = true)
    private String ruc; // Número de identificación fiscal

    @XmlElement(namespace = "http://example.com/soap", required = true)
    private String codigo; // Código único para la institución

    @XmlElement(namespace = "http://example.com/soap", required = true)
    private String nombre; // Nombre de la institución

    @XmlElement(namespace = "http://example.com/soap")
    private String direccion; // Dirección de la institución

    @XmlElement(namespace = "http://example.com/soap")
    private String telefono; // Número de teléfono de contacto

    @XmlElement(namespace = "http://example.com/soap")
    private String tipo; // Puede ser pública, privada, etc.

    @XmlElement(namespace = "http://example.com/soap", required = true)
    private String email; // Correo electrónico de contacto

    @XmlElement(namespace = "http://example.com/soap", required = true)
    private Integer anioFundacion; // Año de fundación

    @XmlElement(namespace = "http://example.com/soap")
    private String sitioWeb; // Sitio web de la institución

    @XmlElement(namespace = "http://example.com/soap")
    private String encargado; // Nombre de la persona encargada o director

    @XmlElement(namespace = "http://example.com/soap")
    private String nivelEducativo; // Nivel educativo (primaria, secundaria, universidad, etc.)

    @XmlElement(namespace = "http://example.com/soap")
    private String pais; // País donde se ubica la institución

    @XmlElement(namespace = "http://example.com/soap")
    private String estado; // Estado de la institución (activo, inactivo)
}
