package com.partidoback18.partidos.repositories;

import com.partidoback18.partidos.models.EquipoModel;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository //Etiqueta que asigna la interfaz como resositorio
public interface EquipoRepository extends MongoRepository<EquipoModel, String> {
    /*
    La Clase MongoRepository contiene creados metodos de las basicas del CRUD
    C - Crear o agregar datos
    R - Leer datos
    U - Actualizar
    D - Eliminar datos
    */
}
