package com.rootstechnology.spring.finances.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegularWelcomeService implements WelcomeService {

    @Autowired
    LocalDateTime timeOfFile;

    @Override
    public String getWelcomeMEssage() {

        return "Welcome from regular business in the timestamp: " + timeOfFile.toString();
    }

}
