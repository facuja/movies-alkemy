package com.alkemy.movies.movies.mapper;

import com.alkemy.movies.movies.dto.GetPeliculaDTO;
import com.alkemy.movies.movies.entity.PeliculaEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PeliculaMapper {

    public GetPeliculaDTO GetPeliculaEntity2DTO(PeliculaEntity entity){
        GetPeliculaDTO getPeliculaDTO = new GetPeliculaDTO();
        getPeliculaDTO.setTitulo(entity.getTitulo());
        getPeliculaDTO.setImagen(entity.getImagen());
        getPeliculaDTO.setFechaCreacion(entity.getFechaCreacion());
        return getPeliculaDTO;
    }

    public List<GetPeliculaDTO> PeliculaEntityList2DTOList(List<PeliculaEntity> entities){
        List<GetPeliculaDTO> dtos = new ArrayList<>();
        for (PeliculaEntity entity : entities) {
            dtos.add(GetPeliculaEntity2DTO(entity));
        }
        return dtos;
    }

}
