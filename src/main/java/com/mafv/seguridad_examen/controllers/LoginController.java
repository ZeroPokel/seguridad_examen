package com.mafv.seguridad_examen.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mafv.seguridad_examen.services.UsuarioService;

@RestController
public class LoginController {

    @Autowired
    UsuarioService usuarioService;
    
    @GetMapping(value = "/login")
    public String login(@RequestParam String nombre, @RequestParam String password){
        if(usuarioService.findCriteria(nombre, password) != null){
            return "login";
        } else {
            return "error";
        }
    }
}
