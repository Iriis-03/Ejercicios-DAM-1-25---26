package org.example.TEMA2;

import java.util.Scanner;

public class hasNextInt {

    static void main() {

        Scanner read = new Scanner(System.in);

        if (read.hasNextInt()){
            int numero = read.nextInt();
            System.out.println(numero);
        }else{
            System.out.println("ERROR formato incorrecto. No es un número.");
        }
    }
}
