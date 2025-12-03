package org.example.ENTORNOS_DE_DESARROLLO;

import java.util.Scanner;

public class La_Fiesta_Aburrida {

    static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce la cantidad de personas que no conoce Tinín en la fiesta: ");
        int desconocidos = read.nextInt();

        read.nextLine();



        for (int i = 0; i < desconocidos; i++) {
            System.out.println("¡Hola, soy Tinín! ¿Y tú?");
            String nombre = read.nextLine();
            int longitud = nombre.length();
            String mitad2 = nombre.substring(4, longitud);
            System.out.println("Hola, " + mitad2);
        }
    }
}
