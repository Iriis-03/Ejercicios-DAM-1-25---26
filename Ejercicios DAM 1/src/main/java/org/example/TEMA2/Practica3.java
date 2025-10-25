    package org.example.TEMA2;

    import java.util.Scanner;

    public class Practica3 {

        static void main() {

            Scanner read = new Scanner(System.in);

            System.out.println("Introduzca ISBN: ");
            String ISBN = read.nextLine().toUpperCase();

            System.out.println("---------------------");
            System.out.println("*VALIDADOR ISBN*");
            System.out.println("[1] - Validar ISBN");
            System.out.println("[2] - Reparar ISBN");
            System.out.println("[x] - Salir");
            System.out.println("---------------------");

            String menu = read.nextLine();


            int cifra;

            char c;

            int suma = 0;

            int longitud = ISBN.length();

            if (longitud != 11 && longitud != 10) {
                System.out.println("Error de formato, introduce la longitud correcta:");
            } else {
                switch (menu) {

                    case "1":


                        for (int i = 0; i <= 9; i++) {

                            c = ISBN.charAt(i);

                            cifra = Integer.parseInt(String.valueOf(c));

                            suma = suma + cifra * (10 - i);

                        }

                        if (longitud == 11)
                            if (ISBN.charAt(10) == 'X') {
                                suma = suma + 10;
                            }

                        int multiplo = suma % 11;

                        if (multiplo == 0) {
                            System.out.println("El ISBN es válido");

                        } else {
                            System.out.println("El ISBN no es válido");
                        }

                    case "2":
                        int posicion=0;
                        for (int i = 0; i <= 9; i++) {

                            c = ISBN.charAt(i);
                            if (c == '?')
                                posicion = i;
                            else {
                                cifra = Integer.parseInt(String.valueOf(c));
                                suma = suma + cifra * (10 - i);
                            }
                        }
                        if (longitud == 11)
                            if (ISBN.charAt(10) == 'X') {
                                suma = suma + 10;
                            }
                        int resto = suma % 11;
                        int x = (((11 - resto)*11 / (posicion+1))-1)%11;
                        System.out.println("El número que faltaba es " + x);

                        break;
                    default:
                        break;
                }
            }
        }
    }