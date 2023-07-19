package com.cganadero_api.demo.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cganadero_api.demo.models.Ganado;

@Repository
public interface GanadoRespositorie extends CrudRepository<Ganado, Long>
{
    public abstract ArrayList<Ganado> finByNumGanado(Long numGanado);
    
}
