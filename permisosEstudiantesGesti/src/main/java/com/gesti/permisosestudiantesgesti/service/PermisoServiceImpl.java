package com.gesti.permisosestudiantesgesti.service;

import com.gesti.permisosestudiantesgesti.dtos.PermisoCreateDTO;
import com.gesti.permisosestudiantesgesti.dtos.PermisoDTO;
import com.gesti.permisosestudiantesgesti.dtos.PermisoUpdateDTO;
import com.gesti.permisosestudiantesgesti.mappers.PermisoMapper;
import com.gesti.permisosestudiantesgesti.model.Permiso;
import com.gesti.permisosestudiantesgesti.repository.PermisoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PermisoServiceImpl implements PermisoService {

    private final PermisoRepository permisoRepository;

    @Override
    public List<PermisoDTO> listarPermisosPorIdEstudiante(long estudianteId) {
        return PermisoMapper.instancia.listaPermisoAListaPermisoDTO(permisoRepository.findAllByIdEstudiante(estudianteId));
    }

    @Override
    public PermisoDTO obtenerPermisoPorID(long id) {
        return permisoRepository.findById(id)
                .map(PermisoMapper.instancia::permisoAPermisoDTO)
                .orElseThrow(() -> new RuntimeException("Permiso no encontrado con ID " + id));
    }

    @Override
    public PermisoDTO registrarPermiso(PermisoCreateDTO permisoCreateDTO) {
        Permiso permiso = PermisoMapper.instancia.permisoCreateDTOAPermiso(permisoCreateDTO);
        Permiso respuestaEntity = permisoRepository.save(permiso);
        return PermisoMapper.instancia.permisoAPermisoDTO(respuestaEntity);
    }

    @Override
    public PermisoDTO actualizarPermiso(PermisoUpdateDTO permisoUpdateDTO) {
        Permiso permiso = PermisoMapper.instancia.permisoUpdateDTOAPermiso(permisoUpdateDTO);
        Permiso respuestaEntity = permisoRepository.save(permiso);
        return PermisoMapper.instancia.permisoAPermisoDTO(respuestaEntity);
    }

    @Override
    public String eliminarPermiso(long id) {
        if (permisoRepository.existsById(id)) {
            permisoRepository.deleteById(id);
            return "Permiso con ID " + id + " ha sido eliminado correctamente";
        } else {
            return "No se puede eliminar el registro. ID no encontrado: " + id;
        }
    }
}
