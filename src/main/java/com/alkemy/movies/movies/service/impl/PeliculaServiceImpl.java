package com.alkemy.movies.movies.service.impl;

import com.alkemy.movies.movies.dto.GetPeliculaDTO;
import com.alkemy.movies.movies.dto.PeliculaDTO;
import com.alkemy.movies.movies.entity.PeliculaEntity;
import com.alkemy.movies.movies.mapper.PeliculaMapper;
import com.alkemy.movies.movies.repository.PeliculaRepository;
import com.alkemy.movies.movies.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculaServiceImpl implements PeliculaService {

    @Autowired
    private PeliculaMapper peliculaMapper;
    @Autowired
    private PeliculaRepository peliculaRepository;


    public PeliculaDTO save(PeliculaDTO dto){
        PeliculaEntity entity = peliculaMapper.PeliculaDTO2Entity(dto);
        PeliculaEntity entitySaved = peliculaRepository.save(entity);
        PeliculaDTO result = peliculaMapper.PeliculaEntity2DTO(entitySaved);
        return result;
    }

    public List<GetPeliculaDTO> getAllPeliculas() {
        List<PeliculaEntity> entities = peliculaRepository.findAll();
        List<GetPeliculaDTO> result = peliculaMapper.PeliculaEntityList2DTOList(entities);
        return result;
    }
}
