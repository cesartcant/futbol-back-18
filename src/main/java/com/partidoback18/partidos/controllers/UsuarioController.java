package com.partidoback18.partidos.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import com.partidoback18.partidos.models.UsuarioModel;
import com.partidoback18.partidos.services.UsuarioService;
import com.partidoback18.partidos.utils.BCrypt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UsuarioController {
    
    @Autowired
    UsuarioService usuarioService;

    @PostMapping("/usuarios")
    public ResponseEntity<Map<String, String>> guardar(@Valid @RequestBody UsuarioModel usuario){
        Map<String, String> respuesta = new HashMap<>(); //Creamos el map para la respuesta al cliente

        //Ciframos la contraseña con la clase BCrypt
        usuario.setPassword(BCrypt.hashpw(usuario.getPassword(), BCrypt.gensalt()));

        UsuarioModel u= this.usuarioService.buscarUsername(usuario.getUsername());

        if (u.getId()==null) {
            this.usuarioService.guardarUsuario(usuario); //Invocamos el metodo creado en el servicio
            respuesta.put("mensaje", "Se agrego el usuario correctamente"); //Se agrega la respuesta que se quiere enviar
        } else {
            respuesta.put("mensage", "El usuario ya esta registrado");
        }       
        
        return ResponseEntity.ok(respuesta); //Y se retorna esa respuesta        
    }    

}
