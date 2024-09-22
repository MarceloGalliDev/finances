package com.rootstechnology.spring.finances.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rootstechnology.spring.finances.services.WelcomeService;

@RestController
public class WelcomeRestController {

    @Autowired
    WelcomeService welcomeService;

    @GetMapping("/welcome")
    public String welcome() {
        return welcomeService.getWelcomeMEssage();
    }
}
