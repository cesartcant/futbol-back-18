package com.partidoback18.partidos.services;

import java.util.List;

import com.partidoback18.partidos.models.UsuarioModel;
import com.partidoback18.partidos.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public void guardarUsuario(UsuarioModel usuario) {
        this.usuarioRepository.save(usuario);
    }

    public List<UsuarioModel> traerTodos() {
        return this.usuarioRepository.findAll();
    }

    //Metodo para buscar por username
    public UsuarioModel buscarUsername(String username) {
        return this.usuarioRepository.findByUsername(username).orElse(new UsuarioModel());
    }
    
}
