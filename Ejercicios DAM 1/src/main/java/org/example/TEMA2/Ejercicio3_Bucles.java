package org.example.TEMA2;

public class Ejercicio3_Bucles {

    static void main() {

        for (int i = 1;i <= 50;i++) {

            if (i % 3 != 0){
                continue;
            }

            System.out.println(i);
        }
    }
}
