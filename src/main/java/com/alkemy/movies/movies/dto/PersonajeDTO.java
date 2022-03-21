package com.alkemy.movies.movies.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonajeDTO {

    private Long id;
    private String nombre;
    private String imagen;
    private String historia;
    private Long peso;
    private Long edad;
}
