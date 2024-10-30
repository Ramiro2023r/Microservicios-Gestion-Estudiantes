package com.gesti.institucionesgesti.service;

import com.gesti.institucionesgesti.model.Institucion;

import java.util.Optional;

public interface InstitucionService {
    Optional<Institucion> buscarPorRuc(String ruc) ;
    Optional<Institucion> buscarPorId(Long id) ;
}
