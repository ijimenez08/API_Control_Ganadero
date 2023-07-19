package com.cganadero_api.demo.models;

import java.util.Date;

import jakarta.persistence.*;


@Entity
@Table(name = "ganado")
public class Ganado 
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private long id;
    private long NumGanado;
   
    private String Finca;
    private String Porpietario;
    private String Nombre;
    private String Nacimiento;
    private String Pastoreo;
    private String Lparto;
    private String Laborto;
    private String Lcelo;
    private String Lembrion;
    private String Embarazo;
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
     public long getNumGanado() {
        return NumGanado;
    }
    public void setNumGanado(long numGanado) {
        NumGanado = numGanado;
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
    public String getNacimiento() {
        return Nacimiento;
    }
    public void setNacimiento(String nacimiento) {
        Nacimiento = nacimiento;
    }
    public String getPastoreo() {
        return Pastoreo;
    }
    public void setPastoreo(String pastoreo) {
        Pastoreo = pastoreo;
    }
    public String getLparto() {
        return Lparto;
    }
    public void setLparto(String lparto) {
        Lparto = lparto;
    }
    public String getLaborto() {
        return Laborto;
    }
    public void setLaborto(String laborto) {
        Laborto = laborto;
    }
    public String getLcelo() {
        return Lcelo;
    }
    public void setLcelo(String lcelo) {
        Lcelo = lcelo;
    }
    public String getLembrion() {
        return Lembrion;
    }
    public void setLembrion(String lembrion) {
        Lembrion = lembrion;
    }
    public String getEmbarazo() {
        return Embarazo;
    }
    public void setEmbarazo(String embarazo) {
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
