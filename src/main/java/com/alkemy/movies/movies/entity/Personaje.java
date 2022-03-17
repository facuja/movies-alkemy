package com.alkemy.movies.movies.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "personaje")
@Getter
@Setter
public class Personaje {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String imagen;

    private String nombre;

    private Long edad;

    private Long peso;

    private String historia;


    @ManyToMany(mappedBy = "personajes")
    private List<Pelicula> peliculas = new ArrayList<>();
}
