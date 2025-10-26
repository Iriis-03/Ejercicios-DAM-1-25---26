    package org.example.TEMA2;

    import java.util.Scanner;

    public class Practica3 {

        static void main() {

            Scanner read = new Scanner(System.in);

            int cifra;

            char c;

            int suma = 0;

            String ISBN;
            int longitud;

            boolean salir = false;


            do {


                    System.out.println("---------------------");
                    System.out.println("*VALIDADOR ISBN*");
                    System.out.println("[1] - Validar ISBN");
                    System.out.println("[2] - Reparar ISBN");
                    System.out.println("[x] - Salir");
                    System.out.println("---------------------");

                    String menu = read.nextLine();

                    switch (menu) {

                        case "1":

                            System.out.println("Introduzca ISBN: ");
                            ISBN = read.nextLine().toUpperCase();

                            longitud = ISBN.length();

                            if (longitud != 11 && longitud != 10) {
                                System.out.println("Error de formato, introduce la longitud correcta:");
                                break;
                            }

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
                            break;

                        case "2":

                            System.out.println("Introduzca ISBN: ");
                            ISBN = read.nextLine().toUpperCase();

                            longitud = ISBN.length();

                            if (longitud != 11 && longitud != 10) {
                                System.out.println("Error de formato, introduce la longitud correcta:");
                                break;
                            }

                            int posicion = 0;
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

                            for (int i = 0; i < 10; i++) {
                                if ((suma + i * (10 - posicion)) % 11 == 0) {

                                    System.out.println("El ISBN correcto es " + ISBN.replace('?', (char) (i + '0')));
                                    break;
                                }
                            }
                            break;

                        case "x":
                            salir = true;
                            break;
                        default:
                    }
            } while (! salir);
        }
    }