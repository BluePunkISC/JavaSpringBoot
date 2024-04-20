package com.lowcostware.practicas.practicas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ControladorREST {
    @GetMapping("/")
    public String comienzo() {
        log.info("Ejecutando controlador REST");
        log.info("Más información");
        return "Proyecto de práctica";
    }
}
