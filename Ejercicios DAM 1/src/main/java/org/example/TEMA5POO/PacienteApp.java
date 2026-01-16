package org.example.TEMA5POO;

public class PacienteApp {

    static void main(String[] args) {

        Paciente iris = new Paciente();

        System.out.println(iris.getDni());

        Paciente prueba = new Paciente("Iris", 22, 'M', 59, 155);

        System.out.println(prueba.calcularIMC());
    }
}
