package org.example;


import java.util.Scanner;

public class Prectica4 {



    public static void main() {

        Scanner read = new Scanner(System.in);

        int multiplicando = 723;
        int multiplicador = 112;

        String number_string = Integer.toString(multiplicando);

        String middle_number = number_string.substring(1,2);

        int middle_number_int = Integer.parseInt (middle_number);

        System.out.println("Introduce el multiplicando, por favor...");
        multiplicando = read.nextInt();




      //  System.out.println("Resultado: " + middle_number_int*number);
    }
}
