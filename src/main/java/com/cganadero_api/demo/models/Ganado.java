package com.cganadero_api.demo.models;

import java.util.Date;

public class Ganado 
{
    private long id;
    private String Finca;
    private String Porpietario;
    private String Nombre;
    private Date Nacimiento;
    private Date Pastoreo;
    private Date Lparto;
    private Date Laborto;
    private Date Lcelo;
    private Date Lembrion;
    private Date Embarazo;
    private int Partos;
    private int Hmachos;
    private int Hhembras;
    private int Abortos;
    private int Peso;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getFinca() {
        return Finca;
    }
    public void setFinca(String finca) {
        Finca = finca;
    }
    public String getPorpietario() {
        return Porpietario;
    }
    public void setPorpietario(String porpietario) {
        Porpietario = porpietario;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public Date getNacimiento() {
        return Nacimiento;
    }
    public void setNacimiento(Date nacimiento) {
        Nacimiento = nacimiento;
    }
    public Date getPastoreo() {
        return Pastoreo;
    }
    public void setPastoreo(Date pastoreo) {
        Pastoreo = pastoreo;
    }
    public Date getLparto() {
        return Lparto;
    }
    public void setLparto(Date lparto) {
        Lparto = lparto;
    }
    public Date getLaborto() {
        return Laborto;
    }
    public void setLaborto(Date laborto) {
        Laborto = laborto;
    }
    public Date getLcelo() {
        return Lcelo;
    }
    public void setLcelo(Date lcelo) {
        Lcelo = lcelo;
    }
    public Date getLembrion() {
        return Lembrion;
    }
    public void setLembrion(Date lembrion) {
        Lembrion = lembrion;
    }
    public Date getEmbarazo() {
        return Embarazo;
    }
    public void setEmbarazo(Date embarazo) {
        Embarazo = embarazo;
    }
    public int getPartos() {
        return Partos;
    }
    public void setPartos(int partos) {
        Partos = partos;
    }
    public int getHmachos() {
        return Hmachos;
    }
    public void setHmachos(int hmachos) {
        Hmachos = hmachos;
    }
    public int getHhembras() {
        return Hhembras;
    }
    public void setHhembras(int hhembras) {
        Hhembras = hhembras;
    }
    public int getAbortos() {
        return Abortos;
    }
    public void setAbortos(int abortos) {
        Abortos = abortos;
    }
    public int getPeso() {
        return Peso;
    }
    public void setPeso(int peso) {
        Peso = peso;
    }

    
}
