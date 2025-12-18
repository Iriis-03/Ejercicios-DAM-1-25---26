package org.example.PROYECTO_EXPO;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Teclas_de_PianoTest {

    @Test
    void testNotaIndice() {
        assertEquals(0, Teclas_de_Piano.nota_indice("Do1"));
        assertEquals(1, Teclas_de_Piano.nota_indice("Do#1"));
        assertEquals(0, Teclas_de_Piano.nota_indice("X9")); // nota inválida
    }

    @Test
    void testProcesar() {
        int[] resultado = Teclas_de_Piano.procesar(3, "Do1 Re1 Mi1");
        assertEquals(1, resultado[0]); // Do1
        assertEquals(1, resultado[2]); // Re1
        assertEquals(1, resultado[4]); // Mi1
    }

    @Test
    void testNotaMasBajaYAlta() {
        int[] contador = new int[84];
        contador[5] = 2;
        contador[10] = 1;
        assertEquals(5, Teclas_de_Piano.nota_mas_baja(contador));
        assertEquals(10, Teclas_de_Piano.nota_mas_alta(contador));
    }
}
