package org.example.TEMA3.ARRAYS;

import java.util.Arrays;

public class array_teoria {

    static void main() {

        int[] vector = {6, 8, 7, 3, 2};
        System.out.println(Arrays.toString(vector)); //Pasar el vector de int a String
        System.out.println("La longitud del vector es: " + vector.length);
        System.out.println("El segundo vector es: " + vector [1]);
        vector [1] = 10; //Se reemplaza el vector 8, que está en la primera posición, por 10
        System.out.println(vector [1]);
        System.out.println("El segundo vector ha cambiado a: " + vector [1]);

        String [] vector2 = new String [5];
        System.out.println(Arrays.toString(vector2)); //Da null
        System.out.println(vector2); //Da la dirección de memoria (vector = vector2;)

        //Clonar un vector
        int [] vector4 = new int[5];
        vector4 = vector.clone();
        System.out.println(vector4);
        System.out.println(Arrays.toString(vector4));

        for (int i = 0; i < vector.length; i++){
            System.out.println(vector[i]);
        }

        //Imprime los vectores de la última posición a la primera
        for (int i = vector.length - 1; i >= 0; i--){
            System.out.println(vector[i]);
        }
    }
}
