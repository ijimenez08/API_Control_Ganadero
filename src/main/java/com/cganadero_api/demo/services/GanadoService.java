package com.cganadero_api.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cganadero_api.demo.repositories.GanadoRespositorie;

@Service
public class GanadoService 
{
    @Autowired
    GanadoRespositorie ganadoRespositorie;
    

}
