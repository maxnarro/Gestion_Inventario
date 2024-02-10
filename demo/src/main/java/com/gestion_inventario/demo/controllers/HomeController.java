package com.gestion_inventario.demo.controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class HomeController {
      @RequestMapping (value = {"/", "/index"}, method = RequestMethod.GET)
    public String index(){
        
        return "index";
    }

    @PostMapping("/inicio")
    public String inicio(Map<String, Object>model){
    
        return "redirect:/dashboard";

    }


    @GetMapping("/login")
    public String login(Map<String, Object>model){
    
        return "login";

    }

 
    
}
