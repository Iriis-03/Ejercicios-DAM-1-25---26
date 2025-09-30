package org.example;

import java.util.Scanner;

public class Ejercicio3 {

    static void main() {

        Scanner read = new Scanner(System.in);
        int number = 0;

        try {
            System.out.println("Introduce un número, por favor");
            number = read.nextInt();
        } catch (Exception e){
            System.out.println("El formato no es de texto");
        }
        if (number > 0) {
            System.out.println(number + " Es positivo");
        }

        else if (number<0) {
            System.out.println(number + " Es negativo");
        }
        else {
            System.out.println(number + " Es natural");
        }
    }
}
