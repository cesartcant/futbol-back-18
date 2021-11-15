package com.partidoback18.partidos.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "partidos")
public class PartidoModel {
    @Id
    private String id;
    private String fecha;
    private int goleslocal;
    private int golesvisitante;
    private EquipoModel local;
    private EquipoModel visitante;
    private UsuarioModel usuario;

    public String getFecha() {
        return fecha;
    }

    public UsuarioModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioModel usuario) {
        this.usuario = usuario;
    }

    public EquipoModel getVisitante() {
        return visitante;
    }

    public void setVisitante(EquipoModel visitante) {
        this.visitante = visitante;
    }

    public EquipoModel getLocal() {
        return local;
    }

    public void setLocal(EquipoModel local) {
        this.local = local;
    }

    public int getGolesvisitante() {
        return golesvisitante;
    }

    public void setGolesvisitante(int golesvisitante) {
        this.golesvisitante = golesvisitante;
    }

    public int getGoleslocal() {
        return goleslocal;
    }

    public void setGoleslocal(int goleslocal) {
        this.goleslocal = goleslocal;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
