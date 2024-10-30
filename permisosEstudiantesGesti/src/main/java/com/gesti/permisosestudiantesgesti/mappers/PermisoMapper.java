package com.gesti.permisosestudiantesgesti.mappers;

import com.gesti.permisosestudiantesgesti.dtos.PermisoCreateDTO;
import com.gesti.permisosestudiantesgesti.dtos.PermisoDTO;
import com.gesti.permisosestudiantesgesti.dtos.PermisoUpdateDTO;
import com.gesti.permisosestudiantesgesti.model.Permiso;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PermisoMapper {

    PermisoMapper instancia = Mappers.getMapper(PermisoMapper.class);

    List<PermisoDTO> listaPermisoAListaPermisoDTO(List<Permiso> lista);

    PermisoDTO permisoAPermisoDTO(Permiso permiso);

    Permiso permisoCreateDTOAPermiso(PermisoCreateDTO permisoCreateDTO);

    Permiso permisoUpdateDTOAPermiso(PermisoUpdateDTO permisoUpdateDTO);
}
