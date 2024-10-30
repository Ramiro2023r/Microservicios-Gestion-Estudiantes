package com.gesti.estudiantesgesti.mappers;



import com.gesti.estudiantesgesti.dtos.EstudianteCreateDTO;
import com.gesti.estudiantesgesti.dtos.EstudianteDTO;
import com.gesti.estudiantesgesti.dtos.EstudianteUpdateDTO;
import com.gesti.estudiantesgesti.model.Estudiante;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface EstudianteMapper {

    EstudianteMapper instancia = Mappers.getMapper(EstudianteMapper.class);

    EstudianteDTO estudianteAEstudianteDTO(Estudiante estudiante);
    Estudiante estudianteDTOAEstudiante(EstudianteDTO estudianteDTO);
    Estudiante estudianteCreateAEstudiante(EstudianteCreateDTO estudianteCreateDTO);
    Estudiante estudianteUpdateAEstudiante(EstudianteUpdateDTO estudianteUpdateDTO);
    List<EstudianteDTO> listaEstudianteAListaEstudianteDTO(List<Estudiante> listaEstudiante);
}