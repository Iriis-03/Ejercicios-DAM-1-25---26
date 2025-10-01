package org.example;

//Objetivo

import java.util.Scanner;

public class Practica3 {

    public static void main() {
        final int peso_maximo = 120;
        int falta_cm = 0;
        int altura = 0;
        double peso = 0;
        final int altura_minima = 140;
        final int altura_maxima = 230;
        final int peso_minimo = altura*2/8;

        Scanner read = new Scanner(System.in);

        System.out.println("BIENVENIDO AL RATÓN JUGUETÓN");

        System.out.println("Leyendo altura (cm)...");
        altura = read.nextInt();


        if (altura < altura_minima) {
            falta_cm = altura_minima - altura;
            System.out.println(falta_cm);
            System.out.println("No puedes montar en la la atracción, lo siento... Te faltan " + falta_cm + " de altura");
        } else {

            if (altura > altura_maxima || altura < 0) {
                System.out.println("ERROR DE LECTURA. BAJA DE LA BÁSCULA Y VUELVE A SUBIR…");
            } else {
                System.out.println("Leyendo peso (cm)...");
                peso = read.nextDouble();
                if (peso_maximo <= peso) ;
                System.out.println("¡¡NO PUEDES SUBIR!!”");
            }
        }
    }
}