package org.example;

import java.util.Scanner;

public class Ejercicio1 {

    static void main() {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce las horas trabajadas, por favor");
        double horas = read.nextDouble();

        System.out.println("Introduce la tarifa por hora, por favor");
        double tarifa = read.nextDouble();

        double salario = horas * tarifa;

        System.out.println("Salario: " + salario + "€");
    }
}

