package org.example;

import java.util.Scanner; // Importa la clase Scanner para leer datos desde el teclado

public class Delegado {

    static void main() {
        Scanner read = new Scanner(System.in); // Crea un objeto Scanner llamado 'read'

        int votosA = 0, votosB = 0, votosC = 0; // Contadores para cada candidato
        int totalVotantes; // Variable para almacenar el número total de votantes

        System.out.print("Ingrese el número total de votantes: ");
        totalVotantes = read.nextInt(); // Lee el número ingresado y lo guarda en totalVotantes

        System.out.println("Candidatos:");
        System.out.println("1. Ana");
        System.out.println("2. Bruno");
        System.out.println("3. Carla");

        for (int i = 1; i <= totalVotantes; i++) { // Bucle para pedir el voto de cada persona
            System.out.print("Voto #" + i + " (1-3): ");
            int voto = read.nextInt(); // Lee el voto ingresado por el usuario

            if (voto == 1) {
                votosA++;
            } else if (voto == 2) {
                votosB++;
            } else if (voto == 3) {
                votosC++;
            } else {
                System.out.println("Voto inválido, no se contará.");
            }
        }

        System.out.println("--- Resultados ---");
        System.out.println("Ana: " + votosA + " votos");
        System.out.println("Bruno: " + votosB + " votos");
        System.out.println("Carla: " + votosC + " votos");

        if (votosA > votosB && votosA > votosC) {
            System.out.println("Ganadora: Ana");
        } else if (votosB > votosA && votosB > votosC) {
            System.out.println("Ganador: Bruno");
        } else if (votosC > votosA && votosC > votosB) {
            System.out.println("Ganadora: Carla");
        } else {
            System.out.println("Hay un empate. Hay que volver a votar.");
        }
    }
}
