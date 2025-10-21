package org.example.TEMA2;

import java.util.Scanner;

public class Practica2 {

    static void main() {

        Scanner read = new Scanner(System.in);

        double operando1 = 0;
        double operando2 = 0;
        String operacion = "";

        System.out.println("**** BIENVENIDO A LA CALCULADORA RÁPIDA ****");

        System.out.println("> Introduce operando:");
        operando1 = read.nextDouble();
        read.nextLine();

        System.out.println("------------------------");

        System.out.println("[+] -> sumar");
        System.out.println("[-] -> restar");
        System.out.println("[x] -> multiplicar");
        System.out.println("[/] -> dividir");
        System.out.println("[R] -> raíz cuadrada");

        System.out.println("------------------------");

        System.out.println("Elige una operación:");
        operacion = read.nextLine();

        System.out.println("> Introduce el segundo operando:");
        operando2 = read.nextDouble();

        double resultado = 0;

        switch (operacion) {

            case "+":
                resultado = operando1 + operando2;
                System.out.println(operando1 + "+" + operando2);
                break;
            case "-":
                resultado = operando1 - operando2;
                System.out.println(operando1 + "-" + operando2);
                break;
            case "x":
                resultado = operando1 * operando2;
                System.out.println(operando1 + "x" + operando2);
                break;
            case "/":
                resultado = operando1 / operando2;
                System.out.println(operando1 + "/" + operando2);
                break;
            case "R":
                resultado =  Math.sqrt(operando1);
                System.out.println();
                break;

            default:
            System.out.println("La operación introducida no es correcta.");
            break;
        }
    }
}
