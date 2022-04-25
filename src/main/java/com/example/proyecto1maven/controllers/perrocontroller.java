package com.example.proyecto1maven.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;


@RestController
public class perrocontroller {

    @RequestMapping(value = "prueba")
    public String datos(@RequestParam("nombre")String nom, @RequestParam("raza")String raza, @RequestParam("edad")String age, @RequestParam("codigo")String cod){
        construtor con = new construtor(nom,raza,age,cod);
        String datos = "nombre: "+nom+ "\nraza:"+raza+"\nEdad"+age+"\nCodigo:"+cod;
        return datos;
    };
}
