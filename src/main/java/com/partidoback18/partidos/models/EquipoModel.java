package com.partidoback18.partidos.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//Agregamos el nombre de la coleccion
@Document(collection = "equipos")
public class EquipoModel {

    @Id //Etiqueta que asigna este camo como id
    private String id;
    
    //Campo que guarda el nombre del equipo
    private String nombre;
    
    //Metodos selectores (get) y modificadores (set)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}