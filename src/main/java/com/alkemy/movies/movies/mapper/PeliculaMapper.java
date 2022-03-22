package com.alkemy.movies.movies.mapper;

import com.alkemy.movies.movies.dto.GetPeliculaDTO;
import com.alkemy.movies.movies.dto.PeliculaDTO;
import com.alkemy.movies.movies.entity.PeliculaEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PeliculaMapper {

    public PeliculaEntity PeliculaDTO2Entity(PeliculaDTO dto) {
        PeliculaEntity peliculaEntity = new PeliculaEntity();
        peliculaEntity.setTitulo(dto.getTitulo());
        peliculaEntity.setFechaCreacion(dto.getFechaCreacion());
        peliculaEntity.setCalificacion(dto.getCalificacion());
        peliculaEntity.setImagen(dto.getImagen());
        peliculaEntity.setIdGenero(dto.getIdGenero());
        return peliculaEntity;
    }

    public PeliculaDTO PeliculaEntity2DTO(PeliculaEntity entity) {
        PeliculaDTO peliculaDTO = new PeliculaDTO();
        peliculaDTO.setId(entity.getId());
        peliculaDTO.setTitulo(entity.getTitulo());
        peliculaDTO.setFechaCreacion(entity.getFechaCreacion());
        peliculaDTO.setCalificacion(entity.getCalificacion());
        peliculaDTO.setImagen(entity.getImagen());
        peliculaDTO.setIdGenero(entity.getIdGenero());
        return peliculaDTO;
    }

    public List<PeliculaDTO> PeliculasEntityList2DTOList(List<PeliculaEntity> entities) {
        List<PeliculaDTO> dtos = new ArrayList<>();
        for (PeliculaEntity entity : entities) {
            dtos.add(PeliculaEntity2DTO(entity));
        }
        return dtos;
    }


    public GetPeliculaDTO GetPeliculaEntity2DTO(PeliculaEntity entity) {
        GetPeliculaDTO getPeliculaDTO = new GetPeliculaDTO();
        getPeliculaDTO.setTitulo(entity.getTitulo());
        getPeliculaDTO.setImagen(entity.getImagen());
        getPeliculaDTO.setFechaCreacion(entity.getFechaCreacion());
        return getPeliculaDTO;
    }

    public List<GetPeliculaDTO> PeliculaEntityList2DTOList(List<PeliculaEntity> entities) {
        List<GetPeliculaDTO> dtos = new ArrayList<>();
        for (PeliculaEntity entity : entities) {
            dtos.add(GetPeliculaEntity2DTO(entity));
        }
        return dtos;
    }

}
