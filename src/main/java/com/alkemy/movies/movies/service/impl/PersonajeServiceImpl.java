package com.alkemy.movies.movies.service.impl;


import com.alkemy.movies.movies.dto.GetPersonajeDTO;
import com.alkemy.movies.movies.dto.PersonajeDTO;
import com.alkemy.movies.movies.dto.PersonajeFiltersDTO;
import com.alkemy.movies.movies.entity.PersonajeEntity;
import com.alkemy.movies.movies.mapper.PersonajeMapper;
import com.alkemy.movies.movies.repository.PersonajeRepository;
import com.alkemy.movies.movies.repository.specifications.PersonajeSpecification;
import com.alkemy.movies.movies.service.PeliculaService;
import com.alkemy.movies.movies.service.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class PersonajeServiceImpl implements PersonajeService {


    private PersonajeMapper personajeMapper;
    private PersonajeRepository personajeRepository;
    private PeliculaService peliculaService;
    private PersonajeSpecification personajeSpecification;

    @Autowired
    public PersonajeServiceImpl(
            PersonajeMapper personajeMapper,
            PersonajeRepository personajeRepository,
            PeliculaService peliculaService,
            PersonajeSpecification personajeSpecification) {
        this.personajeMapper = personajeMapper;
        this.personajeRepository = personajeRepository;
        this.peliculaService = peliculaService;
        this.personajeSpecification = personajeSpecification;
    }

    public PersonajeDTO save(PersonajeDTO dto){

        PersonajeEntity entity = personajeMapper.PersonajeDTO2Entity(dto);
        //Guardamos el Personaje entidad en la base de datos
        PersonajeEntity entitySaved = personajeRepository.save(entity);
        PersonajeDTO result = personajeMapper.PersonajeEntity2DTO(entitySaved);
        System.out.println("GUARDAR PERSONAJE");
        return result;
    }


    public List<GetPersonajeDTO> getAllPersonajes() {
        List<PersonajeEntity> entities = personajeRepository.findAll();
        List<GetPersonajeDTO> result = personajeMapper.PersonajeEntityList2DTOList(entities);
        return result;
    }

    /*public List<PersonajeDTO> getByFilters(String nombre, Long edad, Set<Long> peliculas){
        PersonajeFiltersDTO filtersDTO = new PersonajeFiltersDTO(nombre, edad, peliculas);
        List<PersonajeEntity> entities = personajeRepository.findAll(personajeSpecification.getByFilters(filtersDTO));
        *//*List<PersonajeDTO> dtos = personajeMapper.*//*

    }*/
}
