package com.gesti.orquestadorgesti.service;



import com.gesti.orquestadorgesti.dtos.PermisoCreateDTO;
import com.gesti.orquestadorgesti.dtos.PermisoDTO;
import com.gesti.orquestadorgesti.dtos.PermisoUpdateDTO;

import java.util.List;

public interface PermisoService {
    List<PermisoDTO> listarPermisosPorIdEstudiante(long estudianteId);
    PermisoDTO obtenerPermisoPorID(long id);
    PermisoDTO registrarPermiso(PermisoCreateDTO permisoCreateDTO);
    PermisoDTO actualizarPermiso(PermisoUpdateDTO permisoUpdateDTO);
    String eliminarPermiso(long id);
}
