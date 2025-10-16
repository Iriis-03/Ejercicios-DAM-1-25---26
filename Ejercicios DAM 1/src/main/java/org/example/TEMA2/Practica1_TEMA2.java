package org.example.TEMA2;

import java.util.Scanner;

public class Practica1_TEMA2 {

    public void main (){

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa");
        String fecha = read.nextLine();

        if (fecha.charAt(2) != '/' || fecha.charAt(5) != '/') {
            System.out.println("El formato no es correcto. Usa /");
        } else {

            try {
                String dia_string = fecha.substring(0, 2);
                String mes_string = fecha.substring(3, 5);
                String anyo_string = fecha.substring(6, 10);

                int dia_int = Integer.parseInt(dia_string);
                int mes_int = Integer.parseInt(mes_string);
                int anyo_int = Integer.parseInt(anyo_string);

                if (dia_int > 30 || dia_int < 1 ) {
                    System.out.println("ERROR DE LECTURA. DÍA INCORRECTO");
                }else if (mes_int > 12 || mes_int < 1) {
                    System.out.println("ERROR DE LECTURA. MES INCORRECTO");
                }else if (anyo_int > 2025 || anyo_int < 1900){
                    System.out.println("ERROR DE LECTURA. AÑO INCORRECTO");
                } else {

                    int suma = dia_int + mes_int + anyo_int;
                    System.out.println(dia_int + " + " + mes_int + " + " + anyo_int + " = " + suma);

                    String suma_string = Integer.toString(suma);

                    int cifra1 = Integer.parseInt(suma_string.substring(0, 1));
                    int cifra2 = Integer.parseInt(suma_string.substring(1, 2));
                    int cifra3 = Integer.parseInt(suma_string.substring(2, 3));
                    int cifra4 = Integer.parseInt(suma_string.substring(3, 4));

                    int resultado = cifra1 + cifra2 + cifra3 + cifra4;

                    System.out.println (cifra1 + " + " + cifra2 + " + " + cifra3 + " + " + cifra4 + " = " + resultado);

                    System.out.println("Tu número de la suerte es: " + resultado);
                }
                }
            }
        }
    }
}
