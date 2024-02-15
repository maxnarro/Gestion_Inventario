package com.gestion_inventario.sgi.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
@RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
public String index() {
    return "index"; // Retorna el nombre de la vista Thymeleaf (index.html)
}

    @GetMapping("/login")
    public String login() {
        return "login"; // Retorna el nombre de la vista Thymeleaf (login.html)
    }

 
    
}
