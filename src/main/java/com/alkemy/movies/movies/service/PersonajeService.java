package com.alkemy.movies.movies.service;

import com.alkemy.movies.movies.dto.GetPersonajeDTO;
import com.alkemy.movies.movies.dto.PersonajeDTO;

import java.util.List;

public interface PersonajeService {

    PersonajeDTO save(PersonajeDTO dto);

    List<GetPersonajeDTO> getAllPersonajes();

}
