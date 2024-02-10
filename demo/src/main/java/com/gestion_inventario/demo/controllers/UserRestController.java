package com.gestion_inventario.demo.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion_inventario.demo.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {
    @GetMapping(path="/details")
    public UserDto details(){

        User user = new User();
        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle(null);
        return userDto;
    }
    

    @GetMapping(path = "/details-map")
    public Map<String, Object>detailsMap(){
        User user= new User();
        Map<String, Object>body = new HashMap<>();

        body.put("title", "Hola Mundo Spring Boot");
        body.put("user", user);
        return body;
    }

}
