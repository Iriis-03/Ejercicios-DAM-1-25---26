package org.example.Pruebas_para_practicar;

import java.util.Arrays;

public class notas_clase_matriz {

    static void main(String[] args) {

        //Problema d’arrays – nivell mitjà-alt (sense herència, sense trampes)
        //📌 Context
        //Tens les notes de diversos alumnes en diverses assignatures.
        //Cada fila és un alumne. Cada columna, una assignatura.
        //Copiar código
        //Java

        //};
        //🎯 Objectius (ara sí, treballar):
        //1️⃣ Mitjana per alumne
        //Calcula la mitjana de cada alumne i guarda-la en un double[].
        //2️⃣ Mitjana per assignatura
        //Calcula la mitjana de cada assignatura (columna).
        //3️⃣ Alumne amb millor mitjana
        //Mostra quin alumne (índex) té la millor mitjana.
        //4️⃣ Assignatura més difícil
        //Troba l’assignatura amb la mitjana més baixa.
        //5️⃣ Comptar aprovats per alumne
        //Crea un int[] amb el nombre d’assignatures aprovades (≥5) per cada alumne.
        //6️⃣ Filtrar alumnes “en risc” ⚠️
        //Un alumne està en risc si:
        //Té 2 o més suspesos, o
        //La seua mitjana és menor de 5
        //Crea un boolean[] indicant si cada alumne està en risc.

        int[][] notas = {
                {7, 5, 6, 8},
                {4, 3, 5, 6},
                {9, 8, 10, 9},
                {6, 5, 4, 5},
                {2, 3, 1, 4}};

        System.out.println(Arrays.toString(media(notas)));
        /*System.out.println(aprobados(notas));
        System.out.println(suspensos(notas));
        System.out.println(Arrays.toString(nota_alta_baja(notas)));
        System.out.println(Arrays.toString(notas_aprobadas(notas)));*/


    }

    public static double[] media(int[][] notas) {

        double[] suma = new double[notas.length];
        double[] media = new double[notas.length];

        for (int i = 0; i < notas.length; i++) {

            for (int j = 0; j < notas[i].length; j++) {
                suma[i] += notas[i][j];
            }
            media[i] = suma[i] / notas.length;
        }
            return media;
    }

    public static int aprobados(int[] notas) {

        int aprobados = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                aprobados++;
            }
        }
        return aprobados;
    }

    public static int suspensos(int[] notas) {

        int suspensos = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 5) {
                suspensos++;
            }
        }
        return suspensos;
    }

    public static int[] nota_alta_baja(int[] notas) {

        int nota_mas_alta = 0;
        int nota_mas_baja = 10;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > nota_mas_alta) {
                nota_mas_alta = notas[i];
            }
            if (notas[i] < nota_mas_baja) {
                nota_mas_baja = notas[i];
            }
        }
        return new int[]{nota_mas_alta, nota_mas_baja};
    }

    public static int[] notas_aprobadas(int[] notas) {

        int[] notas_aprobadas = new int[notas.length];
        int aprobados = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                notas_aprobadas[aprobados++] = notas[i];
            }
        }
        int[] notas_definitivas = new int[aprobados];
        for (int i = 0; i < aprobados; i++) {

            notas_definitivas[i] = notas_aprobadas[i];

        }
        return notas_definitivas;
    }
}