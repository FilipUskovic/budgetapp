package com.BugetApp.bugetApp.controllers;

import com.BugetApp.bugetApp.dto.LoginUserDTO;
import com.BugetApp.bugetApp.dto.RegistrationDTO;
import com.BugetApp.bugetApp.model.User;
import com.BugetApp.bugetApp.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public User registrateUser(@RequestBody RegistrationDTO registrationDTO){
        return authService.registerUser(registrationDTO.getUsername(), registrationDTO.getPassword());
    }

    @PostMapping("/login")
    public LoginUserDTO loginUser(@RequestBody RegistrationDTO body){
        return authService.loginUser(body.getUsername(), body.getPassword());
    }


}
