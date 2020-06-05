package com.informacionRestaurante.index.controller;

import com.informacionRestaurante.index.configuration.FilesHTML;
import com.informacionRestaurante.index.controller.functionsUtils.UtilitiesPlatos;
import com.informacionRestaurante.index.model.Plato;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.LinkedList;

@Controller
public class ControllerHome {

    @GetMapping("/")
    public String showIndex(Model model) {
        LinkedList<Plato> listaPlatos = UtilitiesPlatos.crearPlatos();
        //LinkedList<Plato> mostrarPlatos = new LinkedList<Plato>();

        /*int valorRandom = (int) Math.floor(Math.random()*(listaPlatos.size()-4 + 1));
        mostrarPlatos.add(listaPlatos.get(valorRandom));
        mostrarPlatos.add(listaPlatos.get(valorRandom + 1));
        mostrarPlatos.add(listaPlatos.get(valorRandom + 2));
        mostrarPlatos.add(listaPlatos.get(valorRandom + 3));*/

        model.addAttribute("listaPlatos", listaPlatos);
        return FilesHTML.INDEX;
    }

    @GetMapping("/menu")
    public String showMenu(Model model) {
        LinkedList<Plato> listaPlatos = UtilitiesPlatos.crearPlatos();
        model.addAttribute("listaPlatos", listaPlatos);
        return FilesHTML.MENU;
    }
}
