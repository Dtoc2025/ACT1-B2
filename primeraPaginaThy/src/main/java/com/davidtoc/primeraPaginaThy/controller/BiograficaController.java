package com.davidtoc.primeraPaginaThy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class BiograficaController {

    @GetMapping("/biografia")
    public String mostrarBiografia(Model model) {

        // Información personal
        model.addAttribute("nombre", "David Toc");
        model.addAttribute("edad", 21);
        model.addAttribute("ubicacion", "Guatemala. Mixco");
        model.addAttribute("email", "dtoc@kinal.edu.gt");
        model.addAttribute("telefono", "846-846");
        model.addAttribute("profesion", "Futuro ingeniero (si Dios quiere)");

        //foto
        model.addAttribute("fotoUrl", " ");

        // Biografía
        model.addAttribute("biografia", "en la creación de aplicaciones web innovadoras");

        // habilidades
        List<String> habilidades = Arrays.asList("Java", "Spring Boot", "JavaScript");
        model.addAttribute("habilidades", habilidades);

        List<Experiencia> experiencias = Arrays.asList(
                new Experiencia("estudiante", "2023 - Presente", "kinal", "Desarrollo de apps primerisas y buenas :v")
        );
        model.addAttribute("experiencias", experiencias);

        List<Educacion> educaciones = Arrays.asList(
                new Educacion("2026", " Informática", "Kinal", "Calificación: ps normal")
        );
        model.addAttribute("educaciones", educaciones);

        List<Idioma> idiomas = Arrays.asList(
                new Idioma("Español", "Nativo"),
                new Idioma("Inglés", "nivel 1")
        );
        model.addAttribute("idiomas", idiomas);

        return "biografia";
    }

    // Tus clases internas...
    public static class Experiencia {
        public String titulo;
        public String periodo;
        public String empresa;
        public String descripcion;
        public Experiencia(String titulo, String periodo, String empresa, String descripcion) {
            this.titulo = titulo; this.periodo = periodo; this.empresa = empresa; this.descripcion = descripcion;
        }
    }

    public static class Educacion {
        public String año;
        public String titulo;
        public String institucion;
        public String descripcion;
        public Educacion(String año, String titulo, String institucion, String descripcion) {
            this.año = año; this.titulo = titulo; this.institucion = institucion; this.descripcion = descripcion;
        }
    }

    public static class Idioma {
        public String nombre;
        public String nivel;
        public Idioma(String nombre, String nivel) {
            this.nombre = nombre; this.nivel = nivel;
        }
    }
}
