package com.informacionRestaurante.index.unit;

import com.informacionRestaurante.index.model.Plato;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PlatoShould {

    @Test
    void create_a_valid_plato_object(){
        // GIVEN
        LinkedList<String> simbolos = new LinkedList<String>();
        simbolos.add("H");   // Huevo
        simbolos.add("C");  // Cereales
        simbolos.add("Aj");  // Ajo
        simbolos.add("P");   // Picante
        simbolos.add("Al");   // Almendras
        simbolos.add("L");   // Leche

        Plato plato = Plato.builder()
                .id(0)
                .nombre("Example")
                .descripcion("Example")
                .imagen("Example.jpg")
                .precio(20.0f)
                .simbolos(simbolos)
                .build();

        // WHEN

        // THEN
        assertNotNull(plato);
        assertThat(plato.getId(), is(0));
    }

    @Test
    void allow_empty_plato_object(){
        // GIVEN
        Plato plato = Plato.builder().build();
        // WHEN
        // THEN
        assertNotNull(plato);
    }
}
