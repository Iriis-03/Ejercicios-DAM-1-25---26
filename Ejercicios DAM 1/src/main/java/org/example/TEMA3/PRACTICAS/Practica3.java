package org.example.TEMA3.PRACTICAS;

import java.util.Scanner;

public class Practica3 {

    static void main() {

        Scanner read = new Scanner(System.in);

        boolean salir = false;

        System.out.println("******* VALIDADOR DE COMPATIBILIDAD ZX SPECTRUM *******");
        System.out.println("Introduce la resolución de tu pantalla (ancho x alto)...");

        int Ancho = 0;
        int Alto = 0;

        do {
            System.out.println("Ancho:");
            Ancho = read.nextInt();

            if (Ancho % 8 == 0 && Ancho < 48){
                salir = true;
            } else {
                System.out.println("ERROR. Introduce el ancho correspondiente de tu pantalla");
            }
        }while(!salir);

        salir = false;

        do {
            System.out.println("Alto:");
            Ancho = read.nextInt();

            if (Ancho % 8 == 0 && Ancho < 48){
                salir = true;
            } else {
                System.out.println("ERROR. Introduce el alto correspondiente de tu pantalla");
            }
        }while(!salir);

        String[][] pantalla = new String[Alto][Ancho/8];

        System.out.println("Introduce (Línea a línea) los colores de tu imagen para cada píxel:");

        String[] lineas = new String[Alto];

        for (int i = 0; i < Alto; i++) {

            salir = false;

            String linea;

            do {
                linea = read.next();

                if (linea.length() == Ancho){
                    salir = true;
                } else {
                    System.out.println("ERROR. Introduce la longitud correspondiente (" + Ancho + ")");
                }
            }while(!salir);

            for (int j = 0; j < Ancho/8; j++) {
                int inicio = j * 8;
                int fin = inicio + 8;
                pantalla[i][j] = linea.substring(inicio,fin);
            }
        }
//        for (int j = 0; j < ; j++) {
//
//            for (int i = 0; i < ; i++) {
//
//            }
//
//        }
    }
}
