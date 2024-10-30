package com.gesti.institucionesgesti.service;

import com.gesti.institucionesgesti.model.Institucion;
import com.gesti.institucionesgesti.repository.InstitucionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
@RequiredArgsConstructor
public class InstitucionServiceImpl implements InstitucionService{

    private final InstitucionRepository institucionRepository;
    @Override
    public Optional<Institucion> buscarPorRuc(String ruc) {
        return institucionRepository.findByRuc(ruc);
    }


    @Override
    public Optional<Institucion> buscarPorId(Long id) {
        return institucionRepository.findById(id);
    }

}
