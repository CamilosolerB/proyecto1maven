package com.example.proyecto1maven.controllers;

public class construtor {
    private String nombre;
    private String raza;
    private String edad;
    private String codigo;

    public construtor(String nombre, String raza, String edad, String codigo) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
