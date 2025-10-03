package org.example;


import java.util.Scanner;

public class Practica4 {


    public static void main() {

        Scanner read = new Scanner(System.in);

        int multiplicando;
        int multiplicador;
        int number = 0;
        int Resultado = 0;

        System.out.println("Introduce el multiplicando (3 cifras)");
        multiplicando = read.nextInt();

        System.out.println("Introduce el multiplicador (3 cifras)");
        multiplicador = read.nextInt();

        String number_string = Integer.toString(multiplicando);

        String first_number = number_string.substring(0,1);
        int first_number_int = Integer.parseInt (first_number);

        String middle_number = number_string.substring(1,2);
        int middle_number_int = Integer.parseInt (middle_number);

        String last_number = number_string.substring(2,3);
        int last_number_int = Integer.parseInt (last_number);


        System.out.println("El producto de la multiplicación es " + Resultado);
        Resultado = read.nextInt();

        System.out.println("Resultado: " + first_number_int * number);
        System.out.println("Resultado: " + middle_number_int * number);
        System.out.println("Resultado: " + last_number_int * number);

      //  System.out.println("Resultado: " + middle_number_int*number);
    }
}
