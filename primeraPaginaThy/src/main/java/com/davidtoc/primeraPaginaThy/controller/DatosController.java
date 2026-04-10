package com.davidtoc.primeraPaginaThy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DatosController {

    @GetMapping("/datos")
    public String mostrarDatos(Model model) {

        model.addAttribute("Nombre", "David Toc");
        model.addAttribute("Edad", 16);

        return "datos";
    }
}