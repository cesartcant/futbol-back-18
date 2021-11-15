package com.partidoback18.partidos.repositories;

import com.partidoback18.partidos.models.PartidoModel;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PartidoRepository extends MongoRepository<PartidoModel, String> {
    
}
