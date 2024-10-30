package com.gesti.orquestadorgesti.dtos;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EstudianteBusquedaDTO {

    private EstudianteDTO estudiante;
    private List<HistorialAcademicoDTO> historialAcademico;
    private List<PermisoDTO> permiso;
}
