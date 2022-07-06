package com.examen.ids.util;

public class Cliente {
    private String nombre;
    private String apellido;
    private String pais;
    private String idioma;
    private String nombreAeropuerto;

    public Cliente(String nombre, String apellido, String pais, String idioma, String nombreAeropuerto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.idioma = idioma;
        this.nombreAeropuerto = nombreAeropuerto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getNombreAeropuerto() {
        return nombreAeropuerto;
    }

    public void setNombreAeropuerto(String nombreAeropuerto) {
        this.nombreAeropuerto = nombreAeropuerto;
    }
}
