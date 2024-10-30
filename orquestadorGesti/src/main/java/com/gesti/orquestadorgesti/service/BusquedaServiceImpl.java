package com.gesti.orquestadorgesti.service;


import com.gesti.orquestadorgesti.dtos.EstudianteBusquedaDTO;
import com.gesti.orquestadorgesti.dtos.EstudianteDTO;
import com.gesti.orquestadorgesti.dtos.HistorialAcademicoDTO;
import com.gesti.orquestadorgesti.dtos.PermisoDTO;
import com.gesti.orquestadorgesti.feingClient.EstudianteFeignClient;
import com.gesti.orquestadorgesti.feingClient.HistorialAcademicoFeignClient;
import com.gesti.orquestadorgesti.feingClient.InstitucionFeignClient;
import com.gesti.orquestadorgesti.feingClient.PermisoFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
@RequiredArgsConstructor
public class BusquedaServiceImpl implements BusquedaService{

    private final EstudianteFeignClient estudianteFeignClient;
    private final InstitucionFeignClient institucionFeignClient;
    private final HistorialAcademicoFeignClient historialAcademicoFeignClient;
    private final PermisoFeignClient permisoFeignClient;

    @Override
    public EstudianteBusquedaDTO busquedaEstudiantePorID(long id) {

        CompletableFuture<EstudianteDTO> empleadoFuture =
                CompletableFuture.supplyAsync(() -> estudianteFeignClient.obtenerEstudiantePorId(id));

        CompletableFuture<List<HistorialAcademicoDTO>> historialFuture =
                CompletableFuture.supplyAsync(() -> historialAcademicoFeignClient.listarHistorialAcademicoPorIdEmpleado(id));

        CompletableFuture<List<PermisoDTO>> vacacionFuture =
                CompletableFuture.supplyAsync(() -> permisoFeignClient.listarPermisosPorIdEmpleado(id));

        CompletableFuture<Void> allFutures = CompletableFuture.allOf(empleadoFuture, historialFuture, vacacionFuture);
        allFutures.join();

        EstudianteDTO estudianteDTO = empleadoFuture.join();
        List<HistorialAcademicoDTO> historialLaboralDTO = historialFuture.join();
        List<PermisoDTO> permisoDTO = vacacionFuture.join();


        for (HistorialAcademicoDTO historial : historialLaboralDTO) {
            historial.setRazonSocial(institucionFeignClient.getInstitucionPorId(historial.getIdInstitucion()).getInstitucion().getNombre());
        }


        EstudianteBusquedaDTO estudianteBusquedaDTO = new EstudianteBusquedaDTO();
        estudianteBusquedaDTO.setEstudiante(estudianteDTO);
        estudianteBusquedaDTO.setHistorialAcademico(historialLaboralDTO);
        estudianteBusquedaDTO.setPermiso(permisoDTO);

        return estudianteBusquedaDTO;
    }
}
