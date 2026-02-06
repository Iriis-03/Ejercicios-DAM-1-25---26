package org.example.TEMA5POO.PRACTICA1;

import java.time.LocalDate;
import java.util.Scanner;

public class Invitado {

    private String nombre;
    private String profesion;
    private LocalDate fecha_visita;
    private int temporada;

    public Invitado(String nombre, String profesion, int temporada) {
        this.nombre = nombre;
        this.profesion = profesion;
        fecha_visita = fechaPrograma();
        this.temporada = temporada;
    }

    public LocalDate fechaPrograma(){
        Scanner read = new Scanner(System.in);

        System.out.println("Introduce el año en el que acudirá el invitado: " + );
        int anyo = read.nextInt();
        System.out.println("Introduce el día: ");
        int dia = read.nextInt();
        System.out.println("Introduce el mes: ");
        int mes = read.nextInt();


        return LocalDate.of(anyo, mes, dia);
    }

    public void invitadosTemporada(int temporada){

    }

    public int vecesInvitado(String nombre){

    }

    public void rastrearInvitado(String nombre){

    }

    public boolean buscarInvitado(String nombre){

    }

    public void invitadoAntes(String nombre){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    public void setFecha_visita(LocalDate fecha_visita) {
        this.fecha_visita = fecha_visita;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    @Override
    public String toString() {
        return "Invitado{" +
                "nombre='" + nombre + '\'' +
                ", profesion='" + profesion + '\'' +
                ", fecha_visita=" + fecha_visita +
                ", temporada=" + temporada +
                '}';
    }

}
