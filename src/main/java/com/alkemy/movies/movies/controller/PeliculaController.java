package com.alkemy.movies.movies.controller;


import com.alkemy.movies.movies.dto.GetPeliculaDTO;
import com.alkemy.movies.movies.dto.PeliculaDTO;
import com.alkemy.movies.movies.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("movies")
public class PeliculaController {

    @Autowired
    private PeliculaService peliculaService;

    @PostMapping
    public ResponseEntity<PeliculaDTO> save(@RequestBody PeliculaDTO pelicula){
        PeliculaDTO peliculaGuardada = peliculaService.save(pelicula);
        return ResponseEntity.status(HttpStatus.CREATED).body(peliculaGuardada);
    }

    @GetMapping
    public ResponseEntity<List<GetPeliculaDTO>> getAll(){
        List<GetPeliculaDTO> peliculas = peliculaService.getAllPeliculas();
        return ResponseEntity.ok().body(peliculas);
    }
}
