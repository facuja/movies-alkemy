package com.alkemy.movies.movies.dto;


import com.alkemy.movies.movies.entity.PeliculaEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class PersonajeDTO {

    private Long id;
    private String nombre;
    private String imagen;
    private String historia;
    private Long peso;
    private Long edad;
    private Set<PeliculaEntity> peliculas;
}
