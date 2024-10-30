package com.gesti.buscarinstitucion.dtos;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;


@XmlRootElement(name = "institucion", namespace = "http://example.com/soap")
@Setter
@Getter
@XmlAccessorType(XmlAccessType.FIELD)
public class Institucion {

    @XmlElement(name = "ruc", namespace = "http://example.com/soap")
    private String ruc; // Número de identificación fiscal

    @XmlElement(name = "codigo", namespace = "http://example.com/soap")
    private String codigo; // Código único para la institución

    @XmlElement(name = "nombre", namespace = "http://example.com/soap")
    private String nombre; // Nombre de la institución

    @XmlElement(name = "direccion", namespace = "http://example.com/soap")
    private String direccion; // Dirección de la institución

    @XmlElement(name = "telefono", namespace = "http://example.com/soap")
    private String telefono; // Número de teléfono de contacto

    @XmlElement(name = "tipo", namespace = "http://example.com/soap")
    private String tipo; // Puede ser pública, privada, etc.

    @XmlElement(name = "email", namespace = "http://example.com/soap")
    private String email; // Correo electrónico de contacto

    @XmlElement(name = "anioFundacion", namespace = "http://example.com/soap")
    private Integer anioFundacion; // Año de fundación

    @XmlElement(name = "sitioWeb", namespace = "http://example.com/soap")
    private String sitioWeb; // Sitio web de la institución

    @XmlElement(name = "encargado", namespace = "http://example.com/soap")
    private String encargado; // Nombre de la persona encargada o director

    @XmlElement(name = "nivelEducativo", namespace = "http://example.com/soap")
    private String nivelEducativo; // Nivel educativo (primaria, secundaria, universidad, etc.)

    @XmlElement(name = "pais", namespace = "http://example.com/soap")
    private String pais; // País donde se ubica la institución

    @XmlElement(name = "estado", namespace = "http://example.com/soap")
    private String estado; // Estado de la institución (activo, inactivo)
}
