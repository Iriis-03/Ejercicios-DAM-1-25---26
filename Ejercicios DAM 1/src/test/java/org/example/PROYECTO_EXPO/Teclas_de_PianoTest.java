package org.example.PROYECTO_EXPO;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Teclas_de_PianoTest {

    //índice 0
    @Test
    public void testNotaIndiceDo1() {
        assertEquals(0, Teclas_de_Piano.nota_indice("Do1"));
    }

    //índice 2
    @Test
    public void testNotaIndiceRe1() {
        assertEquals(2, Teclas_de_Piano.nota_indice("Re1"));
    }

    //índice 9 + 12 (octava 2) = 21
    @Test
    public void testNotaIndiceLa2() {
        assertEquals(21, Teclas_de_Piano.nota_indice("La2"));
    }

    //índice 8 + 24 (octava 3) = 32
    @Test
    public void testNotaIndiceSolSostenido3() {
        assertEquals(32, Teclas_de_Piano.nota_indice("Sol#3"));
    }

    //Busca el primer valor distinto a 0 que este caso sería el 5 en la posición 2 (recorre el vector de izquierda a derecha)
    @Test
    public void testNotaMasBaja() {
        int[] vector = {0, 0, 5, 3, 0};
        assertEquals(2, Teclas_de_Piano.nota_mas_baja(vector));
    }

    //Busca el primer valor distinto a 0 que este caso sería el 7 en la posición 4 (recorre el vector de derecha a izquierda)
    @Test
    public void testNotaMasAlta() {
        int[] vector = {0, 4, 0, 2, 7};
        assertEquals(4, Teclas_de_Piano.nota_mas_alta(vector));
    }

}
