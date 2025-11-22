package org.example.TEMA3.PRACTICAS;

public class Practica3_pruebas {

    static void main() {

        String linea1 = "AAAIAAAI";
        String linea2 = "AAIIAAII";
        char character_1 = ' ';
        char character_2 = ' ';

        for (int i = 0; i < 8; i++) {
            char c = linea1[i];

        }

        if (!linea1.matches("[AI]{" + 8 + "}")) {
            System.out.println("ERROR. Solo se permiten letras A–O");
        }

    }
}
