package com.gesti.permisosestudiantesgesti.service;

import com.gesti.permisosestudiantesgesti.dtos.PermisoCreateDTO;

import com.gesti.permisosestudiantesgesti.dtos.PermisoDTO;
import com.gesti.permisosestudiantesgesti.dtos.PermisoUpdateDTO;

import java.util.List;

public interface PermisoService {
    List<PermisoDTO> listarPermisosPorIdEstudiante(long estudianteId);
    PermisoDTO obtenerPermisoPorID(long id);
    PermisoDTO registrarPermiso(PermisoCreateDTO permisoCreateDTO);
    PermisoDTO actualizarPermiso(PermisoUpdateDTO permisoUpdateDTO);
    String eliminarPermiso(long id);
}
