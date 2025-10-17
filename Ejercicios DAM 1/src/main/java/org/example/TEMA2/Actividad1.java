package org.example.TEMA2;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad1 {

    static void main() {

        Scanner read = new Scanner(System.in);

        boolean seguir = true;
        final int ANYO_MINIMO = 1900;
        int modo = 0;
        int edad = 0;
        LocalDateTime fecha = LocalDateTime.now();
        int anyo_actual = fecha.getYear();

        int anyo_nacimiento_int = 0;

        System.out.println("Elige un modo...");
        System.out.println("                         ");
        System.out.println("[1] - Año de nacimiento");
        System.out.println("[2] - Edad");
        System.out.println("-----------------------");
        if (read.hasNextInt()) {
            modo = read.nextInt();
        } else {
            System.out.println("Valor del modo incorrecto.");
            seguir = false;
        }

        if (seguir) {

            if (modo == 1) {

                System.out.println("Introduce tu año de nacimiento: ");
                String anyo_nacimiento = read.next();

                try {
                    anyo_nacimiento_int = Integer.parseInt(anyo_nacimiento);
                } catch (NumberFormatException e) {
                    System.out.println("El formato no es númerico.");
                    return;
                }



            }
            else if(modo ==2)

            {

                System.out.println("Introduce tu edad:");

                if (read.hasNextInt()) {
                    edad = read.nextInt();
                }

            } else{
                System.out.println("El modo introducido no es correcto. (númerico)");
                return;
            }

            if(edad >=0){
                anyo_nacimiento_int = anyo_actual - edad;
            } else

            {
                System.out.println("El modo introducido no es correcto");
                return;

        }

    }
        if (anyo_nacimiento_int >= ANYO_MINIMO && anyo_nacimiento_int <= anyo_actual) {

            if (anyo_nacimiento_int <= 1927) {
                System.out.println("Generación sin bautizar.");
            } else if (anyo_nacimiento_int >= 1928 && anyo_nacimiento_int <= 1944) {
                System.out.println("Generación silent");
            } else if (anyo_nacimiento_int >= 1945 && anyo_nacimiento_int <= 1964) {
                System.out.println("Baby boomer");
            } else if (anyo_nacimiento_int >= 1965 && anyo_nacimiento_int <= 1982) {
                System.out.println("Generación X");
            } else if (anyo_nacimiento_int >= 1982 && anyo_nacimiento_int <= 1994) {
                System.out.println("Millenials la mejor");
            } else {
                System.out.println("Generación Z");
            }

        }
    }
}
