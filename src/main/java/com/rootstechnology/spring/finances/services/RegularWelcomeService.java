package com.rootstechnology.spring.finances.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.rootstechnology.spring.finances.configuration.MyLocalDateTime;

@Service
public class RegularWelcomeService implements WelcomeService {

    @Autowired
    MyLocalDateTime timeOfFile;

    @Autowired
    ApplicationContext appContext;

    @Override
    public String getWelcomeMEssage() {

        // return "Welcome from regular business in the timestamp: " + timeOfFile.getTime().toString();
    
        var localDateTimeBean = appContext.getBean(MyLocalDateTime.class);
        return "Welcome from regular business in the timestamp: " + localDateTimeBean.getTime().toString();
    }

}
