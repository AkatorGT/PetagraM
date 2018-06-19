package com.akator369.petagram;

public class Mascota {

    private int foto;
    private String nombre;
    private int numHuesitos;

    public Mascota(int foto, String nombre) {
        this.foto = foto;
        this.nombre = nombre;
    }

    public Mascota(int foto, String nombre, int numHuesitos) {
        this.foto = foto;
        this.nombre = nombre;
        this.numHuesitos = numHuesitos;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumHuesitos() {
        return numHuesitos;
    }

    public void setNumHuesitos(int numHuesitos) {
        this.numHuesitos = numHuesitos;
    }
}
