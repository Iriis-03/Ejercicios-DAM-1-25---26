package org.example.TEMA2;

import java.util.Scanner;

public class Practica3 {

    static void main() {

        Scanner read = new Scanner(System.in);

        int validador = 0;

        System.out.println("Introduzca ISBN: ");
        int ISBN = read.nextInt();

        System.out.println("---------------------");
        System.out.println("*VALIDADOR ISBN*");
        System.out.println("[1] - Validar ISBN");
        System.out.println("[2] - Reparar ISBN");
        System.out.println("[x] - Salir");
        System.out.println("---------------------");



        switch (validador){

            case 1:

                for (int i = 0; i <= 10; i++){

                    char cifra = ISBN.charAt (i);
                }

        }
    }
}
