package com.informacionRestaurante.index.unit;

import com.informacionRestaurante.index.model.Plato;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

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
        LinkedList<String> simbolosAssert = new LinkedList<String>();
        simbolosAssert.add("H");   // Huevo
        simbolosAssert.add("C");  // Cereales
        simbolosAssert.add("Aj");  // Ajo
        simbolosAssert.add("P");   // Picante
        simbolosAssert.add("Al");   // Almendras
        simbolosAssert.add("L");   // Leche

        LinkedList<String> simbolosNotAssert = new LinkedList<String>();
        simbolosNotAssert.add("");   // Huevo
        simbolosNotAssert.add("C");  // Cereales
        simbolosNotAssert.add("Aj");  // Ajo
        simbolosNotAssert.add("P");   // Picante
        simbolosNotAssert.add("Al");   // Almendras
        simbolosNotAssert.add("L");   // Leche

        // THEN
        assertThat(plato.getId(), is(0));
        assertThat(plato.getNombre(), is("Example"));
        assertThat(plato.getDescripcion(), is("Example"));
        assertThat(plato.getImagen(), is("Example.jpg"));
        assertThat(plato.getPrecio(), is(20.0f));
        assertThat(plato.getSimbolos(), is(simbolosAssert));
        assertThat(plato.getSimbolos(), is(not(simbolosNotAssert)));

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
