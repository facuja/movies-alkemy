package com.alkemy.movies.movies.service;

import com.alkemy.movies.movies.dto.GetPeliculaDTO;
import com.alkemy.movies.movies.dto.PeliculaDTO;

import java.util.List;

public interface PeliculaService {

    PeliculaDTO save(PeliculaDTO dto);

    List<GetPeliculaDTO> getAllPeliculas();
}
