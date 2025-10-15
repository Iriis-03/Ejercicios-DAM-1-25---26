package org.example.TEMA2;

import java.util.Scanner;

public class Practica1_TEMA2 {

    public void main (){

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa");
        String fecha = read.nextLine();

        String number_string = Integer.toString(Integer.parseInt(fecha));

        String dia = number_string.substring (0,1);
        int dia_int = Integer.parseInt(dia);

        String mes = number_string.substring (4,5);
        int mes_int = Integer.parseInt(mes);

        String anyo = number_string.substring (7,10);
        int anyo_int = Integer.parseInt(mes);

        if (dia_int > 30 || dia_int < 1 ){
            System.out.println("ERROR DE LECTURA EN EL DÍA");
            if (mes_int > 12 || mes_int < 1){
                System.out.println("ERROR DE LECTURA EN EL MES");
                if (anyo_int > 2025 || anyo_int < 1799){
                    System.out.println("ERROR DE LECTURA EN EL AÑO");
                }
            }
        }
    }
}
