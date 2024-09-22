package com.rootstechnology.spring.finances.services;

import org.springframework.stereotype.Service;

@Service
public class RegularWelcomeService implements WelcomeService {

    @Override
    public String getWelcomeMEssage() {

        return "Welcome from regular business";
    }

}
