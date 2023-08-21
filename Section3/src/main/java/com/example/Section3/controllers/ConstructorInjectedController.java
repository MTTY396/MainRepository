package com.example.Section3.controllers;

import com.example.Section3.services.GreetingServices;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller

public class ConstructorInjectedController {

    private  final GreetingServices greetingServices;

    public ConstructorInjectedController(@Qualifier("greetingServicesImpl") GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String sayHello(){
        return  greetingServices.sayGreeting();
    }
}
