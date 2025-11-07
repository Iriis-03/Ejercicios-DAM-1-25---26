package org.example.TEMA3.PRACTICAS;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practica1 {

    static void main() {

        Scanner read = new Scanner(System.in);

        Random aleatorio = new Random();

        String [] vector_equipos = new String[0];
        String [] vector_equipo1 = new String[0];
        String [] vector_equipo2 = new String[0];

        System.out.println("Equipo 1");
        System.out.print("Introduce la potencia de los samurais: ");
        String potencia = read.nextLine();

        potencia = "";
        String[] subcadenas = potencia.split(" ");
        System.out.println(Arrays.toString(subcadenas));
        System.out.println(potencia);

        int [] vector_int = new int[7];

        for (int i = 0; i < subcadenas.length; i++){

            vector_int[i] = Integer.parseInt(subcadenas[i]);

        do {
            if (vector_equipos > ){

            }

        }while ()
    }

}
