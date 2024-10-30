package com.gesti.historialacademicogesti.repository;


import com.gesti.historialacademicogesti.model.HistorialAcademico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistorialAcademicoRepository extends JpaRepository<HistorialAcademico, Long> {
    List<HistorialAcademico> findAllByIdEstudiante(long id);
}
