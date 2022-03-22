package com.alkemy.movies.movies.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class PersonajeFiltersDTO {

    private String nombre;
    private Long edad;
    private Set<Long> peliculas;

    public PersonajeFiltersDTO(String nombre, Long edad, Set<Long> peliculas) {
        this.nombre = nombre;
        this.edad = edad;
        this.peliculas = peliculas;
    }
}
