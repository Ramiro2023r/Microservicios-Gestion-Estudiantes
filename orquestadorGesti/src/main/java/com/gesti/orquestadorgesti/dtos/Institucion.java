package com.gesti.orquestadorgesti.dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Institucion {
    private String ruc; // Número de identificación fiscal
    private String codigo; // Código único para la institución
    private String nombre;
    private String direccion;
    private String telefono; // Número de teléfono de contacto
    private String tipo; // Puede ser pública, privada, etc.
    private String email; // Correo electrónico de contacto
    private Integer anioFundacion; // Año de fundación
    private String sitioWeb; // Sitio web de la institución
    private String encargado; // Nombre de la persona encargada o director
    private String nivelEducativo; // Nivel educativo (primaria, secundaria, universidad, etc.)
    private String pais; // País donde se ubica la institución
    private String estado; // Estado de la institución (activo, inactivo)
}
