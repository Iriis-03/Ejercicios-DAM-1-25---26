package org.example.PROYECTO_EXPO;

import java.util.Arrays;
import java.util.Scanner;

public class Teclas_de_Piano {

    static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        do {
            System.out.println("Introduce el número de notas de la canción: ");
            String num_notas_string = read.nextLine();
            int num_notas = Integer.parseInt(num_notas_string);
            if (num_notas == 0)
                break;

            System.out.println("Introduce las notas de la canción (Do#4, Sib3, Sol#5...)");

            String notas = read.nextLine(); //Do4 Do4 Re4 Do4 Fa4 Mi4 Fa4
            //String notas = "Do4 Do4 Re4 Do4 Fa4 Mi4 Fa4";
            int[] contador_notas = procesar(num_notas, notas);

            for (int i = nota_mas_baja(contador_notas); i <= nota_mas_alta(contador_notas); i++) {
                System.out.print(contador_notas[i] + " ");
            }
            System.out.println("");


        }while(true);

    }

    public static int[] procesar(int num_notas, String notas){

        int[] contador_notas = new int[84]; //12 notas * 7 octavas

        String[] cancion = notas.split(" ");

        for (int i = 0; i < num_notas; i++) {

            int indice = nota_indice(cancion[i]);
            contador_notas[indice]++;

        }
        return contador_notas;
    }

    public static int nota_indice(String nota_completa){

        int longitud = nota_completa.length();
        String nota = nota_completa.substring(0, longitud - 1);
        int octava = Integer.parseInt(nota_completa.substring(longitud - 1, longitud));
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
        }

        i += (octava - 1) * 12;
        return i;
    }

    public static int nota_mas_baja (int[] contador){

        int indice_bajo = - 1; //Devuelve error

        for (int i = 0; i < contador.length; i++) {
            if (contador[i] != 0){
                indice_bajo = i;
                break;
            }
        }
        return indice_bajo;
    }

    public static int nota_mas_alta (int[] contador){

        int indice_alto = - 1; //Devuelve error

        for (int i = contador.length - 1; i >= 0; i--) {
            if (contador[i] != 0){
                indice_alto = i;
                break;
            }
        }
        return indice_alto;

    }

}
