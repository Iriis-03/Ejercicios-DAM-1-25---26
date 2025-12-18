package org.example.PROYECTO_EXPO;

import java.util.Scanner;

/**
 * Programa en el que se cuenta cuántas veces se repite cada nota en una canción introducida por el usuario.
 * @author Iris
 * @version 3.0
 */

public class Teclas_de_Piano {

    /**
     * Entrada: Se le pide al usuario el número de notas y las notas de la canción.
     * Salida: Muestra cuantas veces se ha repetido cada nota (De la nota más baja a la más alta de toda la escala).
     */

    static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        do {
            try {
                System.out.println("Introduce el número de notas de la canción: ");
                int num_notas = Integer.parseInt(read.nextLine()); // Muestra un mensaje de error si el usuario introduce algo que no sea un número
                if (num_notas == 0)
                    break;

                System.out.println("Introduce las notas de la canción (Do#4, Sib3, Sol#5...)");
                String notas = read.nextLine();
                int[] contador_notas = procesar(num_notas, notas);

                for (int i = nota_mas_baja(contador_notas); i <= nota_mas_alta(contador_notas); i++) {
                    System.out.print(contador_notas[i] + " ");
                }
                System.out.println();

            } catch (NumberFormatException e) {
                System.out.println("ERROR: Formato incorrecto.");
                System.out.println("*******************************************");
            }

        } while (true);

    }

    /**
     * Procesa las notas introducidas por el usuario y calcula cuantas veces se repite cada nota en la canción.
     */

    public static int[] procesar(int num_notas, String notas){

        int[] contador_notas = new int[84];

        String[] cancion = notas.split(" ");

        for (int i = 0; i < num_notas; i++) {
            int indice = nota_indice(cancion[i]);
            contador_notas[indice]++;
        }
        return contador_notas;
    }

    /**
     * Convierte una nota en su respectivo índice dentro del array del contador de notas que se repiten.
     */

    public static int nota_indice(String nota_completa){

        try {
            int longitud = nota_completa.length();
            String nota = nota_completa.substring(0, longitud - 1);
            int octava = Integer.parseInt(nota_completa.substring(longitud - 1)); // Muestra un mensaje de error si la nota no termina en un número.
            int i = 0;

            switch (nota){
                case "Do":
                case "Si#":
                    i = 0;
                    break;
                case "Do#":
                case "Reb":
                    i = 1;
                    break;
                case "Re":
                    i = 2;
                    break;
                case "Re#":
                case "Mib":
                    i = 3;
                    break;
                case "Mi":
                case "Fab":
                    i = 4;
                    break;
                case "Mi#":
                case "Fa":
                    i = 5;
                    break;
                case "Fa#":
                case "Solb":
                    i = 6;
                    break;
                case "Sol":
                    i = 7;
                    break;
                case "Sol#":
                case "Lab":
                    i = 8;
                    break;
                case "La":
                    i = 9;
                    break;
                case "La#":
                case "Sib":
                    i = 10;
                    break;
                case "Dob":
                case "Si":
                    i = 11;
                    break;
                default:
                    return 0;
            }

            i += (octava - 1) * 12;
            return i;

        } catch (NumberFormatException e) {
            System.out.println("ERROR: Formato incorrecto.");
            System.out.println("*******************************************");
            return 0;
        }
    }

    /**
     * Localiza la nota más baja en el array del contador de notas que se repiten.
     */

    public static int nota_mas_baja (int[] contador){

        int indice_bajo = -1;

        for (int i = 0; i < contador.length; i++) {
            if (contador[i] != 0){
                indice_bajo = i;
                break;
            }
        }
        return indice_bajo;
    }

    /**
     * Localiza la nota más alta en el array del contador de notas que se repiten.
     */

    public static int nota_mas_alta (int[] contador){

        int indice_alto = -1;

        for (int i = contador.length - 1; i >= 0; i--) {
            if (contador[i] != 0){
                indice_alto = i;
                break;
            }
        }
        return indice_alto;
    }
}

