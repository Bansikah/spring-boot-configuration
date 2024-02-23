package com.bansikah.properties.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("german")
public class GreetingServiceGerman  implements GreetingService{

    public String sayHello(String name){
        return "Helo " +name;
    }
}
