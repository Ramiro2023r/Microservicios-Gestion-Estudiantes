package com.gesti.orquestadorgesti.feingClient;


import com.gesti.orquestadorgesti.dtos.PermisoCreateDTO;
import com.gesti.orquestadorgesti.dtos.PermisoDTO;
import com.gesti.orquestadorgesti.dtos.PermisoUpdateDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name="permisos-api", url ="http://localhost:8083/api")
public interface PermisoFeignClient {
    @GetMapping("/permisos/estudiantes/{estudianteId}")
    List<PermisoDTO> listarPermisosPorIdEmpleado(@PathVariable("estudianteId")  long estudianteId);
    @GetMapping("/permisos/{permisoId}")
    PermisoDTO obtenerPermisoPorID(@PathVariable("permisoId") long permisoId);
    @PostMapping("/permisos")
    PermisoDTO registrarPermisos(@RequestBody PermisoCreateDTO permisoCreateDTO);
    @PutMapping("/permisos")
    PermisoDTO actualizarPermisos(@RequestBody PermisoUpdateDTO permisoUpdateDTO);

    @DeleteMapping("/permisos/{permisoId}")
    PermisoDTO eliminarPermiso(@PathVariable("permisoId") long permisoId);
}
