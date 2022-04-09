package com.example.licenta.controllers;

import com.example.licenta.entities.Cont;
import com.example.licenta.services.LogInServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogInController {

    public LogInServices logInServices;

    @GetMapping("/cont")
    public Cont getCont() {
        Cont cont = new Cont();
        cont.setPin("1234");
        return cont;
        //logInServices.
    }
}
