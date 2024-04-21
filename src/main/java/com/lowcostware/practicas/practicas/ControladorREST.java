package com.lowcostware.practicas.practicas;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ControladorREST {
    @Value("${indice.mensaje}")
    private String mensaje;

    @GetMapping("/")
    public String comienzo(Model model) {
        String hola = "Ejecutando Java Spring Boot";
        log.info("Ejecutando controlador MVC");
        model.addAttribute("hola", hola);
        model.addAttribute("mensaje", mensaje);
        return "indice";
    }
}
