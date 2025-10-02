package org.example;

//Objetivo

import java.util.Scanner;

public class Practica3 {

    public static void main() {

        final double peso_maximo = 120;

        double peso = 0;
        double falta_kg = 0;

        int falta_cm = 0;
        int altura = 0;
        final int altura_minima = 140;
        final int altura_maxima = 230;
        double peso_minimo = (altura * 2 / 8);


        Scanner read = new Scanner(System.in); //Pongo como variable read para que pueda leer/escanear lo que introduce el usuario en el teclado

        System.out.println("BIENVENIDO AL RATÓN JUGUETÓN"); //Se le da la bienvenida al usuario

        System.out.println("Leyendo altura (cm)..."); //Se le pide al usuario que escriba su altura en el teclado
        altura = read.nextInt(); //Se lee la variable "altura" asignada al numero 0 para que el usuario cuando ponga su altura (cm) en el teclado la máquina lo pueda leer


        if (altura < altura_minima) {
            falta_cm = altura_minima - altura;
            System.out.println("No puedes montar en la la atracción, lo siento... Te faltan " + falta_cm + " cm");
        } else if (altura > altura_maxima || altura < 0) {

                System.out.println("ERROR DE LECTURA. BAJA DE LA BÁSCULA Y VUELVE A SUBIR…");
            } else {
            System.out.println("Leyendo peso (cm)...");
            peso = read.nextDouble();
            if (peso_maximo <= peso ) {
                System.out.println("¡¡NO PUEDES SUBIR!!”");
            }else (peso > peso_minimo || peso < 0) {
                    System.out.println("ERROR DE LECTURA. BAJA DE LA BÁSCULA Y VUELVE A SUBIR…");
                    falta_kg = peso_minimo - peso;
                System.out.println("No puedes montar en la la atracción, lo siento... Te faltan " + falta_kg + " kg");
            } if (peso > peso_maximo) {


                }
            }
        }
    }
}