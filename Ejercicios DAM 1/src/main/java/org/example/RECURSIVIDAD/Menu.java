package org.example.RECURSIVIDAD;

import java.util.Scanner;

public class Menu {

    static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        menu();
        System.out.println(dijitos(28383));
        System.out.println(potencias(2, 4));

    }

    public static void menu(){

        System.out.println("*** Batería de ejercicios sobre recursividad ***");
        System.out.println("Selecciona a continuación el modo que quieras ejecutar...");
        System.out.println("    1 - Dígitos");
        System.out.println("    2 - Potencias");
        System.out.println("    3 - Del Revés");
        System.out.println("    4 - Binario");
        System.out.println("    5 - A binario");
        System.out.println("    6 - Orden alfabético");
        System.out.println("    7 - Mostrar suma");

        int opcion = 0;

        switch (opcion){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
    }

    public static void opcion(){

    }

    public static int dijitos(int num){

        if (num < 10){
            return 1;
        } else {
            return 1 + dijitos(num/10);
        }

    }

    public static int potencias(int base, int exponente){

        if (exponente == 1){
            return base;
        } else {
            return base * potencias(base, exponente - 1);
        }

    }
}
