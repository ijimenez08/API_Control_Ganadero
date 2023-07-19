package com.cganadero_api.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cganadero_api.demo.models.Ganado;
import com.cganadero_api.demo.repositories.GanadoRespositorie;

@Service
public class GanadoService 
{
    @Autowired
    GanadoRespositorie ganadoRespositorie;
    
    public ArrayList<Ganado> obtenerGanados()
    {
        return (ArrayList<Ganado>) ganadoRespositorie.findAll();
    }

    public Ganado guardarGanados(Ganado ganado)
    {
        return ganadoRespositorie.save(ganado);
    }

}
