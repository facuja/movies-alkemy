package com.alkemy.movies.movies.service.impl;


import com.alkemy.movies.movies.dto.GeneroDTO;
import com.alkemy.movies.movies.service.GeneroService;
import org.springframework.stereotype.Service;

@Service
public class GeneroServiceImpl implements GeneroService {

    public GeneroDTO save(GeneroDTO dto){

        //TODO: Guardar genero
        System.out.println("GUARDAR GENERO");
        return dto;
    }
}
