package org.example.TEMA3.ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

    static void main() {

        Scanner read = new Scanner(System.in);

        int vector [] = {2,3,5,1,6};

        int filtrado [] = new int [vector.length - 1];

        int borrar = 2;

        System.out.println("Introduce la posición del número que quieres eliminar: ");
        int posicion = read.nextInt();

        for (int i = 0; i < filtrado.length; i++){

            if (i >= borrar){
                filtrado[i] = vector [i + 1];
            } else {
                filtrado[i] = vector [i];
            }
        }

        System.out.println(Arrays.toString(vector));
    }
}
