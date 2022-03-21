package com.alkemy.movies.movies.controller;


import com.alkemy.movies.movies.dto.GetPersonajeDTO;
import com.alkemy.movies.movies.dto.PersonajeDTO;
import com.alkemy.movies.movies.service.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("characters")
public class PersonajeController {

    @Autowired
    private PersonajeService personajeService;

    @PostMapping
    public ResponseEntity<PersonajeDTO> save(@RequestBody PersonajeDTO personaje){

        // Guardar personaje
        PersonajeDTO personajeGuardado = personajeService.save(personaje);
        //201, personaje guardado correctamente
        return ResponseEntity.status(HttpStatus.CREATED).body(personajeGuardado);
    }

    @GetMapping
    public ResponseEntity<List<GetPersonajeDTO>> getAll(){
        List<GetPersonajeDTO> personajes = personajeService.getAllPersonajes();
        return ResponseEntity.ok().body(personajes);
    }

}
