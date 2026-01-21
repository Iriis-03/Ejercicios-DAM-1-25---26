package org.example.TEMA5POO;

public class EstudianteApp {

    static void main(String[] args) {

        Estudiante iris = new Estudiante("Iris", "1DAM", "iriis.workflow@gmail.com");

        System.out.println(iris.getNia());
        System.out.println(iris);

        Estudiante david = new Estudiante("David");

        System.out.println(david.getNia());
        System.out.println(david);

        Estudiante adrian = new Estudiante("adrian");

        System.out.println("Hay " + Estudiante.obtenerTotalEstudiantes() + " estudiantes.");

        System.out.println(Estudiante.validarCorreo("iriis@mutxamel.com"));
        System.out.println(Estudiante.validarCorreo("iriis@alu.edu.gva.es"));
    }
}
