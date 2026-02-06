package org.example.TEMA5POO.PRACTICA1;

public class Empleado {

    private static int contadorID = 1;
    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    public Empleado(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = obtenerCargo(cargo);
        id = obtenerID();
        contadorID++;
        director = null;

    }

    private String obtenerCargo(String cargo){

        switch (cargo){

            case "director":
                return "director";
            case "técnico":
                return "técnico";
            case "presentador":
                return "presentador";
            case "colaborador":
                return "colaborador";
            default:
                return "pte";
        }
    }

    private String obtenerID(){

        String num = Integer.toString(contadorID);
        int num_ceros = 3 - num.length();

        String ceros = "";

        for (int i = 0; i < num_ceros; i++) {

           ceros += "0";

        }

        return "EP" + ceros + num;

    }

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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", director=" + director +
                '}';
    }

}
