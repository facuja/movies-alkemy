package com.alkemy.movies.movies.mapper;


import com.alkemy.movies.movies.dto.GeneroDTO;
import com.alkemy.movies.movies.entity.GeneroEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GeneroMapper {

    public GeneroEntity GeneroDTO2Entity(GeneroDTO dto){
        GeneroEntity generoEntity = new GeneroEntity();
        generoEntity.setImagen(dto.getImagen());
        generoEntity.setNombre(dto.getNombre());

        return generoEntity;
    }

    public GeneroDTO GeneroEntity2DTO(GeneroEntity entity){
        GeneroDTO generoDTO = new GeneroDTO();
        generoDTO.setId(entity.getId());
        generoDTO.setImagen(entity.getImagen());
        generoDTO.setNombre(entity.getNombre());

        return generoDTO;
    }

    public List<GeneroDTO> GeneroEntityList2DTOList(List<GeneroEntity> entities){
        List<GeneroDTO> dtos = new ArrayList<>();
        for (GeneroEntity entity : entities) {
            dtos.add(GeneroEntity2DTO(entity));
        }
        return dtos;
    }
}
