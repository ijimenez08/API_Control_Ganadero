package com.cganadero_api.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cganadero_api.demo.models.Ganado;

@Repository
public interface GanadoRespositorie extends CrudRepository<Ganado, Long>
{
    //----------------------------------------------------------------
    
}
