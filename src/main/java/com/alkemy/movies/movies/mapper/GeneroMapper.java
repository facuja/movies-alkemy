package com.alkemy.movies.movies.mapper;


import com.alkemy.movies.movies.dto.GeneroDTO;
import com.alkemy.movies.movies.entity.GeneroEntity;
import org.springframework.stereotype.Component;

@Component
public class GeneroMapper {

    public GeneroEntity GeneroDTO2Entity(GeneroDTO dto){
        GeneroEntity generoEntity = new GeneroEntity();



        return generoEntity;

    }
}
