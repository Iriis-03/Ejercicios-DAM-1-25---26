package org.example.TEMA5POO.PRACTICA1;

import java.util.ArrayList;

public class Cadena {

    private String nombre;
    private ArrayList<Programa> listaProgramas;

    public Cadena(String nombre, ArrayList<Programa> listaProgramas) {
        this.nombre = nombre;
        this.listaProgramas = listaProgramas;
    }

    public void anadirPrograma(Programa programa){

        listaProgramas.add(programa);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Programa> getListaProgramas() {
        return listaProgramas;
    }

    public void setListaProgramas(ArrayList<Programa> listaProgramas) {
        this.listaProgramas = listaProgramas;
    }

    @Override
    public String toString() {
        return "Cadena{" +
                "nombre='" + nombre + '\'' +
                ", listaProgramas=" + listaProgramas +
                '}';
    }






}
