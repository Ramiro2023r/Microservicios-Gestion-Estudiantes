package com.gesti.institucionesgesti.repository;

import com.gesti.institucionesgesti.model.Institucion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InstitucionRepository extends JpaRepository<Institucion,Long> {

    Optional<Institucion> findByRuc(String ruc);
}
