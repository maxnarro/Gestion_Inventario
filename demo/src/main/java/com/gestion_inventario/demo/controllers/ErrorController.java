package com.gestion_inventario.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

public class ErrorController {
            @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleException(Model model, Exception ex) {
        // Puedes personalizar la lógica para manejar excepciones aquí
        model.addAttribute("error", ex.getMessage());
        return "error"; // Asegúrate de tener una vista llamada "error.html" en tu directorio "templates"
    }
    
}
