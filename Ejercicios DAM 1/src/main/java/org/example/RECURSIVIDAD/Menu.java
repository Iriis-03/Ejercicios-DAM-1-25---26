package org.example.RECURSIVIDAD;

import java.util.Scanner;

public class Menu {

    static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        menu();
        System.out.println(dijitos(4556));
        System.out.println(potencias(2, 4));
        del_reves(25);

        System.out.println();

        String frase = "Hola mundo soy una frase al revés";
        char[] frase_char = frase.toCharArray();
        del_reves_char(frase_char.length - 1, frase_char);
        System.out.println();
        del_reves_char_sin_vector(frase.length() - 1, frase);

        System.out.println();

        System.out.println(binario(10001110));
        System.out.println(a_binario(128));


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

    public static void del_reves(int num){

        if (num < 10){
            System.out.print(num);
        } else {
            System.out.print(num % 10);
            del_reves(num/10);
        }

    }

    public static void del_reves_char(int posicion, char[] frase){

        if (posicion >= 0){
            System.out.print(frase[posicion]);
            del_reves_char(posicion - 1, frase);
        }

    }

    public static void del_reves_char_sin_vector(int posicion, String frase){

        if (posicion >= 0){
            System.out.print(frase.charAt(posicion));
            del_reves_char_sin_vector(posicion - 1, frase);
        }

    }

    public static boolean binario (int num){

        if (num >= 10){

            if (num % 10 == 0 || num % 10 == 1){
                return binario(num / 10);
            } else {
                return false;
            }
        } else {
            if (num == 0 || num == 1) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static String a_binario(int num){

        if (num <= 1){
            return Integer.toString(num);
        } else {
            return a_binario(num / 2) + num % 2;
        }

    }

    public static boolean orden_alfabetico(String palabra, int posicion){

//        if (palabra )
        return true;
    }
}
