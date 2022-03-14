package com.alkemy.movies.movies.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "pelicula")
@Getter
@Setter
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String imagen;

    private String titulo;

    @Column(name = "fecha_creacion")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private LocalDate fechaCreacion;

    private Long calificacion;

    @Column(name = "id_genero", nullable = false)
    private Long idGenero;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_genero", insertable = false, updatable = false)
    private Genero genero;


    @ManyToMany(
                cascade = {
                        CascadeType.PERSIST,
                        CascadeType.MERGE
                })
    @JoinTable(
            name = "personaje_pelicula",
            joinColumns = @JoinColumn(name = "id_pais"),
            inverseJoinColumns = @JoinColumn(name = "id_personaje")
    )
    private Set<Personaje> personajes = new HashSet<>();

}