package org.example.insti;

import lombok.*;

@Getter @Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Curso {

    @NonNull
    private String nombre;
    private int horas;

    public Curso(@NonNull String nombre) {
        this.nombre = nombre;
    }


}
