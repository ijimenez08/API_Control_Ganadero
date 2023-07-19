package com.cganadero_api.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cganadero_api.demo.models.Ganado;
import com.cganadero_api.demo.services.GanadoService;

@RestController
@RequestMapping("/ganado")
public class GanadoController 
{
    @Autowired
    GanadoService service;
    
    @GetMapping
    public ArrayList<Ganado> obtenerGanados()
    {
        return service.obtenerGanados();
    }
    
    @PostMapping
    public Ganado guardarGanados(@RequestBody Ganado ganado)
    {
        return this.service.guardarGanados(ganado);
    }
}
