package com.gesti.orquestadorgesti.service;

import com.gesti.orquestadorgesti.dtos.EstudianteBusquedaDTO;

public interface BusquedaService {

    EstudianteBusquedaDTO busquedaEstudiantePorID(long id);
}
