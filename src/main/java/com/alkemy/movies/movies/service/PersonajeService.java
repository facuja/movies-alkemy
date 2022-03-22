package com.alkemy.movies.movies.service;

import com.alkemy.movies.movies.dto.GetPersonajeDTO;
import com.alkemy.movies.movies.dto.PersonajeDTO;

import java.util.List;
import java.util.Set;

public interface PersonajeService {

    PersonajeDTO save(PersonajeDTO dto);

    List<GetPersonajeDTO> getAllPersonajes();

    /*List<PersonajeDTO> getByFilters(String nombre, Long edad, Set<Long> peliculas);*/

}
