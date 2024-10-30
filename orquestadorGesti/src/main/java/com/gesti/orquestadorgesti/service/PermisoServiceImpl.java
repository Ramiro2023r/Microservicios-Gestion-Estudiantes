package com.gesti.orquestadorgesti.service;


import com.gesti.orquestadorgesti.dtos.PermisoCreateDTO;
import com.gesti.orquestadorgesti.dtos.PermisoDTO;
import com.gesti.orquestadorgesti.dtos.PermisoUpdateDTO;
import com.gesti.orquestadorgesti.feingClient.PermisoFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PermisoServiceImpl implements PermisoService{

    private final PermisoFeignClient permisoFeingClient;
    @Override
    public List<PermisoDTO> listarPermisosPorIdEstudiante(long estudianteId) {
        return permisoFeingClient.listarPermisosPorIdEmpleado(estudianteId);
    }

    @Override
    public PermisoDTO obtenerPermisoPorID(long id) {
      return   permisoFeingClient.obtenerPermisoPorID(id);
    }

    @Override
    public PermisoDTO registrarPermiso(PermisoCreateDTO permisoCreateDTO) {
        return permisoFeingClient.registrarPermisos(permisoCreateDTO);
    }

    @Override
    public PermisoDTO actualizarPermiso(PermisoUpdateDTO permisoUpdateDTO) {
        return permisoFeingClient.actualizarPermisos(permisoUpdateDTO);
    }

    @Override
    public String eliminarPermiso(long id) {
        permisoFeingClient.eliminarPermiso(id);
        return "Permiso eliminado exitosamente.";
    }
}
