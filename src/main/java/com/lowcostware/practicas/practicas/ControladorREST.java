package com.lowcostware.practicas.practicas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ControladorREST {
    @GetMapping("/")
    public String comienzo() {
        log.info("Ejecutando controlador MVC");
        return "indice";
    }
}
