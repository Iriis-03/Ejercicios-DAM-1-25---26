package org.example.TEMA3.MATRICES;

import java.util.Scanner;

public class Ejercicio3_Nivel1 {

    static void main() {

        Scanner read = new Scanner(System.in);

        System.out.println("¿Cuántos estudiantes tienes? ");
        int alumnos = read.nextInt();

        System.out.println("¿Cuántas asignaturas cursan?");
        int asignaturas = read.nextInt();

        read.nextLine();

        String[][] notas = new String[alumnos + 1][asignaturas + 1];

        notas[0][0] = "Estudiantes";

        for (int i = 1; i < notas.length; i++) {
            System.out.println("Introduce el nombre del alumno " + i + ": ");
            notas[i][0] = read.next();
        }

        for (int i = 1; i < notas[0].length; i++) {
            System.out.println("Introduce asignatura " + i);
            notas[0][i] = read.next();
        }

        for (int i = 1; i < notas.length; i++) {
            for (int j = 1; j < notas[i].length; j++) {
                System.out.println("Introduce la nota de " + notas[i][0] + " para la asignatura de " + notas[0][j]);
                notas[i][j] = read.next();
            }
        }

        for (String fila[] : notas){
            for (String valor : fila){
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
