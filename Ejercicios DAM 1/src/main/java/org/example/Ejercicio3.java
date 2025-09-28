package org.example;

import java.util.Scanner;

public class Ejercicio3 {

    static void main() {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce un número, por favor");
        int number = read.nextInt();

        if (number>0) {
            System.out.println("Es positivo");
        }

        if (number<0) {
            System.out.println("Es negativo");
        }

        if (number==0) {
            System.out.println("Es natural");
        }
    }
}
