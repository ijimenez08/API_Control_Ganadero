package com.cganadero_api.demo.services;

import java.util.ArrayList;
import java.util.Optional;

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

    public Optional<Ganado> obtenerPorId(long id)
    {
        return ganadoRespositorie.findById(id);
    }

    public ArrayList<Ganado> obtenerPorNumGanado(long NumGanado)
    {
        return ganadoRespositorie.finByNumGanado(NumGanado);
    } 

    public boolean eliminarGanado(long id)
    {
        try 
        {
            ganadoRespositorie.deleteById(id);
            return true;            
        } 
        catch (Exception err) 
        {
            return false;
        }
    }

}
