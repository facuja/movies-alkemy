package com.alkemy.movies.movies.mapper;


import com.alkemy.movies.movies.dto.GetPersonajeDTO;
import com.alkemy.movies.movies.dto.PersonajeDTO;
import com.alkemy.movies.movies.entity.PersonajeEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class PersonajeMapper {

    public PersonajeEntity PersonajeDTO2Entity(PersonajeDTO dto){
        PersonajeEntity personajeEntity = new PersonajeEntity();
        personajeEntity.setImagen(dto.getImagen());
        personajeEntity.setNombre(dto.getNombre());
        personajeEntity.setEdad(dto.getEdad());
        personajeEntity.setHistoria(dto.getHistoria());
        personajeEntity.setPeso(dto.getPeso());

        return personajeEntity;
    }

    public PersonajeDTO PersonajeEntity2DTO(PersonajeEntity entity){
        PersonajeDTO personajeDTO = new PersonajeDTO();
        personajeDTO.setId(entity.getId());
        personajeDTO.setImagen(entity.getImagen());
        personajeDTO.setNombre(entity.getNombre());
        personajeDTO.setEdad(entity.getEdad());
        personajeDTO.setHistoria(entity.getHistoria());
        personajeDTO.setPeso(entity.getPeso());

        return personajeDTO;
    }

    public GetPersonajeDTO GetPersonajeEntity2DTO(PersonajeEntity entity){
        GetPersonajeDTO getPersonajeDTO = new GetPersonajeDTO();
        getPersonajeDTO.setImagen(entity.getImagen());
        getPersonajeDTO.setNombre(entity.getNombre());

        return getPersonajeDTO;
    }


    public List<GetPersonajeDTO> PersonajeEntityList2DTOList(List<PersonajeEntity> entities){
        List<GetPersonajeDTO> dtos = new ArrayList<>();
        for (PersonajeEntity entity : entities) {
            dtos.add(GetPersonajeEntity2DTO(entity));
        }
        return dtos;
    }

}
