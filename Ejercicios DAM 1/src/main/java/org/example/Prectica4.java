package org.example;


import java.util.Scanner;

public class Practica4 {


    public static void main() {

        Scanner read = new Scanner(System.in);

        int multiplicando;
        int multiplicador;
        int number = 0;
        int resultado = 0;
        Integer resultado_linea1;
        Integer resultado_linea2;
        Integer resultado_linea3;

        System.out.println("Introduce el multiplicando (3 cifras)");
        multiplicando = read.nextInt();

        System.out.println("Introduce el multiplicador (3 cifras)");
        multiplicador = read.nextInt();


        resultado = multiplicando * multiplicador;

        String number_string = Integer.toString(multiplicador);

        String first_number = number_string.substring(0,1);
        int first_number_int = Integer.parseInt (first_number);

        String middle_number = number_string.substring(1,2);
        int middle_number_int = Integer.parseInt (middle_number);

        String last_number = number_string.substring(2,3);
        int last_number_int = Integer.parseInt (last_number);



        System.out.println("El producto de la multiplicación es " + resultado);

        System.out.println("El proceso es:");



        System.out.println("    " + multiplicando);
        System.out.println("  * " + multiplicador);
        System.out.println("________");

        resultado_linea1 = last_number_int * multiplicando;
        String numero = resultado_linea1.toString();
        int espacios = 4 - numero.length();
        String blank = " ".repeat(espacios);
        System.out.println("   " + blank + resultado_linea1);

        resultado_linea2 = middle_number_int * multiplicando;
        numero = resultado_linea2.toString();
        espacios = 4 - numero.length();
        blank = " ".repeat(espacios);
        System.out.println("  " + blank + resultado_linea2);

        resultado_linea3 = first_number_int * multiplicando;
        numero = resultado_linea3.toString();
        espacios = 4 - numero.length();
        blank = " ".repeat(espacios);
        System.out.println(" " + blank + resultado_linea3);

        System.out.println("________");
        System.out.println(" " + resultado);
    }
}

