package org.example.TEMA5POO;

public class Libro {

    private static int cantidadLibros = 0;
    private static int librosDisponibles = 0;

    private String titulo;
    private String autor;
    private int id;
    private boolean disponible;

    public Libro (String titulo, String autor){

        this.titulo = titulo;
        this.autor = autor;
        disponible = true;
        setId();
    }

    public static int CalcularId(){

    }

    public static void prestar(boolean disponible, int librosDisponibles){

        if (disponible == true){

        } else {
            System.out.println("El libro ha sido prestado con éxito");
        }
    }

    public static void devolver(){

    }

    public static void estaDisponible(){

    }

    public static int getTotalLibros(){

    }

    public static int getLibrosDisponibles(){

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = ++cantidadLibros;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }




}
