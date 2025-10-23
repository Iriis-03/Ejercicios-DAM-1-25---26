package org.example.TEMA2;

import java.util.Scanner;

public class Ejercicio4_Bucles {

    static void main() {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce una palabra...");
        String palabra = read.next();
        int longitud = palabra.length();
        for (int i = 0;i < longitud;i++){
            System.out.println(palabra.charAt(i));

        }
    }
}
