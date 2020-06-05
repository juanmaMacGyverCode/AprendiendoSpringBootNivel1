package com.informacionRestaurante.index.controller.functionsUtils;

import com.informacionRestaurante.index.model.Plato;

import java.util.LinkedList;

public class UtilitiesPlatos {

    public static LinkedList<Plato> crearPlatos() {
        LinkedList<Plato> listaPlatos = new LinkedList<Plato>();
        LinkedList<String> simbolos = new LinkedList<String>();
        simbolos.add("");   // Huevo
        simbolos.add("C");  // Cereales
        simbolos.add("Aj");  // Ajo
        simbolos.add("");   // Picante
        simbolos.add("");   // Almendras
        simbolos.add("");   // Leche

        listaPlatos.add(Plato.builder()
                .id(0)
                .nombre("Gazpacho de Remolacha y Albahaca")
                .descripcion("Rico gazpacho cocinado con tomate, remolacha, pimiento, pepino, ajo, sesamo, aceite y vinagra de manzana.")
                .imagen("gazpachoRemolacha.jpg")
                .precio(10.00f)
                .simbolos(simbolos)
                .build());

        simbolos = new LinkedList<String>();
        simbolos.add("");
        simbolos.add("C");
        simbolos.add("");
        simbolos.add("");
        simbolos.add("");
        simbolos.add("");

        listaPlatos.add(Plato.builder()
                .id(1)
                .nombre("Boquerones Escabechados")
                .descripcion("Entrante ligero y con sabor a mas con cebolla, zanahoria, aceite de oliva, azucar, curcuma, vino blanco, vinagre blanco, semolin, sal y boquerones decorado con lechuga.")
                .imagen("boqueronesEscabechados.jpg")
                .precio(12.00f)
                .simbolos(simbolos)
                .build());

        simbolos = new LinkedList<String>();
        simbolos.add("");
        simbolos.add("C");
        simbolos.add("");
        simbolos.add("");
        simbolos.add("");
        simbolos.add("");

        listaPlatos.add(Plato.builder()
                .id(2)
                .nombre("Ensalada de pasta con boquerones secos")
                .descripcion("Plato principal veraniego elaborado con macarrones, tomates secos en aceite, sal, pimienta, aceite de oliva virgen extra y pesto.")
                .imagen("ensaladaPastaTomatesSecos.jpg")
                .precio(14.00f)
                .simbolos(simbolos)
                .build());

        simbolos = new LinkedList<String>();
        simbolos.add("");
        simbolos.add("C");
        simbolos.add("Aj");
        simbolos.add("P");
        simbolos.add("");
        simbolos.add("L");

        listaPlatos.add(Plato.builder()
                .id(3)
                .nombre("Ensalada de garbanzos estilo árabe")
                .descripcion("Plato veraniego elaborado con garbanzos, yogur griego, ajo, tahini, sal, pan pita, piñones, semillas de granada, pepino, tomate, cebolleta, menta, perejil, aceite, zumo de limón, pimienta, comino y pimienta cayena.")
                .imagen("ensaladaGarbanzosArabe.jpg")
                .precio(11.00f)
                .simbolos(simbolos)
                .build());

        //////////////

        simbolos = new LinkedList<String>();
        simbolos.add("H");
        simbolos.add("");
        simbolos.add("Aj");
        simbolos.add("");
        simbolos.add("");
        simbolos.add("");

        listaPlatos.add(Plato.builder()
                .id(4)
                .nombre("Fideos Dorados con Bonito y Espinacas")
                .descripcion("Plato con influencia italiana con fideos, caldo de marisco, azafrán, ajo, tomate, lomo de bonito, espinacas, sal, huevo, cebolleta y aceite oliva virgen extra.")
                .imagen("fideosDoradosConBonitoEspinacas.jpg")
                .simbolos(simbolos)
                .precio(16.00f)
                .build());

        simbolos = new LinkedList<String>();
        simbolos.add("H");
        simbolos.add("C");
        simbolos.add("Aj");
        simbolos.add("");
        simbolos.add("");
        simbolos.add("L");

        listaPlatos.add(Plato.builder()
                .id(5)
                .nombre("Buñuelos egipcios de habas y hierbabuena")
                .descripcion("Plato árabe elaborado con habas secas, ajo, puerro, cebolla morada, lima, levadura, comino en polvo, aceite de oliva virgen extra, sésamo, hierbabuena, perejil, pimienta, sal, mahonesa y yogur natural.")
                .imagen("bunuelosEgipciosHabas.jpg")
                .precio(9.00f)
                .simbolos(simbolos)
                .build());

        simbolos = new LinkedList<String>();
        simbolos.add("H");
        simbolos.add("");
        simbolos.add("");
        simbolos.add("");
        simbolos.add("Al");
        simbolos.add("L");

        listaPlatos.add(Plato.builder()
                .id(6)
                .nombre("Tartaletas de Fresones con Mermelada Casera")
                .descripcion("Plato postre veraniego elaborado con almendras crudas, harina, mantequilla, huevo, azucar, sal, fresones, moras, frambuesas, arándanos y grosellas.")
                .imagen("tartaletaFresonesMermelada.jpg")
                .precio(8.00f)
                .simbolos(simbolos)
                .build());

        simbolos = new LinkedList<String>();
        simbolos.add("");
        simbolos.add("");
        simbolos.add("");
        simbolos.add("");
        simbolos.add("");
        simbolos.add("L");

        listaPlatos.add(Plato.builder()
                .id(7)
                .nombre("Crepes Rellenos de Nata y Frutos Rojos")
                .descripcion("Delicioso postre elaborado con harina, huevos, leche, mantequilla, ron, nata para montar, azúcar, mix de frutos rojos, sal, limón y agua.")
                .imagen("crepesRellenosNataFrutosRojos.jpg")
                .precio(7.00f)
                .simbolos(simbolos)
                .build());

        simbolos = new LinkedList<String>();
        simbolos.add("H");
        simbolos.add("C");
        simbolos.add("Aj");
        simbolos.add("");
        simbolos.add("");
        simbolos.add("");

        listaPlatos.add(Plato.builder()
                .id(8)
                .nombre("Ramen exprés de cerdo")
                .descripcion("Deliciosa sopa japonesa elaborado con solomillo, caldo de pollo, repollo, champiñones, salsa de soja, cebolleta, huevo, vino blanco, fideos ramen, sésamo, aceite de oliva virgen extra y sal.")
                .imagen("ramenExpresCerdo.jpg")
                .precio(10.00f)
                .simbolos(simbolos)
                .build());

        simbolos = new LinkedList<String>();
        simbolos.add("H");
        simbolos.add("");
        simbolos.add("Aj");
        simbolos.add("");
        simbolos.add("");
        simbolos.add("");

        listaPlatos.add(Plato.builder()
                .id(9)
                .nombre("Cebolla rellena de carne")
                .descripcion("Plato de guarnición elaborado con cebolla, carne picada de ternera y cerdo, sal de ajo, huevo, pan rallado, pimienta en polvo, tomate frito, tomillo o romero, sal, aceite de oliva virgen extra y tomillo fresco.")
                .imagen("cebollaRellenaCarne.jpg")
                .precio(12.50f)
                .simbolos(simbolos)
                .build());

        simbolos = new LinkedList<String>();
        simbolos.add("H");
        simbolos.add("");
        simbolos.add("");
        simbolos.add("");
        simbolos.add("");
        simbolos.add("");

        listaPlatos.add(Plato.builder()
                .id(10)
                .nombre("Sopa de salmón y verduras con huevo")
                .descripcion("Plato veraniego elaborado con pescado y marisco, salsa de soja, puerro, zanahoria, cebolleta, judías verdes, lomo de salmón, sésamo, fideos de arroz, lima, cilantro o perejil, sal, huevo y aceite de oliva virgen extra.")
                .imagen("sopaSalmonVerdurasHuevo.jpg")
                .precio(13.00f)
                .simbolos(simbolos)
                .build());

        simbolos = new LinkedList<String>();
        simbolos.add("");
        simbolos.add("");
        simbolos.add("Aj");
        simbolos.add("P");
        simbolos.add("");
        simbolos.add("");

        listaPlatos.add(Plato.builder()
                .id(11)
                .nombre("Taboulé de invierno")
                .descripcion("Delicioso plato árabe elaborado con sémola de trigo, caldo de ave, brócoli, calabaza, berenjena, calabacín, limón, ajo, semillas de mostaza, aceite de oliva virgen extra, piñones, pimentón, comino, sal y brotes de soja.")
                .imagen("tabouleInvierno.jpg")
                .precio(14.00f)
                .simbolos(simbolos)
                .build());

        /*simbolos = new LinkedList<String>();
        simbolos.add("");
        simbolos.add("");
        simbolos.add("");
        simbolos.add("");
        simbolos.add("");
        simbolos.add("X");

        listaPlatos.add(Plato.builder()
                .id(12)
                .nombre("Calabacines con bechamel de verduras y queso Brie")
                .descripcion("Plato entrante elaborado con calabacín, puerro, cebolla, zanahoria, pimiento rojo, harina, aceite de oliva, leche, queso Brie, sal y pimienta.")
                .imagen("calabacinesBechamelVerdurasBrie.jpg")
                .simbolos(simbolos)
                .build());
        */

        return listaPlatos;
    }
}
