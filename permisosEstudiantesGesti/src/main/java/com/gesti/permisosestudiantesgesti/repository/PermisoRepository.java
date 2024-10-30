package com.gesti.permisosestudiantesgesti.repository;

import com.gesti.permisosestudiantesgesti.model.Permiso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PermisoRepository extends JpaRepository<Permiso, Long> {
    List<Permiso> findAllByIdEstudiante(long idEstudiante);
}
