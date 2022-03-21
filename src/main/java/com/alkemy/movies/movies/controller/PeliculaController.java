package com.alkemy.movies.movies.controller;


import com.alkemy.movies.movies.dto.GetPeliculaDTO;
import com.alkemy.movies.movies.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("movies")
public class PeliculaController {

    @Autowired
    private PeliculaService peliculaService;

    @GetMapping
    public ResponseEntity<List<GetPeliculaDTO>> getAll(){
        List<GetPeliculaDTO> peliculas = peliculaService.getAllPeliculas();
        return ResponseEntity.ok().body(peliculas);
    }
}
