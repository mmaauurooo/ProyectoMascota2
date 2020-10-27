package com.example.proyectomascota;

public class Mascota {

    private String  nombre;
    private int     foto;
    private int     hueso;


    public Mascota(String nombre, int foto, int hueso) {
        this.nombre     = nombre;
        this.foto       = foto;
        this.hueso      = hueso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getHueso() {
        return hueso;
    }

    public void setHueso(int hueso) {
        this.hueso = hueso;
    }
}
