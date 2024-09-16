package com.rootstechnology.spring.hiddencontrollers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HiddenRestController {

    @GetMapping("/hidden")
    public String hi() {
        return "olá, esconderijo";
    }
    
}
