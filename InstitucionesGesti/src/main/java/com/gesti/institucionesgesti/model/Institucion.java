package com.gesti.institucionesgesti.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "instituciones")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Institucion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String ruc; // Número de identificación fiscal

    @Column(nullable = false, unique = true)
    private String codigo; // Código único para la institución

    @Column(nullable = false)
    private String nombre;

    private String direccion;

    private String telefono; // Número de teléfono de contacto

    private String tipo; // Puede ser pública, privada, etc.

    @Column(nullable = false)
    private String email; // Correo electrónico de contacto

    @Column(nullable = false)
    private Integer anioFundacion; // Año de fundación

    private String sitioWeb; // Sitio web de la institución

    private String encargado; // Nombre de la persona encargada o director

    private String nivelEducativo; // Nivel educativo (primaria, secundaria, universidad, etc.)

    private String pais; // País donde se ubica la institución

    private String estado; // Estado de la institución (activo, inactivo)
}
