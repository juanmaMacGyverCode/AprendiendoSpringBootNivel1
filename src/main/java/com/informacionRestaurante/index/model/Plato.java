package com.informacionRestaurante.index.model;

import lombok.*;

import java.util.LinkedList;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Plato {

    private int id;
    private String nombre;
    private String descripcion;
    private String imagen;
    private float precio;
    private LinkedList<String> simbolos;

}
