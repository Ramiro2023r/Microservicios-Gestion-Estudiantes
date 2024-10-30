package com.gesti.estudiantesgesti.repository;

import com.gesti.estudiantesgesti.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository  extends JpaRepository<Estudiante, Long> {
}
