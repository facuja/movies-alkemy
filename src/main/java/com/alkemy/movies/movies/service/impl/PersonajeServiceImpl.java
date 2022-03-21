package com.alkemy.movies.movies.service.impl;


import com.alkemy.movies.movies.dto.GetPersonajeDTO;
import com.alkemy.movies.movies.dto.PersonajeDTO;
import com.alkemy.movies.movies.entity.GeneroEntity;
import com.alkemy.movies.movies.entity.PersonajeEntity;
import com.alkemy.movies.movies.mapper.PersonajeMapper;
import com.alkemy.movies.movies.repository.PersonajeRepository;
import com.alkemy.movies.movies.service.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonajeServiceImpl implements PersonajeService {

    @Autowired
    private PersonajeMapper personajeMapper;
    @Autowired
    private PersonajeRepository personajeRepository;



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
}
